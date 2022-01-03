package com.example.DBcreator.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface dbmapper {
	
	@Select("SELECT \"Id\", \"ManualTagName\", \"Description\", \"UOM\", \"ReferenceValue\"\r\n"
			+ "	FROM public.iocl_manualtags;")
	ArrayList<String> getAlltags();

	
	@Select("SELECT \"Id\", \"ManualTagName\", \"Description\", \"UOM\", \"ReferenceValue\"\r\n"
			+ "	FROM public.iocl_manualtags WHERE \"ManualTagName\"='';")
	ArrayList<String> findAlltags();

}
