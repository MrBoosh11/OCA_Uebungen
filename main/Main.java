package main;

/**
 * This is main method.
 * 
 * @author Timon 11/08/2023
 */

public class Main {
	
	public static void main(String[] args) {
		// printing size of arguments
		//
		//
		System.out.println("args-size= " + args.length);
		
		/*
		 * printing arguments
		 * another line
		 */
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args [" + i + "]=" + args[i]);
		}
		
		sum(5, 6);
	}
	
	/**
	 * Calculates sum of two integers.
	 * 
	 * @param a operand
	 * @param b operand
	 * @return sum
	 */
	public static int sum(int a, int b ) {
		return a + b;
	}
}
