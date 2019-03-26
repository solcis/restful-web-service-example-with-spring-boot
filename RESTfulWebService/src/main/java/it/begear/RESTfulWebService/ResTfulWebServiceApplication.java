package it.begear.RESTfulWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication adds:
//@Configuration -> tags class as a source of bean definitions for the application context
//@EnableAutoConfiguration -> tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings
//@ComponentScan -> tells Spring to look for other components, configurations, and services in our package, allowing it to find the controllers
//@EnableWebMvc -> flags the application as a web application and activates key behaviors, Spring adds it automatically when it sees spring-webmvc on classpath
@SpringBootApplication
public class ResTfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResTfulWebServiceApplication.class, args);
	}

}
