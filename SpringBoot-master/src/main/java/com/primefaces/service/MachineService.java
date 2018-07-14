package com.primefaces.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.primefaces.bean.MachineBean;

@Service
public interface MachineService {

    List<MachineBean> todaysEfficiency();
    
    List<MachineBean> pastEfficiency();
}
