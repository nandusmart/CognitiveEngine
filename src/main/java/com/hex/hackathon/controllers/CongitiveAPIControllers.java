package com.hex.hackathon.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hex.hackathon.dao.PersonalityRequest;
import com.hex.hackathon.services.PersonalityInsightService;

@RestController
@RequestMapping("/api")
public class CongitiveAPIControllers {
	
	@PostMapping("/personalityinsight")
	public String getWatsonPersonalityInsights(@RequestBody PersonalityRequest value)
	{
		PersonalityInsightService service = new PersonalityInsightService();
		String str = service.getInsights(value.getUserMessages());
		return str;
	}

}
