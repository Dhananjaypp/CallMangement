package com.example.DBcreator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DBcreator.model.model1;
import com.example.DBcreator.serviceimpl.serviceimpl;

@RestController
public class mycotroller {
	
	@Autowired
	private serviceimpl impl;
	
	public mycotroller (serviceimpl impl) {
		this.impl=impl;
	}
	
	@GetMapping("/get")
	public model1 getAlltags() {
		return this.impl.getAlltags();
	}

}
