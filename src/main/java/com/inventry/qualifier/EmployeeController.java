package com.inventry.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	@Qualifier("junior")
	Employee e;
	
	@GetMapping(value="/empget")
	public String empget() {
		return e.getRole();
	}
	
	

}
