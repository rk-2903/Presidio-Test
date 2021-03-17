package com.presidio.jobpostingwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JobPostingWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobPostingWebappApplication.class, args);
	}

}
