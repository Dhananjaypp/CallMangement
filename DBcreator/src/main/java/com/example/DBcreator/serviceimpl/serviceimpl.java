package com.example.DBcreator.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DBcreator.mapper.dbmapper;
import com.example.DBcreator.model.model1;

@Service
public class serviceimpl {
	@Autowired
	private dbmapper map;
	
	public model1 getAlltags() {
	
		
		ArrayList<String> getdbmanualtags=map.getAlltags();
		ArrayList<String> finddevmanual=map.findAlltags();
		
		for(String i:getdbmanualtags) {
			System.out.println("dhmanualtags"+getdbmanualtags);
			
		}
		
		
		
		return null;
	}

}
