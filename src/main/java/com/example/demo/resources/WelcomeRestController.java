package com.example.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger2WelcomeRestController", description = "This REST Api related to Welcome Message!!!!")
@RestController
public class WelcomeRestController {

	@ApiOperation(value = "Get Welcome Message For The Given Name ", response = String.class, tags = "getWelcomeNote")
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name) {
		return "Welcome to Sporty Shoes !" + name;
	}
		
	@GetMapping("/admin")
	public String returnAdmin() {
		return "Name: Deepak. Contact: deepak.kumar@prolim.com" ;
	}
	
	@GetMapping("/user")
	public String returnUser() {
		return "Id:12 | Name:Sahil | Email:demo@demo.com" ;
	}
	
	@GetMapping("/greet")
	public String returnGreet() {
		return "Hello User" ;
	}
	
}	
