package com.lti.busreservation.dto;



import java.sql.Timestamp;

import com.lti.busreservation.models.Buslist;
import com.lti.busreservation.models.Place;

public class Bustimetabledto {
	
	Timestamp sDatetime;
	Timestamp dDatetime;
	String sourcePlace;
	String desnPlace;
	int Blid;
	int sourceplaceid;
	int desnplaceid;
	
	
	public Timestamp getsDatetime() {
		return sDatetime;
	}
	public void setsDatetime(Timestamp sDatetime) {
		this.sDatetime = sDatetime;
	}
	public Timestamp getdDatetime() {
		return dDatetime;
	}
	public void setdDatetime(Timestamp dDatetime) {
		this.dDatetime = dDatetime;
	}
	public String getSourcePlace() {
		return sourcePlace;
	}
	public void setSourcePlace(String sourcePlace) {
		this.sourcePlace = sourcePlace;
	}
	public String getDesnPlace() {
		return desnPlace;
	}
	public void setDesnPlace(String desnPlace) {
		this.desnPlace = desnPlace;
	}
	public int getBlid() {
		return Blid;
	}
	public void setBlid(int blid) {
		Blid = blid;
	}
	public int getSourceplaceid() {
		return sourceplaceid;
	}
	public void setSourceplaceid(int sourceplaceid) {
		this.sourceplaceid = sourceplaceid;
	}
	public int getDesnplaceid() {
		return desnplaceid;
	}
	public void setDesnplaceid(int desnplaceid) {
		this.desnplaceid = desnplaceid;
	}
	
	
	
}

