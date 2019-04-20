package com.example.utilities;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
	public List sort(List list) {
		System.out.println("This is Bubble Sort");
		return list;
	}

}
