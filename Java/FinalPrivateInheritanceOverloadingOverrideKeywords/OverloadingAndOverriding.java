
/**
 * If you want to make class private , just make all method/variable as private
 * 
 * @author Vivek Kumar
 *
 */
public class OverloadingAndOverriding {

	public static void main(String[] args) {
		B b = new B();
		b.addition();

		// Double gives decimal precision upto 15 decimal points
		double res = b.addition(95666.99988888999888999, 988899.8899889889988);

		// Float gives decimal precision upto 7 decimal points
		float res2 = b.addition(95666.99988888999888999f, 988899.8899889889988f);
		System.out.println(res);
		System.out.println(res2);

		/**
		 * Below is the output
		 * <p>
		 * addition6 10 sum 9.460508566569994E10 9.4605083E10
		 * </p>
		 */
		innerClassExtendingInnerPrivateClass overloading2 = new innerClassExtendingInnerPrivateClass();
	}

}

//Parent class
class A {
	public void addition() {
		int mul = addition(2, 3);
		int add = addition(2, 3, 5);
		System.out.println("addition" + mul + " " + add + " " + sum());
	}

	private int addition(int a, int b) {
		return a * b;
	}

	private int addition(int a, int b, int c) {
		return a + b + c;
	}

	private String sum() {
		return "sum";
	}
}

//Child class /sub class
class B extends A {

	// Double size 8 bytes (64 bits). Decimal precision upto 7 to 15 points
	public double addition(double a, double b) {
		return a * b;

	}

	// float size 4 bytes (32 bits). Decimal precision upto 7 points
	public float addition(float a, float b) {
		return a * b;

	}
}

/**
 * inner class extending inner private class.
 *
 */
class innerClassExtendingInnerPrivateClass {

	private class overLoadingMethod {

		public void add() {
			System.out.println("Addition");
		}
	}

	class overLoad extends overLoadingMethod {
		public void add() {
			System.out.println("Addition");
		}
	}

}
