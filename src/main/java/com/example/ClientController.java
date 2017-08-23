package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@RequestMapping("/Client")
	public String erukeClient()
	{
		return "This is first client application";
	}

}