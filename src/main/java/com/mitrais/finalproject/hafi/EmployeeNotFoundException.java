package com.mitrais.finalproject.hafi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * 
 * @author trainee Hafi
 * exception handling when user request user id that is not contained in database
 */
@ResponseStatus(
		value=HttpStatus.NOT_FOUND,
		reason="employee Id not found"
			)
public class EmployeeNotFoundException extends RuntimeException{

}
