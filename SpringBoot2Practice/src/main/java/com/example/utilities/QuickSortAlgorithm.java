package com.example.utilities;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quicksort")
public class QuickSortAlgorithm implements SortAlgorithm {

	private static Logger LOGGER = LoggerFactory.getLogger(QuickSortAlgorithm.class);
	@Override
	public List sort(List list) {
		LOGGER.info("This is Quick Sort");
		return list;
	}

}
