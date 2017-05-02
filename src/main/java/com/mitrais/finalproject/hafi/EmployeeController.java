package com.mitrais.finalproject.hafi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * @author trainee Hafi
 * Employee Controller
 */
@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository er;
	/**
	 * constructor with no parameter
	 */
	public EmployeeController(){
		new ArrayList<Employee>();
		
	}
	/**
	 * get method to get all of the employees in the database
	 * @return list<employee>
	 */
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	@ResponseBody
	public List<Employee> getEmployees(){
		
		return (List<Employee>) er.findAll();
	}
	/**
	 * post method to insert employee into database
	 * @param Employee e
	 */
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	@ResponseBody
	public void addEmployee(@RequestBody Employee e){
		er.save(e);
	}
	/**
	 * get method to get specified employee from database
	 * @param long id
	 * @return Employee
	 */
	@RequestMapping(value="/employees/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Employee getEmployee(@PathVariable long id){
			if(er.findOne(id)!=null){
			return er.findOne(id);
			}
			else{
				throw new EmployeeNotFoundException();
			}
	}
	/**
	 * delete method to delete specified employee from database
	 * @param long id
	 */
	@RequestMapping(value="/employees/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteEmployee(@PathVariable long id){
			if(er.findOne(id)!=null){
			er.delete(id);
			}
			else{
				throw new EmployeeNotFoundException();
			}
	}
	/**
	 * update method to update the data of specified employee
	 * @param long id
	 * @param employee e
	 */
	@RequestMapping(value="/employees/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public void updateEmployee(@PathVariable long id, @RequestBody Employee e){
			if(er.findOne(id)!=null){
			Employee em=er.findOne(id);
			e.setId(em.getId());
		    er.save(e);
			}
		    else{
				throw new EmployeeNotFoundException();
			}
	}
	/**
	 * get method to get sorted employees in database by ascending
	 * @return Iterable<employee>
	 */
	@RequestMapping(value="/employees/sortasc", method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Employee> sortByLastNameAscending(){
		Sort.Order sorted;
		sorted= new Sort.Order(Sort.Direction.ASC,"lastName").ignoreCase();
		
		return er.findAll(new Sort(sorted));
	}
	/**
	 * get method to get sorted employees in database by descending
	 * @return Iterable<Employee>
	 */
	@RequestMapping(value="/employees/sortdesc", method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Employee> sortByLastNameDescending(){
		Sort.Order sorted;
		sorted= new Sort.Order(Sort.Direction.DESC,"lastName").ignoreCase();
		
		return er.findAll(new Sort(sorted));
	}
	/**
	 * get method to get employees by search parameter
	 * @param name
	 * @return Iterable<Employee>
	 */
	@RequestMapping(value="/employees/search", method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Employee> searchEmployees(@RequestParam String name){
		return er.findByFirstNameContainingOrLastNameContainingAllIgnoreCase(name, name);
	}
	/**
	 * get method to get employees from database by filter parameter
	 * @param String gender
	 * @param Location locationId
	 * @return Iterable<Employee>
	 */
	@RequestMapping(value="/employees/filter", method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Employee> filterEmployees(@RequestParam String gender,@RequestParam String locationId){
		if(!gender.contains("null") && locationId.contains("null")){
			return er.findByGender(gender.toLowerCase());
		}
		else if(gender.contains("null") && !locationId.contains("null")){
			return er.findByLocationId(Integer.parseInt(locationId));
		}
		else{
			return er.findByLocationIdAndGender(gender.toLowerCase(), Integer.parseInt(locationId));
		}
		
	}
}
