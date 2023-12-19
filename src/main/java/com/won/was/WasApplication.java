package com.won.was;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WasApplication {

	public static void main(String[] args) {
		SpringApplication.run(WasApplication.class, args);
	}

}
