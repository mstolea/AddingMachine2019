package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * This class runs test cases on the program that runs basic arithmetic operations.
 * This class tests the addition and subtraction methods.
 * This class also tests whether the accrued total is accurate.
 * Lastly, this class checks to see that the history of the operations via the equation is also accurate.
 * @author Maxim Tolea, CSE 360, Assignment 2
 * @version 1.0 
 * @since 10/7/2019
 */

class AddingMachineTest {

	/**
	 * This test case tests one addition statement and returns its resulting string output.
	 */
	@Test
	public void testOne() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		assertEquals("0 + 5", myCalculator.toString());
	}
	
	/**
	 * This test case tests one addition statement, one subtraction statement,
	 * and returns its resulting string output.
	 */
	@Test
	public void testTwo() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		myCalculator.subtract(6);
		assertEquals("0 + 5 - 6", myCalculator.toString());
	}
	
	/**
	 * This test case tests one addition statement, one subtraction statement,
	 * the clear function, and returns its resulting string output.
	 */
	@Test
	public void testThree() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		myCalculator.subtract(6);
		myCalculator.clear();
		assertEquals("0", myCalculator.toString());
	}
	
	/**
	 * This test case tests one addition statement, one subtraction statement,
	 * and returns its resulting total.
	 */
	@Test
	public void testFour() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		myCalculator.subtract(6);
		myCalculator.getTotal();
		assertEquals(-1, myCalculator.getTotal());
	}
	
	/**
	 * This test case tests multiple addition and subtraction statements, a clear statement,
	 * and returns its resulting total.
	 */
	@Test
	public void testFive() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		myCalculator.subtract(6);
		myCalculator.clear();
		myCalculator.add(4);
		myCalculator.add(3);
		myCalculator.getTotal();
		assertEquals(7, myCalculator.getTotal());
	}
	
	/**
	 * This test case returns the original total of the program itself.
	 */
	@Test
	public void testSix() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.getTotal();
		assertEquals(0, myCalculator.getTotal());
	}
	
	
	/**
	 * This test case tests out multiple addition and subtraction statements.
	 * Then, its resulting string is returned and checked for accuracy.
	 */
	@Test
	public void testSeven() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.subtract(10);
		myCalculator.add(100);
		myCalculator.add(2);
		myCalculator.subtract(7);
		myCalculator.add(3);
		assertEquals("0 - 10 + 100 + 2 - 7 + 3", myCalculator.toString());
	}
	
	
	/**
	 * This test case tests out multiple addition and subtraction statements.
	 * Then, its resulting total is returned and checked for accuracy.
	 */
	@Test 
	public void testEight() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.subtract(10);
		myCalculator.add(100);
		myCalculator.add(2);
		myCalculator.subtract(7);
		myCalculator.add(3);
		myCalculator.getTotal();
		assertEquals(88, myCalculator.getTotal());
	}
	
	/**
	 * This test case tests out multiple subtraction statements.
	 * Then, its resulting is string is returned and checked for accuracy. 
	 */
	@Test
	public void testNine() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.subtract(10);
		myCalculator.subtract(20);
		myCalculator.subtract(30);
		myCalculator.subtract(40);
		myCalculator.subtract(50);
		assertEquals("0 - 10 - 20 - 30 - 40 - 50", myCalculator.toString());
	}
	
	/**
	 * This test case tests out multiple addition statements.
	 * Then, its resulting is string is returned and checked for accuracy. 
	 */
	@Test
	public void testTen() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(10);
		myCalculator.add(20);
		myCalculator.add(30);
		myCalculator.add(40);
		myCalculator.add(50);
		assertEquals("0 + 10 + 20 + 30 + 40 + 50", myCalculator.toString());
	}
}
