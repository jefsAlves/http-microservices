package com.alvesjefs.hr_hrworkers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceHrWorkersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceHrWorkersApplication.class, args);
	}

}
