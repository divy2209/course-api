package com.sample.springbootsample.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello") // This is a GET method by default
	public String sayHi() {
		return "Hi";
	}
}
