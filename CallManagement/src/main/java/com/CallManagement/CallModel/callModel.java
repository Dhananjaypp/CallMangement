package com.CallManagement.CallModel;

import java.sql.Timestamp;

public class callModel {
	private String From_number;
	private int Duration;
	public String getFrom_number() {
		return From_number;
	}
	public void setFrom_number(String from_number) {
		From_number = from_number;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	@Override
	public String toString() {
		return "callModel [From_number=" + From_number + ", Duration=" + Duration + ", getFrom_number()="
				+ getFrom_number() + ", getDuration()=" + getDuration() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public callModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public callModel(String from_number, int duration) {
		super();
		From_number = from_number;
		Duration = duration;
	}
	
	
}
