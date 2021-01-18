package com.codesix.businesses.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/"})
public class Businesses {
	
	@GetMapping
	public String test(Model model) {
		return "hello from spring boot";
	}

}
