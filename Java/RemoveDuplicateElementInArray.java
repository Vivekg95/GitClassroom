package simpleabstraction;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Remove duplicate element in array.
 * 
 * @author Vivek Kumar
 *
 */
public class RemoveDuplicateElementInArray {

	/**
	 * int: Remove duplicate element.
	 */
	public static void removeDuplicateElementUsingSet(int[] intArrayVal) {

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < intArrayVal.length; i++) {
			set.add(intArrayVal[i]);
		}
		Object[] arrays = set.toArray();
		System.out.println("int: Array after removing duplicate element is = " + set);
		System.out.println("Object: int: Array after removing duplicate element is = " + Arrays.toString(arrays));

	}

	/**
	 * Integer: Remove duplicate element.
	 */
	public static void removeDuplicateElementUsingSet(Integer[] intArrayVal) {

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < intArrayVal.length; i++) {
			set.add(intArrayVal[i]);
		}
		// Integer[] intArrayVal2 = (Integer[]) set.toArray();
		System.out.println("Integer: Array after removing duplicate element is = " + set);

	}

	/**
	 * String: Remove duplicate element.
	 */
	public static String[] removeDuplicateElementUsingSet(String[] stringArrayVal) {

		Set<String> set = new HashSet<>();
		for (int i = 0; i < stringArrayVal.length; i++) {
			set.add(stringArrayVal[i]);
		}
		System.out.println("SET:String:Array after removing duplicate element is = " + set);
		stringArrayVal = new String[set.size()];

		int k = 0;
		for (String j : set) {
			stringArrayVal[k++] = j;

		}
		System.out
				.println("Array:String:Array after removing duplicate element is = " + Arrays.toString(stringArrayVal));
		return stringArrayVal;

	}

	public static void main(String[] args) {

		int[] intArray = new int[] { 1, 2, 3, 4, 1, 9, 2, 1, 1, 87 };
		String[] strArray = new String[10];
		Integer[] intArray2 = new Integer[1];
		int[] intArrays = { 1, 2, 3, 4, 1, 9, 2, 1, 1, 87 };
		String[] strArraysVal = { "A", "B", "C", "A", "a", "Bc", "A" };
		Integer[] intArrayVals2 = { 11, 22, 32, 44, 11, 99, 22, 11, 11, 877 };

		int[] intArrayVal = new int[] { 1, 2, 3, 4, 1, 9, 2, 1, 1, 87 };
		String[] strArrayVal = new String[] { "A", "B", "C", "A", "a", "Bc", "A" };
		Integer[] intArrayVal2 = new Integer[] { 11, 22, 32, 44, 11, 99, 22, 11, 11, 877 };
		System.out.println("Size before removing duplicate elemnt is = " + strArray.length);
		removeDuplicateElementUsingSet(intArrayVal);
		removeDuplicateElementUsingSet(strArrayVal);
		removeDuplicateElementUsingSet(intArrayVal2);

		strArray = removeDuplicateElementUsingSet(strArrayVal);
		System.out.println("Size after removing duplicate elemnt is = " + strArray.length);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("elemtn at" + i + " th position is = " + strArray[i]);

		}

	}

}
