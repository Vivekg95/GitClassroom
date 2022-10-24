package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that takes as input a sorted array of numbers. The objective
 * is to return the array arranged in an alternate order such that max value is
 * followed by min value in a descending fashion, so that the 1st element is the
 * max value, 2nd element is the min value, 3rd element is the second max value,
 * 4th element is the second min value & so on.
 * 
 * <p>
 * Set of number is =[1, 3, 22, 99, 232, 343, 7568]
 * </p>
 * <p>
 * Max array is = [7568, 343, 232]
 * </p>
 * <p>
 * Min array is = [1, 3, 22, 99]
 * </p>
 * <p>
 * Resulting array= [7568, 1, 343, 3, 232, 22, 99]
 * </p>
 * 
 * @author Vivek Kumar
 *
 */
public class MinAndMaxNumberAndInputNumberInSortedOrder {

	/**
	 * Take and print input array in sorted order.
	 * 
	 * @return
	 */
	public static int[] takeInputNumberAsSortedArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of digit.");

		// Initialize variables to store s
		int lengthOfdigit = sc.nextInt();

		// Initialize set to store element in sorted array
		int[] array = new int[lengthOfdigit];

		for (int i = 0; i < lengthOfdigit; i++) {
			int number = sc.nextInt();
			array[i] = number;

		}
		Arrays.sort(array);
		// Collections.sort(Arrays.asList(array));
		System.out.println("Set of number is =" + Arrays.toString(array));
		sc.close();
		return array;

	}

	/**
	 * Print max and min number in a sequence, like 10,2,8,3 etc.
	 */
	public static int[] minAndMaxNumberInSequence() {

		int num[] = takeInputNumberAsSortedArray();
		int lengthOfArray = num.length;
		int maxArray[] = new int[lengthOfArray / 2];// 2
		int minArray[] = new int[lengthOfArray - lengthOfArray / 2];// 2
		int resultArray[] = new int[lengthOfArray];

		// MaxArray i=0;i<2
		for (int i = 0; i < lengthOfArray / 2; i++) {
			maxArray[i] = num[lengthOfArray - (i + 1)];
		}
		System.out.println("Max array is = " + Arrays.toString(maxArray));

		// MinArray i=2;i<4
		for (int i = 0; i < lengthOfArray - lengthOfArray / 2; i++) {
			minArray[i] = num[i];
		}
		System.out.println("Min array is = " + Arrays.toString(minArray));

		// Resulting array 10,9,8, 7,6,5,4
		int j = 0;
		// int leftNumber = 0;
		for (int i = 0; i <= lengthOfArray / 2; i++) {
			if (j < maxArray.length) {
				resultArray[j + i] = maxArray[i]; // 0- 99 , 1- 1[j=1], 2-22,3-2 [j=2] ,
				resultArray[j + i + 1] = minArray[i];
			} else {
				if (minArray.length - maxArray.length == 0) {
					System.out.println("Break");
					break;
				} else {
					System.out.println("Inserting last element.");
					resultArray[j + i] = minArray[i];
				}
			}
			System.out.println("j = " + j);
			j++;
		}
		System.out.println(Arrays.toString(resultArray));

		return resultArray;

	}

	public static void main(String[] args) {

		minAndMaxNumberInSequence();
	}

}
