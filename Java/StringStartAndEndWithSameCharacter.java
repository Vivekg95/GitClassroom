package simpleabstraction;

public class StringStartAndEndWithSameCharacter {
	public static void main(String[] args) {

		String[] array = { "ab", "aba", "xyx", "mno", "xyz", "pop" };

		for (int i = 0; i < array.length; i++) {

			Character startChar = array[i].toString().charAt(0);
			String startString = startChar.toString();
			if (array[i].startsWith(startString) && array[i].endsWith(startString)) {
				System.out.println("String is = " + array[i]);
			}
		}

	}
}
