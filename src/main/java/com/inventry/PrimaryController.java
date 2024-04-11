package com.inventry;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryController {
	@Autowired
	Student s;
	@GetMapping(value="/get")
	public String getMessage() {
		return s.getMessage();
	}
	

}
