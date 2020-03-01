package com.example.GrandWorldMSpec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class GrandWorldMSpecApplication {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	//若整个工程目录下有两个main方法，那么mvn compile时就会报错，所以ignore掉Swagger2SpringBoot.java
	public static void main(String[] args) {
		SpringApplication.run(GrandWorldMSpecApplication.class, args);
	}

}
