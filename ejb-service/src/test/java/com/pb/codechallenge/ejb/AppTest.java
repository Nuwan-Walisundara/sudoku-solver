package com.pb.codechallenge.ejb;

import com.pb.codechallenge.exception.SudokuException;
import com.pb.codechallenge.util.PuzzelType;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp1() {
		String inputStr ="x,x,x,2,6,x,7,x,x,1,6,8,x,x,7,x,x,9,x,1,9,x,x,x,4,5,x,x,8,2,x,"+
				"1,x,x,x,4,x,x,x,4,6,x,2,9,x,x,x,5,x,x,x,3,x,2,8,x,x,9,3,x,x,x,7,4,x,4,8,9,5,x,x,3,6,7,x,3,x,"+
				"1,8,x,x,x";
		
		String[] inputArray= inputStr.split(",");
		try {
			PuzzelBuilderble builderblePuzzel = PuzzelFactory.createPuzzelBulder(PuzzelType.NINEBYNINE);
			builderblePuzzel.fill(inputArray);
			System.out.println(builderblePuzzel.getResult().toString());
		} catch (SudokuException e) {
			System.err.println(e);
		}
		
		assertTrue(true);
	}
	

	public void testApp2() {
		String inputStr ="4,3,5, 2,6,9, 7,8,1,"+ 
						"6,8,2, 5,7,1,4,9,3,"+
						"1,9,7, 8,3,4, 5,6,2,"+
						"8,2,6, 1,9,5, 3,4,7,"+
						"3,7,4, 6,8,2, 9,1,5,"+
						"9,5,1, 7,4,3, 6,2,8,"+
						"5,1,9, 3,2,6, 8,7,4,"+
						"2,4,8, 9,5,7, 1,3,6,"+
						"7,6,3, 4,1,8, 2,5,9";
		
		String[] inputArray= inputStr.split(",");
		try {
			PuzzelBuilderble builderblePuzzel = PuzzelFactory.createPuzzelBulder(PuzzelType.NINEBYNINE);
			builderblePuzzel.fill(inputArray);
			System.out.println(builderblePuzzel.getResult().toString());
			
		} catch (SudokuException e) {
			System.err.println(e);
		}
		
		assertTrue(true);
	}
	
	public void testApp3() {
		System.out.println("Test 3 :Adjacent column contains the same number");
		String inputStr ="4,3,5, 2,6,9, 7,8,1,"+ 
						"6,8,2, 5,7,1,4,9,3,"+
						"1,9,7, 8,3,4, 5,6,2,"+
						"8,2,6, 1,9,5, 3,4,7,"+
						"3,7,4, 6,8,2, 9,1,5,"+
						"9,5,1, 7,7,3, 6,2,8,"+ //Adjacent column contains the same number
						"5,1,9, 3,2,6, 8,7,4,"+
						"2,4,8, 9,5,7, 1,3,6,"+
						"7,6,3, 4,1,8, 2,5,9";
		
		String[] inputArray= inputStr.split(",");
		try {
			PuzzelBuilderble builderblePuzzel = PuzzelFactory.createPuzzelBulder(PuzzelType.NINEBYNINE);
			builderblePuzzel.fill(inputArray);
			System.out.println(builderblePuzzel.getResult().toString());
			
		} catch (SudokuException e) {
			System.err.println(e);
		}
		
		assertTrue(true);
	}
	
	
	public void testApp4() {
		System.out.println("Test 4 :Adjacent rows contains the same number");
		String inputStr ="4,3,5, 2,6,9, 7,8,1,"+ 
						"6,8,2, 5,7,1,4,9,3,"+
						"1,9,7, 8,3,4, 5,6,2,"+
						"8,2,6, 1,9,5, 3,4,7,"+
						"9,7,4, 6,8,2, 9,1,5,"+
						"9,5,1, 7,4,3, 6,2,8,"+
						"5,9,9, 3,2,6, 8,7,4,"+
						"2,4,8, 9,5,7, 1,3,6,"+
						"7,6,3, 4,1,8, 2,5,9";
		
		String[] inputArray= inputStr.split(",");
		try {
			PuzzelBuilderble builderblePuzzel = PuzzelFactory.createPuzzelBulder(PuzzelType.NINEBYNINE);
			builderblePuzzel.fill(inputArray);
			System.out.println(builderblePuzzel.getResult().toString());
			
		} catch (SudokuException e) {
			System.err.println(e);
		}
		
		assertTrue(true);
	}
	
	public void testApp5() {
		String inputStr ="4,3,5, 2,6,9, 7,8,1,"+ 
						"6,8,2, 5,7,1,4,9,3,"+
						"1,9,7, 8,3,4, 5,6,2,"+
						"8,2,6, 1,9,5, 3,4,7,"+
						"3,7,4, 6,8,2, 9,1,5,"+
						"9,5,1, 7,4,3, 6,2,8,"+
						"5,1,9, 3,2,1, 8,7,4,"+
						"2,4,8, 9,5,7, 1,3,6,"+
						"7,6,3, 4,1,8, 2,5,9";
		
		String[] inputArray= inputStr.split(",");
		try {
			PuzzelBuilderble builderblePuzzel = PuzzelFactory.createPuzzelBulder(PuzzelType.NINEBYNINE);
			builderblePuzzel.fill(inputArray);
			System.out.println(builderblePuzzel.getResult().toString());
			
		} catch (SudokuException e) {
			System.err.println(e);
		}
		
		assertTrue(true);
	}

}
