package com.mitrais.finalproject.hafi;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Column(name="emp_martial", nullable = false)
	private String martial;
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
	private String division;
	@Column(name="emp_email", nullable = false)
	private String email;
	@Column(name="emp_isactive", nullable = false)
	private boolean isActive;
	@Column(name="emp_photo")
	private String photo;
	@ManyToOne
	@JoinColumn(name="emp_location")
	private Location locationId;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getMartial() {
		return martial;
	}
	public void setMartial(String martial) {
		this.martial = martial;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubDivision() {
		return subDivision;
	}
	public void setSubDivision(String subDivision) {
		this.subDivision = subDivision;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getSuspendDate() {
		return suspendDate;
	}
	public void setSuspendDate(Date suspendDate) {
		this.suspendDate = suspendDate;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Location getLocationId() {
		return locationId;
	}
	public void setLocationId(Location locationId) {
		this.locationId = locationId;
	}
	public Employee(String emp_fname, String emp_lname, String emp_gender, Date emp_dob,
			String emp_national, String emp_martial, String emp_phone, String emp_sub_div, String emp_status,
			Date emp_susp_date, Date emp_hire_date, String emp_div, String emp_email, boolean emp_isactive,
			String emp_photo, Location emp_location) {
		super();
		this.firstName = emp_fname;
		this.lastName = emp_lname;
		this.gender = emp_gender;
		this.dob = emp_dob;
		this.nationality = emp_national;
		this.martial = emp_martial;
		this.phone = emp_phone;
		this.subDivision = emp_sub_div;
		this.status = emp_status;
		this.suspendDate = emp_susp_date;
		this.hireDate = emp_hire_date;
		this.division = emp_div;
		this.email = emp_email;
		this.isActive = emp_isactive;
		this.photo = emp_photo;
		this.locationId = emp_location;
	}
	public Employee(){}
	
}
