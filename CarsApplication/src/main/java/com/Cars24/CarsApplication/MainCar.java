package com.Cars24.CarsApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;*/

@SpringBootApplication
//@EnableSwagger2
public class MainCar {

	public static void main(String[] args) {
		SpringApplication.run(MainCar.class, args);
		System.out.println("Connected to Database Successfully...");
	}
	
	/*@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.Cars24.CarApplication")).build();
	   }*/

}
