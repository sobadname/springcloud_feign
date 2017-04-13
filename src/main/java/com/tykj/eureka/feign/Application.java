package com.tykj.eureka.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tykj.eureka.feign.service.Service;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class Application {

	private Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	private Service service;

	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public String service() {
		return service.service("for", "test");
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
