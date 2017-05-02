package com.mitrais.finalproject.hafi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author trainee Hafi
 * Location Entity
 */
@Entity
@Table(name="t_location")
public class Location {
	
	@Id
	@Column(name="loc_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	@Column(name="loc_name", nullable = false)
	private String name;
	/**
	 * getter for id
	 * @return Integer id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * setter for id
	 * @param Integer id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * getter for name
	 * @return String name
	 */
	public String getName() {
		return name;
	}
	/**
	 * setter for name
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * constructor with no parameter
	 */
	public Location(){}
}
