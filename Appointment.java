package Appointment;

import java.util.Date;
import java.util.Calendar;

public class Appointment {

	private String ID;
	private Date Date;
	private String description;
	
	public Appointment(String ID, String Date, String description) {
		if(ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(Date == null || Date.before(Date) ) {
			throw new IllegalArgumentException("Invalid Date");
		}
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid description");
		}
		
		this.ID = ID;
		this.Date = Date;
		this.description = description;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getDate() {
		return Date;
	}
	
	public String getdescription() {
		return description;
	}
}
