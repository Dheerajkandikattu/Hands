package com.org.tav.JunitDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

	private final int N=10;
	private int[] vals=new int[N];
	@BeforeAll
	void beforeEach(RepetitionInfo info)
	{
		System.out.printf("Test #%d%n",info.getCurrentRepetition());
		var r=new Random(System.nanoTime());
		for(int i=0;i<N;i++)
		{
			vals[i]=r.nextInt(100);
		}
	}

	@RepeatedTest(value = 40,name="{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Should sort values")
	void doSort()
	{
		System.out.println(Arrays.toString(vals));
		var sorted = MySelectionSort.doSort(vals);
		Arrays.sort(vals);
		System.out.println(Arrays.toString(sorted));
		assertEquals(sorted, vals);
		
	}
	

}
