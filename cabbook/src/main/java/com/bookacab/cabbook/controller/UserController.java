package com.bookacab.cabbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	
	@GetMapping("/home")
	
	public String Welcome(HttpServletRequest request) {
		
		return "home";
	}

	@RequestMapping("/register")
	public String Register(HttpServletRequest request) {
		
		return "register";
	}
	
	@RequestMapping("/login")
	public String Login(HttpServletRequest request) {
		
		return "login";
	}
	
	@RequestMapping("/welcome")
	public String Hello(HttpServletRequest request) {
		
		return "welcome";
	}
	
	@RequestMapping("/errorpage")
	public String OhNo(HttpServletRequest request) {
		return "errorpage";
	}

	@RequestMapping("/booked")
	public String Success(HttpServletRequest request) {
		return "booked";
	}
	
	
	@RequestMapping("/success")
	public String AllDone(HttpServletRequest request) {
		return "success";
	}
	
	@RequestMapping("/cabselect")
	public String Choose(HttpServletRequest request) {
		return "cabselect";
	}
}
