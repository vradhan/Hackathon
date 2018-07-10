package com.hackathon.machineanalysis.machine;

import java.util.Date;

public class Machine {
	
	private int machineID;
	
	private String timePeriod;
	
	private int output;
	
	private Date date;
	
	public Machine (int machineID, String timePeriod, int output, Date date){
		this.machineID = machineID;
		this.timePeriod = timePeriod;
		this.output = output;
		this.date = date;
	}

	public int getMachineID() {
		return machineID;
	}

	public void setMachineID(int machineID) {
		this.machineID = machineID;
	}

	public String getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}

	public int getRodsProduced() {
		return output;
	}

	public void setRodsProduced(int rodsProduced) {
		this.output = rodsProduced;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
