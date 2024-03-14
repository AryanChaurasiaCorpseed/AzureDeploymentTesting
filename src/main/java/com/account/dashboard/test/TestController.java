package com.account.dashboard.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test")
	public String  getAllRemarks(){
		System.out.println("Deployment Testing Has Been Done");
		return "Deployment Testing Has Been Done";
	}

}
