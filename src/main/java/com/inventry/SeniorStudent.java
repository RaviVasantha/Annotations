package com.inventry;


import org.springframework.stereotype.Component;

@Component
public class SeniorStudent implements Student {
	public String getMessage() {
		return "this is senior";
	}
	

}
