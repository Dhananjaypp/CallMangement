package com.CallManagement.CallServiceImpl;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.DateUtils;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CallManagement.CallMapper.callMapper;
import com.CallManagement.CallModel.callModel2;
import com.CallManagement.CallService.callService;

@Service
public class callServiceImpl implements callService {
	@Autowired
	private callMapper map;

	
		public JSONObject SortTime() {
		ArrayList<String> list1= new ArrayList<>(map.getmobno());
	//	System.out.println("mobno"+list1.get(0));
		for (int i = 0; i <list1.size(); i++) {
			
			String mobno=list1.get(i);
		
			System.out.println("mobno="+mobno);
			
		ArrayList<Integer> list2 = new ArrayList<>(map.getduration(mobno));
			
	//	System.out.println("list2"+list2);
		int max=list2.get(0);
		
//		System.out.println("max="+max);
		
		
		ArrayList<callModel2> list3 = new ArrayList<>(map.gettime(max));
		
		
		Timestamp time1=list3.get(0).getStart_time();
		Timestamp time2=list3.get(0).getEnd_time();
	//	System.out.println(time1);
	//	System.out.println(time2);

	  long diff = time2.getTime() - time1.getTime();//as given

	  int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(diff);
	  System.out.println("seconds=="+seconds);
	  
	    Calendar calender = Calendar.getInstance();
	    calender.setTimeInMillis(time1.getTime());
	    calender.add(Calendar.SECOND, seconds);
	    Date changeDate=calender.getTime();
	//    System.out.println("changeDate ..:"+changeDate);
	    
	    
	   Timestamp ts=new Timestamp(changeDate.getTime()); 
	//   System.out.println("timestamp=="+ts);
	  
	   calender.add( Calendar.SECOND,seconds );
	  
	   Date nearestHour = DateUtils.round( ts, Calendar.HOUR );
	   
	
	
//	System.out.println(enddate);
	
	//System.out.println("hour1="+element.getHours());
	System.out.println("Hour of the day when the call volume is highest is "+time1.getHours()+"-"+time2.getHours()+":"+time2.getMinutes());
	
	}
			

		ArrayList<Timestamp> list4 = new ArrayList<>(map.getTimeStamp());
		//	System.out.println("list4"+list4); 
			int maxCounter = 0;
			 Timestamp element = null;
			 
			 {
				 
				 for (int i1 = 0; i1 <list4.size(); i1++) {
				 int counter =1;
				 for (int j = i1+1; j <list4.size(); j++) {
				 if(list4.get(i1)==list4.get(i1)){
				 counter++;
				 }
				 }
				 if(maxCounter<counter){
				 maxCounter=counter;
				 element = list4.get(i1);
				 }
				 }
		//		 System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
				 
			
		ArrayList<Timestamp> enddate= new ArrayList(map.getEndDate(element));
		System.out.println("endate"+enddate);
	//	System.out.println("endate"+enddate.get(1));
	//	System.out.println("Hour of the day when the calls are longest is "+element.getHours()+"-"+((Date) enddate).getHours()+":"+((Date) enddate).getMinutes());
			}
		
			 

			 return null;
			 }
}