package com.params.path_params;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class PathParamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PathParamsApplication.class, args);
	}

	@RequestMapping("")
	public String index() {
		return "Welcome to our app!";
	}

	@RequestMapping("/{verb}/{noun}")
	public String verbNoun(@PathVariable("verb") String verb, @PathVariable("noun") String noun) {
		return "Congratulations! You are " + verb + " to " + noun;
	}

	@RequestMapping("/lotto/{num}")
	public String lottery(@PathVariable("num") int num){
		if(num % 2 == 0){
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else{
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}

}
