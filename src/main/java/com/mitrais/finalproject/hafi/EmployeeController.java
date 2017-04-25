package com.mitrais.finalproject.hafi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EmployeeController {
	private List<Employee> employee;
	
	public EmployeeController(){
		employee=new ArrayList<Employee>();
		employee.add(new Employee("satriya","mistiawan","female"));
	}
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	@ResponseBody
	public List<Employee> employeesHello(){
		
		return employee;
	}
}
