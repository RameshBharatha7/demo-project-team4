package com.example.team4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Team4Application {

	@GetMapping("/team4")
	public String team4() {
		return "Project by team-4";
	}

	public static void main(String[] args) {
		SpringApplication.run(Team4Application.class, args);
	}

}
