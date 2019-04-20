package com.example.utilities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {

	@Value("${application.name}")
	private String appName;

	public String getAppName() {
		return appName;
	}
	
}
