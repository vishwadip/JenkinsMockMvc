package com.zensar.webapp.rest.controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//writing test cases for every piece business code including spring controller is mandate
@RestController
public class HelloRestController {

	@GetMapping("/getMessage")
	public String getMessage() {
		System.out.println("Testing GetMessage");
		return "HelloWorld";
	}
	
	
	@PostMapping("/greet")
	public ResponseEntity<String> createMessage(@RequestBody String msg) {
		
		return new ResponseEntity<String>(""+msg,HttpStatus.CREATED);
	}
}
