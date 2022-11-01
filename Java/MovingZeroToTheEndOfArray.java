import java.util.Arrays;

/**
 * Moving all the zero to the rightmost/leftmost.
* @author vKumar 
 */
public class MovingZeroToTheEndOfArray {

	/**
	 * Moving all the zero to the rightmost.
	 */
	public static void moveAllZeroToRightMost() {
		int array[] = { 0, 1, 2, 23, 33, 0, 33, 0, 7, 0, 77, 0 };
		int length = array.length;
		int resArray[] = new int[array.length];
		int count = 0;

		for (int i = 0; i < length; i++) {

			if (array[i] != 0) {
				resArray[count] = array[i];
				count++;
			}
		}
		System.out.println("Count = " + count);

		if (count < length) {
			System.out.println("length - count = " + (length - count));

			for (int i = count; i < length - count; i++) {
				resArray[i] = 0;

			}

		}
		array = resArray;

		System.out.println(Arrays.toString(resArray));
		System.out.println(Arrays.toString(array));
	}

	/**
	 * Moving all the zero to the leftmost.
	 */
	public static void moveAllZeroToLeftMost() {
		int array[] = { 0, 1, 2, 23, 33, 0, 33, 0, 7, 0, 77, 0 };
		int length = array.length;
		int resArray[] = new int[array.length];
		int count = 0;

		for (int i = 0; i < length; i++) {

			if (array[i] == 0) {
				resArray[count] = 0;
				count++;
			}
		}
		System.out.println("Count is=" + count);
		System.out.println("length - count is=" + (length - count));

		if (count < length) {
			for (int i = 0; i < length; i++) {

				if (array[i] != 0) {
					resArray[count] = array[i];
					count++;
				}
			}
		}

		array = resArray;

		System.out.println(Arrays.toString(resArray));
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		moveAllZeroToRightMost();
		moveAllZeroToLeftMost();
	}

}
