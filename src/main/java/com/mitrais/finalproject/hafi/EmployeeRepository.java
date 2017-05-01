package com.mitrais.finalproject.hafi;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;



public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
	public List<Employee> findByLastName(@Param(value="lastName") String lastName);
	public Iterable<Employee> findByFirstNameContainingOrLastNameContainingAllIgnoreCase(@Param("firstName") String firstName, @Param("lastName") String lastName);
	@Query("select e from Employee e where LOWER(e.gender)=:gender and e.locationId.id=:locationId")
	public Iterable<Employee> findByLocationIdAndGender(@Param("gender") String gender,@Param("locationId") Integer locationId);
	@Query("select e from Employee e where e.locationId.id=:locationId")
	public Iterable<Employee> findByLocationId(@Param("locationId") Integer locationId);
	@Query("select e from Employee e where LOWER(e.gender)=:gender")
	public Iterable<Employee> findByGender(@Param("gender") String gender);
}
