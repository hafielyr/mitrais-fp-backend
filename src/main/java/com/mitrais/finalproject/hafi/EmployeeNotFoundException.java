package com.mitrais.finalproject.hafi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
		value=HttpStatus.NOT_FOUND,
		reason="employee Id not found"
			)
public class EmployeeNotFoundException extends RuntimeException{

}
