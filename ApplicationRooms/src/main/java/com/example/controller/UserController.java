package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entities.User;
import com.example.services.UserServices;





@Controller
public class UserController
{
    @Autowired
    UserServices userServices;
    @GetMapping("/user")
    public String page(Model model)
    {model.addAttribute("user", new User());
    	return "user";
    }

    @PostMapping("/saveUser")
    public ResponseEntity<User> getUser(@ModelAttribute User user,Model model  )	
    {model.addAttribute("user", user);
 
    	userServices.SaveDetails(user);

      return ResponseEntity.status(HttpStatus.OK).body(user);
    }

}
