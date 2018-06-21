package com.huiyingxiao.logData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * This class created for start the application.
 * 
 * 
 * @author finch.lin
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.huiyingxiao.logData"})
public class LogDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogDataApplication.class, args);
	}
}
