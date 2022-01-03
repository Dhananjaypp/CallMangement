package com.CallManagement.CallController;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CallManagement.CallModel.callModel;
import com.CallManagement.CallModel.callModel2;
import com.CallManagement.CallServiceImpl.callServiceImpl;



@RestController
public class callController {
	@Autowired
	callServiceImpl impl;
	
	public callController(callServiceImpl impl) {
		this.impl=impl;
	}
	
	@GetMapping("/get")
	public JSONObject SortTime() {
		return this.impl.SortTime();

	}
	

}
