package com.inventry.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
	@Value("${my.name}")
	private String name;
	
	@GetMapping(value="/names")
	public String getname() {
		return name;
	}
	

}
