package com.hackathon.machineanalysis.servoce;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

//to be converted into rest controller

import com.hackathon.machineanalysis.machine.Machine;

public class MachineService {
	
	private List<Machine> todaysEfficiency(){
		List<Machine> effectiveMachine = new ArrayList<Machine>();
		
		effectiveMachine.add(new Machine(001,"9-10",20, new Date()));
		effectiveMachine.add(new Machine(001,"10-11",16, new Date()));
		effectiveMachine.add(new Machine(001,"11-12",32, new Date()));
		effectiveMachine.add(new Machine(001,"12-13",27, new Date()));
		return effectiveMachine;
		
	}
	
	private List<Machine> companysEfficiency(){
		List<Machine>  effectiveMachine = new ArrayList<Machine>();
		effectiveMachine.add(new Machine(001,"9-10",40, new Date()));
		effectiveMachine.add(new Machine(001,"10-11",40, new Date()));
		effectiveMachine.add(new Machine(001,"11-12",40, new Date()));
		effectiveMachine.add(new Machine(001,"12-13",40, new Date()));
		return effectiveMachine;
	}
	
	private List<Machine> pastEfficieny(Date pastDate){
		//the machine list will be fetched from repo based on the past date parameter
		//as of now, static list is being populated
		List<Machine>  effectiveMachine = new ArrayList<Machine>();
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,-10);
		effectiveMachine.add(new Machine(001,"9-10",41, date));
		effectiveMachine.add(new Machine(001,"10-11",32, date));
		effectiveMachine.add(new Machine(001,"11-12",37, date));
		effectiveMachine.add(new Machine(001,"12-13",45, date));
		return effectiveMachine;
	}
	

}
