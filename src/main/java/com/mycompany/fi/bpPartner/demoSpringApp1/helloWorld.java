package com.mycompany.fi.bpPartner.demoSpringApp1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

	@RequestMapping("/helloWorld")
	public String printHello() {
		return "Hello World";
	}
}
