package com.learnSphere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController 
{
	@GetMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/addC")
	public String addC()
	{
		return "addCourse";
	}
	
	@GetMapping("/addL")
	public String addLesson()
	{
		return "addLesson";
	}
	
	@GetMapping("/studentHome")
	public String studentHome()
	{
		return "studentHome";
	}
	@GetMapping("/logout")
	public String logout() {
	    // Perform any necessary logout actions here
	    return "redirect:/?logoutSuccess=true"; // Redirect with a query parameter
	}


	
	
	
}
