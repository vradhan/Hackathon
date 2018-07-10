package com.hackathon.machineanalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MachineanalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MachineanalysisApplication.class, args);
	}
}
