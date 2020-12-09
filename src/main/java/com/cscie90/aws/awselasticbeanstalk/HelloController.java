package com.cscie90.aws.awselasticbeanstalk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {
	@GetMapping
	public String Hello() {
		return "Hello CSCIE-90 Students";
	}

}
