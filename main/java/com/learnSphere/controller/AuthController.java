package com.learnSphere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AuthController {

    @GetMapping("/Nlogout")
    public String logout() {
     
        return "redirect:/index"; // Redirect to home page after logout
        
    }
}
