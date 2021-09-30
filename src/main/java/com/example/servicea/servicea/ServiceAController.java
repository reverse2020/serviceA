package com.example.servicea.servicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceAController {

	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${service}")
	String url;
	
	@GetMapping("/hi")
	public String hi() {
		return restTemplate.getForObject(url, String.class);
	}
}
