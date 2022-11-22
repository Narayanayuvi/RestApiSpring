package com.web.service.RestSpring.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.service.RestSpring.model.RestUser;

@RestController
@RequestMapping("/users")
public class Controller
{
	Map<String,RestUser> allusers=new HashMap<>();
	
   @GetMapping
   public Collection<RestUser> getMethod()
   {
	   return allusers.values();
   }

   @PostMapping
   public String postMethod(@RequestBody RestUser userdetails)
   {
	  RestUser addvalue =new RestUser();
	  addvalue.setUserId(userdetails.getUserId());
	  addvalue.setName(userdetails.getName());
	  addvalue.setEmail(userdetails.getEmail());
	  allusers.put(userdetails.getUserId(),addvalue);
	  return "user added";
   }
   @PutMapping
   public String putmethod()
   {
	   
		   return "put not found";
	   
   }
   @DeleteMapping(path="/(userid)")
   public String deleteMethod(@PathVariable String userId)
   {
	   if(allusers.containsKey(userId))
	   {
		   allusers.remove(userId);
		   return "user deleted Successfully";
	   }
	   else
	   {
		   return "userId not found";
	   }
   }
}

