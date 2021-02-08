package com.topheryun.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topheryun.models.Mouse;
import com.topheryun.services.IScraperService;

@RestController @RequestMapping("/mouse")
public class ScraperController {
	
	private IScraperService scraperService;
	
	@Autowired
	public ScraperController(IScraperService scraperService) {
		this.scraperService = scraperService;
	}
	
	@PutMapping
	public void insertMouse(@RequestBody Mouse mouse) {
		if (verifyMouse(mouse)) scraperService.insertMouse(mouse);
		System.out.println(mouse);
	}
	
	private boolean verifyMouse(Mouse mouse) {
		if (mouse == null || 
			mouse.getName() == null || 
			mouse.getName().equals("") || 
			mouse.getPrice() <= 0 ||
			mouse.getDate() == null) 
			return false;
		else return true;
	}

}
