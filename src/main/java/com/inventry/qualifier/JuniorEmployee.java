package com.inventry.qualifier;

import org.springframework.stereotype.Component;

@Component("junior")
public class JuniorEmployee implements Employee {
	public String getRole() {
		return "this is junior";
	}

}
