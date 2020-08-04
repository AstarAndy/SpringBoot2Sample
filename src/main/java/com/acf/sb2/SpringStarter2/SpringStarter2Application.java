package com.acf.sb2.SpringStarter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStarter2Application {

	public static void main(String[] args) {
		ApplicationContext springContext = SpringApplication.run(SpringStarter2Application.class, args);
	}

}
