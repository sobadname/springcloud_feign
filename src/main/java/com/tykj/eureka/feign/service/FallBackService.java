package com.tykj.eureka.feign.service;

@org.springframework.stereotype.Service
public class FallBackService implements Service{

	public String service(String str1, String str2) {
		return "error";
	}

}
