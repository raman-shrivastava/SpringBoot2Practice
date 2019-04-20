package com.example.utilities;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.PracticeProjectApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=PracticeProjectApplication.class)
public class DataUtilityTest {

	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	@Test
	public void bubbleSortTest() {
		List actualResult = sortAlgorithm.sort(new ArrayList<>());
		
		assertNotNull(actualResult);
		
		assertEquals(0, actualResult.size());
		
		
	}

}
