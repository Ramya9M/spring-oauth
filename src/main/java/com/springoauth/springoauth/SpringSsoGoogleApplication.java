package com.springoauth.springoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class SpringSsoGoogleApplication {

	@GetMapping
	public String welcome(){
		return "your successfully authenticated";
	}

	@GetMapping("/user")
	public Principal getUser(Principal principal){
         return  principal;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringSsoGoogleApplication.class, args);
	}

}
