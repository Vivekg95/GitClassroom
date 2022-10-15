package accessmodifier;

public class protectedClassAndDataMemberInJava {

	protected static String NAME = "raj";
	protected String CLASS = "Mehak";
	protected final String UNIQUE_NAME = "Palak";
	protected final static String UNIQUE_LAST_NAME = "TERRY";

	// Return nothing
	protected void sum() {
		int a = 5;
		int b = 10;
		int mul = a * b;
		System.out.println("Multiplication is = " + mul);
	}

	// Does not need to create object of class to access this method
	protected static void div(int a, int b) {

		// Return divider
		int div = a / b;
		System.out.println("Division is = " + div);
	}

	// Does not need to create object of class to access this method. It will have
	// return type
	protected static int div(int a, int b, int c) {

		// Return remainder
		int div = a % b;
		System.out.println("remainder is = " + div);
		System.out.println("Multiplication with remainder is = " + div * c);
		return div;
	}

	public static int sums(int a, int b, int c) {

		// Return remainder
		int div = a % b;
		System.out.println("remainder is = " + div);
		System.out.println("Multiplication with remainder is = " + div * c);
		return div;
	}

	public static void main(String[] args) {
		protectedClassAndDataMemberInJava protectedClassInJava = new protectedClassAndDataMemberInJava();
		protectedClassInJava.sum();
		div(10, 2);
		div(10, 23, 10);

		// calling protected member of class within same class file.
		ChildClass childClass = new ChildClass();
		childClass.childAbs(12, 12, 11, 22, 11);
		ChildClass.childAbs(1, 3, 4, 6);
		ChildClass.childDiv(6, 9, 9);
	}

}

/**
 * calling protected member of class within same class file.
 * 
 * @author Vivek Kumar
 *
 */
class ChildClass {

	// Does not need to create object of class to access this method. It will have
	// return type
	protected static int childDiv(int a, int b, int c) {

		// Return remainder
		int div = a % b;
		System.out.println("remainder is = " + div);
		System.out.println("Multiplication with remainder is = " + div * c);
		return div;
	}

	// Does not need to create object of class to access this method. It will have
	// return type
	protected static int childAbs(int a, int b, int c, int d) {

		// Return remainder
		int div = a % b;
		System.out.println("remainder is = " + div);
		System.out.println("Multiplication with remainder is = " + div * c * d);
		return div;
	}

	// Does not need to create object of class to access this method. It will have
	// return type
	protected int childAbs(int a, int b, int c, int d, int e) {

		// Return remainder
		int div = a % b;
		System.out.println("remainder is = " + div);
		System.out.println("Multiplication with remainder is = " + div * c * d * e);
		return div;
	}

}
