package com.example.utilities;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DataUtility {

	private static Logger logger = LoggerFactory.getLogger(DataUtility.class);
	
	@Autowired
	@Qualifier("quicksort")
	private SortAlgorithm sortAlgorithm;

	public List sort(List list) {
		
		return sortAlgorithm.sort(list);
	}
	
	@PostConstruct
	private void init() {
		logger.info("Initializing DataUtility using PostConstruct");
	}
	
	@PreDestroy
	private void destroy() {
		logger.info("Calling destroy on DataUtility using PreDestroy");
	}
}
