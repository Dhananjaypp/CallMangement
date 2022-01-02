package com.CallManagement.CallModel;

import java.sql.Timestamp;

public class callModel2 {
	private Timestamp Start_time;
	private Timestamp End_time;
	public Timestamp getStart_time() {
		return Start_time;
	}
	public void setStart_time(Timestamp start_time) {
		Start_time = start_time;
	}
	public Timestamp getEnd_time() {
		return End_time;
	}
	public void setEnd_time(Timestamp end_time) {
		End_time = end_time;
	}
	@Override
	public String toString() {
		return "callModel2 [Start_time=" + Start_time + ", End_time=" + End_time + ", getStart_time()="
				+ getStart_time() + ", getEnd_time()=" + getEnd_time() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public callModel2(Timestamp start_time, Timestamp end_time) {
		super();
		Start_time = start_time;
		End_time = end_time;
	}
	
	
}
