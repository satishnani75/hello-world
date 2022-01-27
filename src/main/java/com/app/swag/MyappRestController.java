package com.app.swag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyappRestController {

	
	@GetMapping("/show")
	public String show() {
		
		return "this is swagger show 123";
		
	}
	
	
	@GetMapping("/get")
	public String get() {
		
		
		return " this swagger get";
	}
}
