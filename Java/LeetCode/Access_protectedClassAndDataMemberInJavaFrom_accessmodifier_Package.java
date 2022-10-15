package LeetCode;

import accessmodifier.protectedClassAndDataMemberInJava;

public class Access_protectedClassAndDataMemberInJavaFrom_accessmodifier_Package
		extends protectedClassAndDataMemberInJava {

	protected void sum() {
		int a = 500;
		int b = 10;
		int mul = a * b;
		System.out.println("Multiplication is = " + mul);
	}

	public static void main(String[] args) {
		childClass childClass = new childClass();
		childClass.sum();
		protectedClassAndDataMemberInJava.sums(1, 2, 3);

		// Create object
		Access_protectedClassAndDataMemberInJavaFrom_accessmodifier_Package acc = new Access_protectedClassAndDataMemberInJavaFrom_accessmodifier_Package();
		acc.sum();
		acc.NAME = "vivek updated";
		// acc.UNIQUE_NAME = "aa"; //it is final variable ,so it will throw error
		System.out.println(acc.NAME);

		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * The field protectedClassAndDataMemberInJava.CLASS is not visible
		 * System.out.println(protectedClassAndDataMemberInJava.CLASS);
		 */

	}

}

class childClass extends protectedClassAndDataMemberInJava {
	// Return nothing
	public void sum() {
		int a = 5;
		int b = 10;
		int mul = a * b;
		System.out.println("Multiplication is = " + mul);
	}

}
