package com.mitrais.finalproject.hafi;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;



public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
	public List<Employee> findByLastName(@Param(value="lastName") String lastName);
	public Iterable<Employee> findByFirstNameContainingOrLastNameContainingAllIgnoreCase(@Param("firstName") String firstName, @Param("lastName") String lastName);
	public Iterable<Employee> findByLocationIdAndGender(@Param("gender") String gender,@Param("locationId") long locationId);
	public Iterable<Employee> findByLocationId(@Param("locationId") long locationId);
	public Iterable<Employee> findByGender(@Param("gender") String gender);
}
