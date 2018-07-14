package com.primefaces.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.primefaces.bean.MachineBean;
import com.primefaces.service.MachineService;

@Component
public class MachineServiceImpl implements MachineService {

    @Override
    public List<MachineBean> todaysEfficiency() {
        List<MachineBean> effectiveMachine = new ArrayList<MachineBean>();
       
        MachineBean mb = new MachineBean();
        mb.setMachineID(1L);
        mb.setDate(new Date());
        mb.setTimePeriod("9 -10");
        mb.setOutput(20);
        
        MachineBean mb2 = new MachineBean();
        mb2.setMachineID(1L);
        mb2.setDate(new Date());
        mb2.setTimePeriod("10 -11");
        mb2.setOutput(11);
        
        
        MachineBean mb3 = new MachineBean();
        mb3.setMachineID(1L);
        mb3.setDate(new Date());
        mb3.setTimePeriod("11 -12");
        mb3.setOutput(18);
        
        MachineBean mb4 = new MachineBean();
        mb4.setMachineID(1L);
        mb4.setDate(new Date());
        mb4.setTimePeriod("12 -13");
        mb4.setOutput(26);
        
        effectiveMachine.add(mb);
        effectiveMachine.add(mb2);
        effectiveMachine.add(mb3);
        effectiveMachine.add(mb4);
        return effectiveMachine;
    }

    @Override
    public List<MachineBean> pastEfficiency() {
        List<MachineBean> effectiveMachine = new ArrayList<MachineBean>();
        Date today = new Date();
        Date oneDayBefore = new Date(today.getTime() - 1 * 24 * 60 * 60 * 1000); 
        MachineBean mb = new MachineBean();
        mb.setMachineID(1L);
        mb.setDate(oneDayBefore);
        mb.setTimePeriod("9 -10");
        mb.setOutput(25);
        
        MachineBean mb2 = new MachineBean();
        mb2.setMachineID(1L);
        mb2.setDate(oneDayBefore);
        mb2.setTimePeriod("10 -11");
        mb2.setOutput(45);
        
        
        MachineBean mb3 = new MachineBean();
        mb3.setMachineID(1L);
        mb3.setDate(oneDayBefore);
        mb3.setTimePeriod("11 -12");
        mb3.setOutput(18);
        
        MachineBean mb4 = new MachineBean();
        mb4.setMachineID(1L);
        mb4.setDate(oneDayBefore);
        mb4.setTimePeriod("12 -13");
        mb4.setOutput(23);
        
        effectiveMachine.add(mb);
        effectiveMachine.add(mb2);
        effectiveMachine.add(mb3);
        effectiveMachine.add(mb4);
        return effectiveMachine;
    }

}
