package com.bookacab.cabbook.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;


import com.bookacab.cabbook.repository.CabRepository;
import com.bookacab.cabbook.repository.UserRepository;
import com.bookacab.cabbook.model.Users;
import com.bookacab.cabbook.model.Book;
import com.bookacab.cabbook.model.CabType;
import com.bookacab.cabbook.model.Cabs;

import com.bookacab.cabbook.model.Response;
import com.bookacab.cabbook.service.UserService;

import com.bookacab.cabbook.service.CabService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController

public class LoginController {

	@Autowired
	UserService userService;
	@Autowired
	UserRepository repository;
	@Autowired
	CabService cabService;
	@Autowired
	CabRepository cabrepository;
	
	
	@RequestMapping(path="/")
	
	public RedirectView hello(){
		 return new RedirectView("/home");
	}
	
	@PostMapping(path="/login-user")
	public String loginUser(@ModelAttribute Users user, HttpServletResponse response) throws IOException{
		if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
			response.sendRedirect("cabselect");
		}else {
			response.sendRedirect("errorpage");
		}
		return null;
	}
	
	

	@PostMapping(path="/register-user")
	public RedirectView addUser(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam Float phone) {
	    Users user = new Users(firstname, lastname, username, password, email, phone);
	    System.out.println("User: " + user + " has been added");

	    try {
	        repository.save(user);
	        
	        return new RedirectView("/cabselect");
	    } catch (Exception exception) {
	       
	        return new RedirectView("/errorpage");
	    }
	}

	@PostMapping(path="/cab-select")
	public RedirectView chooseCab() {
	   
	    try {
      
	        return new RedirectView("/welcome");
	    } catch (Exception exception) {
	       
	        return new RedirectView("/errorpage");
	    }
	}
	
	@PostMapping(path="/booked")
	public RedirectView addBooking(@RequestParam String pickuptime, @RequestParam String passengername, @RequestParam Integer passengercount, @RequestParam String cabtype) {
		CabType selectedCabType = CabType.valueOf(cabtype);
	    Book booking = new Book(pickuptime, passengername, passengercount, selectedCabType);
	    System.out.println("Booking for " + passengername + " entered");
	
	    try {
	        cabrepository.save(booking);
	        
	        return new RedirectView("/booked");
	    } catch (Exception exception) {
	       
	        return new RedirectView("/errorpage");
	    }
	}
	
}
