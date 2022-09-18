package simpleabstraction;

import java.util.Scanner;

/**
 * program to return factorial of a number using for loop, while loop and
 * recursion.
 * 
 * @author Vivek Kumar
 *
 */
public class Factorial {

	/**
	 * Factorial using for loop.
	 * 
	 * @param number Number
	 * @return return integer
	 */
	public int factorialUsingForloop(int number) {

		int f = 1;

		for (int i = number; i > 0; i--) {
			f = f * i;
		}

		return f;
	}

	/**
	 * Factorial using while loop.
	 * 
	 * @param number Number
	 * @return return integer
	 */
	public int factorialUsingWhileLoop(int number) {

		int f = number;
		while (number > 1) {
			f = f * (number - 1);
			number--;
		}
		return f;
	}

	/**
	 * Factorial using Recursion.
	 * 
	 * @param number Number
	 * @return return integer
	 */
	static int factorialByRecursion(int number) {

		if (number == 0 || number == 1) {
			return 1;
		} else {

			return number * factorialByRecursion(number - 1);
		}
	}

	/**
	 * Main method.
	 * 
	 * @param args Argument.
	 */
	public static void main(String[] args) {

		Factorial factorial = new Factorial();

		// Initialize scanner
		Scanner sc = new Scanner(System.in);

		// Enter number
		System.out.print("Enter number: ");
		int n = sc.nextInt();

		/*
		 * Print result.
		 */
		System.out.println("Factorial result with for loop is : " + factorial.factorialUsingForloop(n));
		System.out.println("Factorial result with while loop is : " + factorial.factorialUsingWhileLoop(n));
		System.out.print("Factorial result with recursion is : " + Factorial.factorialByRecursion(n));

		// close scanner
		sc.close();

	}
}
