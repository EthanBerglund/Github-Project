package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * This JUnit Test Case tests the output of the AddingMachine class, 
 * comparing the expected output for given inputs with the actual output.
 * 
 * @author Ethan H. M. Berglund
 * @version 1.0
 * @since 10-8-2019
 * 
 * Written for CSE360, taught by Debra Calliss at Arizona State University
 *
 */
public class AddingMaching_JUnit {

	
	@Test
	public void test0() {
		int testInt;
		String testString;
		
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		testInt = myCalculator.getTotal();
		testString = myCalculator.toString();
		
		assertEquals(7, testInt);
		assertEquals("0 + 4 - 2 + 5 ", testString);
	}
	
	@Test
	public void test1() {
		int testInt;
		String testString;
		
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(1);
		myCalculator.subtract(1);
		myCalculator.add(1);
		
		testInt = myCalculator.getTotal();
		testString = myCalculator.toString();
		
		assertEquals(1, testInt);
		assertEquals("0 + 1 - 1 + 1 ", testString);
	}
	
}
