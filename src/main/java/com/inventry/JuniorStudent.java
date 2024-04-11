package com.inventry;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JuniorStudent implements Student {
	
	public String getMessage() {
		return "this is junior";
	}

}
