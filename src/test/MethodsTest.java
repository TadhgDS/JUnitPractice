package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MethodsTest {

	Methods aMethod;
	
	@Before
	public void before(){
		aMethod = new Methods();
	}
	
	@After
	public void after(){
		aMethod = null;
	}
	
	
	@Test
	public void testtruncateAInFirst2Positions() {
		String expectedOutput = "RTAA";
		String actualOutput = aMethod.truncateAInFirst2Positions("AARTAA");
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame(){
		assertFalse(aMethod.areFirstAndLastTwoCharactersTheSame("HOLYMOLY"));
	}
	
	@Test
	public void Test2areFirstAndLastTwoCharactersTheSame(){
		assertTrue(aMethod.areFirstAndLastTwoCharactersTheSame("HOLYMOHO"));
	}
	

}





