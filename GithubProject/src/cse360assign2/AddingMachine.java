package cse360assign2;

/**
 * This Adding Machine class holds a total, and supports methods to add and subtract from it
 * 
 * @author Ethan H. M. Berglund
 * @version 1.0
 * @since 10-8-2019
 *
 * Written for CSE360, taught by Debra Calliss at Arizona State University
 *
 */
public class AddingMachine {

	private int total;
	private String record;
	
	
	/**
	 * The constructor for Adding Machine, which initializes both the total and the record string to 0.
	 */
	public AddingMachine () {
		total = 0;
		record = "0 ";
	}
	
	
	/**
	 * @return Returns the current total
	 */
	public int getTotal () {
		return total;
	}
	
	
	/**
	 * @param value is added to the current total
	 */
	public void add (int value) {
		total = total + value;
		record = record + "+ " + value + " ";
	}
	
	
	/**
	 * @param value is subtracted from the current total
	 */
	public void subtract (int value) {
		total = total - value;
		record = record + "- " + value + " ";
	}
		
	
	/**
	 * @return record of all additions and subtractions made thus far
	 */
	public String toString () {
		return record;
	}

	
	/**
	 * Resets both record string and running total to 0
	 */
	public void clear() {
		total = 0;
		record = "0 ";
	}
}