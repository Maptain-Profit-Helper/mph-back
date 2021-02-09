package com.topheryun.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topheryun.services.IMouseService;

@RestController
@CrossOrigin
@RequestMapping("/mouse")
public class MouseController {

	private IMouseService mouseService;
	
	public MouseController(IMouseService mouseService) {
		this.mouseService = mouseService;
	}
	

}
