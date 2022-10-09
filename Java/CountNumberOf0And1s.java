package simpleabstraction;

import java.util.Arrays;
import java.util.List;

public class CountNumberOf0And1s {
	public static void main(String[] args) {

		int[] array = { 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0 };
		List<Integer> list = Arrays.asList(0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0);
		int countOf0s = 0;
		int countOf1s = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 0) {
				countOf0s++;
			} else if (array[i] == 1) {
				countOf1s++;

			}

		}
		System.out.println("Count of 0 = " + countOf0s);
		System.out.println("Count of 1 = " + countOf1s);
	}

}
