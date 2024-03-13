package com.alibou.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;// Updated Annotation

@EnableEurekaServer // Updated Annotation
@SpringBootApplication
public class DiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}

}
