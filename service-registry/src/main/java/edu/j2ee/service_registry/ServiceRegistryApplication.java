package edu.j2ee.service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//Makes the application as a directory to manage multiple services
//part of  Netflix Eureka, a service registry tool 
@EnableEurekaServer 
public class ServiceRegistryApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}
}
