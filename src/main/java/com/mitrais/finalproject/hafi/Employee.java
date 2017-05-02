package com.mitrais.finalproject.hafi;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
/**
 * 
 * @author trainee Hafi
 * Employee Entity
 */
@Entity
@Table(name="t_employee")
public class Employee {
	
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long Id;
	@Column(name="emp_fname", nullable = false)
	private String firstName;
	@Column(name="emp_lname", nullable = false)
	private String lastName;
	@Column(name="emp_gender", nullable = false)
	private String gender;
	@Column(name="emp_dob", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(name="emp_national", nullable = false)
	private String nationality;
	@Column(name="emp_marital", nullable = false)
	private String marital;
	@Column(name="emp_phone", nullable = false)
	private String phone;
	@Column(name="emp_sub_div", nullable = false)
	private String subDivision;
	@Column(name="emp_status", nullable = false)
	private String status;
	@Column(name="emp_susp_date")
	@Temporal(TemporalType.DATE)
	private Date suspendDate;
	@Column(name="emp_hire_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	@Column(name="emp_div", nullable = false)
	private String grade;
	@Column(name="emp_grade", nullable = false)
	private String division;
	@Column(name="emp_email", nullable = false)
	private String email;
	@Column(name="emp_isactive", nullable = false)
	private boolean isActive;
	@Lob
	@Column(nullable=true)
	private String emp_photo;
	@ManyToOne
	@JoinColumn(name="emp_location")
	private Location locationId;
	/**
	 * getter for employee Id
	 * @return Long Id
	 */
	public long getId() {
		return Id;
	}
	/**
	 * setter for employee Id
	 * @param long id
	 */
	public void setId(long id) {
		Id = id;
	}
	/**
	 * getter  for firstName
	 * @return String firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * setter for firstName
	 * @param String firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * getter for lastName
	 * @return String lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * setter for lastName
	 * @param String lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * getter for gender
	 * @return String gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * setter for gender
	 * @param String gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * getter for Date of Birth
	 * @return Date dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * setter for date of birth
	 * @param Date dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * getter for nationality
	 * @return String nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * setter for nationality
	 * @param String nationality
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * getter for marital
	 * @return String marital
	 */
	public String getMarital() {
		return marital;
	}
	/**
	 * setter for marital
	 * @param String marital
	 */
	public void setMarital(String marital) {
		this.marital = marital;
	}
	/**
	 * getter for phone
	 * @return String phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * setter for phone
	 * @param String phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * getter for subDivision
	 * @return String subDivision
	 */
	public String getSubDivision() {
		return subDivision;
	}
	/**
	 * setter for subDivision
	 * @param String subDivision
	 */
	public void setSubDivision(String subDivision) {
		this.subDivision = subDivision;
	}
	/**
	 * getter for Status
	 * @return String status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * setter for status
	 * @param String status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * getter for suspendDate
	 * @return Date suspendDate
	 */
	public Date getSuspendDate() {
		return suspendDate;
	}
	/**
	 * setter for suspendDate
	 * @param Date suspendDate
	 */
	public void setSuspendDate(Date suspendDate) {
		this.suspendDate = suspendDate;
	}
	/**
	 * getter for hireDate
	 * @return Date hireDate
	 */
	public Date getHireDate() {
		return hireDate;
	}
	/**
	 * setter for hireDate
	 * @param Date hireDate
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	/**
	 * getter for grade
	 * @return String grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * setter for grade
	 * @param String grade
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * getter for division
	 * @return String division
	 */
	public String getDivision() {
		return division;
	}
	/**
	 * setter for division
	 * @param String division
	 */
	public void setDivision(String division) {
		this.division = division;
	}
	/**
	 * getter for email
	 * @return String email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * setter for email
	 * @param String email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * getter for Active
	 * @return boolean isActive
	 */
	public boolean isActive() {
		return isActive;
	}
	/**
	 * setter for active
	 * @param boolean isActive
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	/**
	 * getter for photo
	 * @return String emp_photo
	 */
	public String getPhoto() {
		return emp_photo;
	}
	/**
	 * setter for photo
	 * @param String photo
	 */
	public void setPhoto(String photo) {
		this.emp_photo = photo;
	}
	/**
	 * getter for locationId
	 * @return Location locationId
	 */
	public Location getLocationId() {
		return locationId;
	}
	/**
	 * setter for locationId
	 * @param Location locationId
	 */
	public void setLocationId(Location locationId) {
		this.locationId = locationId;
	}
	/**
	 * constructor with parameter
	 * @param emp_id
	 * @param emp_fname
	 * @param emp_lname
	 * @param emp_gender
	 * @param emp_dob
	 * @param emp_national
	 * @param emp_martial
	 * @param emp_phone
	 * @param emp_sub_div
	 * @param emp_status
	 * @param emp_susp_date
	 * @param emp_hire_date
	 * @param emp_div
	 * @param emp_email
	 * @param emp_isactive
	 * @param emp_photo
	 * @param emp_location
	 */
	public Employee(long emp_id, String emp_fname, String emp_lname, String emp_gender, Date emp_dob,
			String emp_national, String emp_martial, String emp_phone, String emp_sub_div, String emp_status,
			Date emp_susp_date, Date emp_hire_date, String emp_div, String emp_email, boolean emp_isactive,
			String emp_photo, Location emp_location) {
		super();
		this.Id = emp_id;
		this.firstName = emp_fname;
		this.lastName = emp_lname;
		this.gender = emp_gender;
		this.dob = emp_dob;
		this.nationality = emp_national;
		this.marital = emp_martial;
		this.phone = emp_phone;
		this.subDivision = emp_sub_div;
		this.status = emp_status;
		this.suspendDate = emp_susp_date;
		this.hireDate = emp_hire_date;
		this.division = emp_div;
		this.email = emp_email;
		this.isActive = emp_isactive;
		this.emp_photo = emp_photo;
		this.locationId = emp_location;
	}
	/**
	 * constructor with no parameter
	 */
	public Employee(){}
	
}
