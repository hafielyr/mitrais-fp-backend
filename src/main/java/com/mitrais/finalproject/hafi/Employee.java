package com.mitrais.finalproject.hafi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_employee")
public class Employee {
	
	@Column(name="emp_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int Id;
	@Column(name="emp_id")
	private String firstName;
	private String lastName;
	private String gender;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(){}
	public Employee(String fn,String ln,String gender){
		firstName=fn;
		lastName=ln;
		this.gender=gender;
	}
}
