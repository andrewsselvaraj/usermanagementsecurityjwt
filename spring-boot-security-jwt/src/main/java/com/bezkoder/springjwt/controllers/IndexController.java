package com.bezkoder.springjwt.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class IndexController {
	@GetMapping("/index")
	public String allAccess() {
		return "index.";
	}
	@GetMapping("/")
	public String allAccessEmpty() {
		return "indexEMpty.";
	}
	
	
}
