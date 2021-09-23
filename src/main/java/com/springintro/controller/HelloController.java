package com.springintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/get")
public class HelloController {

	@RequestMapping("/")
	public String Hello(Model mo) {
		mo.addAttribute("msg", "Hello from BridgeLabs");
		return "welcome";
	}
}
