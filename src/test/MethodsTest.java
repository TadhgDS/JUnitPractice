package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodsTest {

	@Test
	public void testtruncateAInFirst2Positions() {
		Methods aMethod = new Methods();
		
		String expectedOutput = "RTAA";
		String actualOutput = aMethod.truncateAInFirst2Positions("AAARTAA");
		assertEquals(expectedOutput, actualOutput);
	}

}
