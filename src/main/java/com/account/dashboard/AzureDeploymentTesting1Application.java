package com.account.dashboard;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class AzureDeploymentTesting1Application {
	
	@GetMapping("getAllRemarks")
	public String  getAllRemarks(){
		System.out.println("Deployment Testing Has Been Done");
		return "Deployment Testing Has Been Done";
	}


	public static void main(String[] args) {
		System.out.println("Testing Aryan");
		SpringApplication.run(AzureDeploymentTesting1Application.class, args);
	}

}
