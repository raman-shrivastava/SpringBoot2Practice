package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.example.utilities.DataUtility;
import com.example.utilities.PropertiesService;


@SpringBootApplication
@ComponentScan("com.example.utilities")
@PropertySource("classpath:system.properties")
public class PracticeProjectApplication {

	private static Logger logger = LoggerFactory.getLogger(PracticeProjectApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PracticeProjectApplication.class, args);
		
		DataUtility utility = context.getBean(DataUtility.class);
		List result = utility.sort(new ArrayList<>());
		
		logger.info("List Size - {}", result.size());

		PropertiesService propertyService = context.getBean(PropertiesService.class);
		logger.info("Application Name: {}", propertyService.getAppName());
	}

}
