package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.repository.UserRepository;
import com.example.service.JoinService;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping(value = "/joinRequest")
	public String joinRequest(HttpServletRequest request) {
		JoinService joinService = new JoinService();
		
		return "index";
		
	}
	@PostMapping(value = "/loginRequest")
	public String loinRequest() {
		
		return "index";
	}
}
