package com.mitrais.finalproject.hafi;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


/**
 * 
 * @author trainee Hafi
 * Employee repository that extends paging and sorting repository
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
	/**
	 * method to get employees by lastName
	 * @param String lastName
	 * @return List<Employee>
	 */
	public List<Employee> findByLastName(@Param(value="lastName") String lastName);
	/**
	 * method to get employees by firstName or lastName
	 * @param String firstName
	 * @param String lastName
	 * @return Iterable<Employee>
	 */
	public Iterable<Employee> findByFirstNameContainingOrLastNameContainingAllIgnoreCase(@Param("firstName") String firstName, @Param("lastName") String lastName);
	/**
	 * method to get employees by gender and location
	 * @param String gender
	 * @param Integer locationId
	 * @return Iterable<Employee>
	 */
	@Query("select e from Employee e where LOWER(e.gender)=:gender and e.locationId.id=:locationId")
	public Iterable<Employee> findByLocationIdAndGender(@Param("gender") String gender,@Param("locationId") Integer locationId);
	/**
	 * method to get employees by locationId
	 * @param Integer locationId
	 * @return Iterable<Employee>
	 */
	@Query("select e from Employee e where e.locationId.id=:locationId")
	public Iterable<Employee> findByLocationId(@Param("locationId") Integer locationId);
	/**
	 * method to get employees by gender
	 * @param String gender
	 * @return Iterable<Employee>
	 */
	@Query("select e from Employee e where LOWER(e.gender)=:gender")
	public Iterable<Employee> findByGender(@Param("gender") String gender);
}
