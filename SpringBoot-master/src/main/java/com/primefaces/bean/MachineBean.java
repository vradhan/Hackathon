package com.primefaces.bean;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.primefaces.serviceImpl.MachineServiceImpl;

@Named(value = "machine")
@Component
public class MachineBean {

    @Autowired
    private MachineServiceImpl machineService;

    private Long machineID;

    private String timePeriod;

    private int output;

    private Date date;

    List<MachineBean> effectiveMachine = new ArrayList<MachineBean>();
    
    List<MachineBean> pastEffectiveMachine = new ArrayList<MachineBean>();

    public Long getMachineID() {
        return machineID;
    }

    public void setMachineID(Long machineID) {
        this.machineID = machineID;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MachineServiceImpl getMachineService() {
        return machineService;
    }

    public void setMachineService(MachineServiceImpl machineService) {
        this.machineService = machineService;
    }

    public List<MachineBean> getEffectiveMachine() {
        return effectiveMachine;
    }

    public void setEffectiveMachine(List<MachineBean> effectiveMachine) {
        this.effectiveMachine = effectiveMachine;
    }
    
    

    public List<MachineBean> getPastEffectiveMachine() {
        return pastEffectiveMachine;
    }

    public void setPastEffectiveMachine(List<MachineBean> pastEffectiveMachine) {
        this.pastEffectiveMachine = pastEffectiveMachine;
    }

    @PostConstruct
    public void init() {
        effectiveMachine = machineService.todaysEfficiency();
        pastEffectiveMachine = machineService.pastEfficiency();
        createBarModels();
        createBarModels2();
    }

    private BarChartModel barModel;
    
    private BarChartModel barModel2;

    
    
    
    public BarChartModel getBarModel2() {
        return barModel2;
    }

    
    public BarChartModel getBarModel() {
        return barModel;
    }

    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();

        ChartSeries boys = new ChartSeries();
        boys.setLabel("Machine Capacity Output/Hour");
        boys.set("9 - 10", 100);
        boys.set("10 - 11", 100);
        boys.set("11 - 12", 100);
        boys.set("12 - 13", 100);
        boys.set("13- 14", 100);

        ChartSeries girls = new ChartSeries();
        girls.setLabel("Machine Actual Output Today");
        girls.set("9 - 10", 20);
        girls.set("10 -11", 11);
        girls.set("11 - 12", 18);
        girls.set("12 - 13", 26);
        girls.set("13 - 14", 45);

        model.addSeries(boys);
        model.addSeries(girls);

        return model;
    }
    
    private BarChartModel initBarModel2() {
        BarChartModel model = new BarChartModel();

        ChartSeries boys = new ChartSeries();
        boys.setLabel("Machine Actual Output Today");
        boys.set("9 - 10", 20);
        boys.set("10 - 11", 11);
        boys.set("11 - 12", 18);
        boys.set("12 - 13", 26);
        boys.set("13- 14", 45);

        ChartSeries girls = new ChartSeries();
        girls.setLabel("Machine Actual Output past Date");
        girls.set("9 - 10", 25);
        girls.set("10 -11", 45);
        girls.set("11 - 12", 18);
        girls.set("12 - 13", 23);
        girls.set("13 - 14", 50);

        model.addSeries(boys);
        model.addSeries(girls);

        return model;
    }

    private void createBarModels() {
        createBarModel();
        createBarModel2();

    }
    
    private void createBarModels2() {
        createBarModel2();

    }

    private void createBarModel() {
        barModel = initBarModel();
        

        barModel.setTitle("Bar Chart");
        barModel.setLegendPosition("ne");

        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("OutPut/Hour");

        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Total OutPut");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }
    
    private void createBarModel2() {
        barModel2 = initBarModel2();

        barModel2.setTitle("Bar Chart");
        barModel2.setLegendPosition("ne");

        Axis xAxis = barModel2.getAxis(AxisType.X);
        xAxis.setLabel("OutPut/Hour");

        Axis yAxis = barModel2.getAxis(AxisType.Y);
        yAxis.setLabel("Total OutPut");
        yAxis.setMin(0);
        yAxis.setMax(100);
    }
    
    public void save(){
        MachineBean mm = new MachineBean();
        mm.setMachineID(1L);
        mm.setDate(new Date());
        mm.setTimePeriod("13 - 14");
        mm.setOutput(80);
        effectiveMachine.add(mm);
    }

    public LocalTime currentTime(){
        return java.time.LocalTime.now();
    }
}
