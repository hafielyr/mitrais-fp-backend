package com.mitrais.finalproject.hafi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EmployeeController {
	private List<Employee> employee;
	
	@Autowired
	EmployeeRepository er;
	
	public EmployeeController(){
		employee=new ArrayList<Employee>();
		
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
	
	
}
