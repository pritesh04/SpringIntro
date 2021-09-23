package com.springintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/get")
public class HelloController {

	@RequestMapping("/")
	public String Hello() {
		System.out.println("1234............");
		return "welcome";
	}
}
