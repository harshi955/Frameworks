package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hi() {
		return "viewpage";
	}
	@RequestMapping("/helloagain")
	public String hello() {
		return "final";
	}

}
