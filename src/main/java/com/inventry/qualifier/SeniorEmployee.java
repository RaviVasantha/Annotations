package com.inventry.qualifier;

import org.springframework.stereotype.Component;

@Component("senior")
public class SeniorEmployee implements Employee {
	public String getRole() {
		return "this is senior";
	}

}
