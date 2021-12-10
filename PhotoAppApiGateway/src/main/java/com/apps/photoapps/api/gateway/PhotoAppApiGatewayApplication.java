package com.apps.photoapps.api.gateway;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class PhotoAppApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiGatewayApplication.class, args);
	}
/*
	@Bean
	public RouteLocator myRouters(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p->p
					.path("/users-ws/**")
					.filters(f -> f.addRequestHeader("Hello", "World"))
					.uri("http://localhost:*"))
				
				.route(p->p
					.host("*.circuitbreaker.com")
					.filters(f -> f.circuitBreaker(config -> config.setName("mycmd")))
					.uri("http://httpbin.org:80"))
					
				.build();
	}
*/

}
