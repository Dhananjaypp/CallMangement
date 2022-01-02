package com.CallManagement.CallMapper;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.CallManagement.CallModel.callModel;
import com.CallManagement.CallModel.callModel2;

@Mapper
public interface callMapper {
	
	@Select("SELECT \"From_number\" FROM public.\"CallTable\";")
	List<String> getmobno();

	
	@Select("SELECT MAX (\"Duration\") FROM public.\"CallTable\" WHERE \"From_number\"='${mobno}';")
	List<Integer> getduration(String mobno);
	
	@Select("SELECT \"Start_time\", \"End_time\" FROM public.\"CallTable\" where \"Duration\"='${max}';")
	List<callModel2> gettime(int max );
	
	@Select("SELECT \"Start_time\" FROM public.\"CallTable\";")
	List<Timestamp> getTimeStamp();
	
	@Select("SELECT \"End_time\" FROM public.\"CallTable\" WHERE \"Start_time\"='${element}';")
	List<Timestamp> getEndDate(Timestamp element);
	
	

}
