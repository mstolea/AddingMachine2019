package cse360assign2;

/**
 * This class returns a integer based on arithmetic operations performed with said integer.
 * This class conducts both addition and subtraction statements.
 * This class can also return the running total of all the statements.
 * Lastly, this class also has the ability to keep a running history of all the statements executed.
 * This occurs within the form of an equation. 
 * @author Maxim Tolea, CSE 360, Assignment 2
 * @version 1.0 
 * @since 10/7/2019
 */

public class AddingMachine {
 
	private int total;
	private String equation;
	private String numberString; 
	
	
	/**
	 * This constructor initializes the total to be 0.
	 * It also initializes the equation to start out as just 0 as well. 
	 */
	public AddingMachine () {
		total = 0;  
		equation = "0";	
	}
	
	
	/**
	 * This returns the current total of the running operations.
	 * @return the current total of all the operations.
	 */
	public int getTotal () { 
		return total;
	}
	
	
	/**
	 * This specifies the add op that adds a value to a total to yield a new total.
	 * Also, the equation string is updated after each individual operation. 
	 * @param value the value of the integer to be added to the total.
	 */
	public void add (int value) { 
		total += value;
		numberString = Integer.toString(value);
		equation = equation + " + " + numberString;
	}
	
	/**
	 * This specifies the subtract op that subtracts a value from the total to yield a new total.
	 * Also, the equation string is updated after each individual operation.  
	 * @param value the value of the integer to be subtracted from the total. 
	 */
	public void subtract (int value) { 
		total -= value; 
		numberString = Integer.toString(value);
		equation = equation + " - " + numberString;
	}
	
	/**
	 * Returns the String that keeps record of all the operations completed.   
	 */
	public String toString () { 
		return equation;
	}

	/**
	 * Resets the total to 0.
	 * Resets the history of all the operations done as well.
	 */
	public void clear() {
		equation = "0";
		total = 0; 
		return; 
	}
}
