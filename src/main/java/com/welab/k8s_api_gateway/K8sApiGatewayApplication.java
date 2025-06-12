package com.welab.k8s_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class K8sApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sApiGatewayApplication.class, args);
	}

}
