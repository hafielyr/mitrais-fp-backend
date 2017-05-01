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



@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository er;
	
	public EmployeeController(){
		new ArrayList<Employee>();
		
	}
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	@ResponseBody
	public List<Employee> getEmployees(){
		
		return (List<Employee>) er.findAll();
	}
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	@ResponseBody
	public void addEmployee(@RequestBody Employee e){
		er.save(e);
	}
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
	@RequestMapping(value="/employees/sortasc", method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Employee> sortByLastNameAscending(){
		Sort.Order sorted;
		sorted= new Sort.Order(Sort.Direction.ASC,"lastName").ignoreCase();
		
		return er.findAll(new Sort(sorted));
	}
	@RequestMapping(value="/employees/sortdesc", method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Employee> sortByLastNameDescending(){
		Sort.Order sorted;
		sorted= new Sort.Order(Sort.Direction.DESC,"lastName").ignoreCase();
		
		return er.findAll(new Sort(sorted));
	}
	@RequestMapping(value="/employees/search", method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Employee> searchEmployees(@RequestParam String name){
		return er.findByFirstNameContainingOrLastNameContainingAllIgnoreCase(name, name);
	}
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
