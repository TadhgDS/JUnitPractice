package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void testArraySort() {
		int[] numbers = {6,2,5,10,4,11,1};
		Arrays.sort(numbers);
		int[] expectedOutput = {1,2,4,5,6,10,11};
		assertArrayEquals(expectedOutput, numbers);
	}

	@Test(expected=NullPointerException.class)
	public void testArraySortNullCondition(){
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout=100)
	public void testArraySortPerformance(){
		for(int i=0; i<40; i++){
			int[] numbers = {i,i-1,i+1};
			Arrays.sort(numbers);
		}
	}
}
