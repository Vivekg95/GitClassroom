
/**
 * Copy constructor.
 * 
 * <p>
 * A constructor in Java is a special method that is used to initialize objects.
 * The constructor is called when an object of a class is created. It can be
 * used to set initial values for object attributes.
 * </p>
 * 
 * <p>
 * So constructors are used to assign values to the class variables at the time
 * of object creation, either explicitly done by the programmer or by Java
 * itself (default constructor).
 * </p>
 * 
 * <p>
 * abstract, final, static, or Synchronized. can not be used for contructor.
 * </p>
 * 
 * <p>
 * we can overload constructors for creating objects in different ways
 * </p>
 * 
 * @author Vivek Kumar
 *
 */
class Apple {
	private int length;
	private int breadth;
	private int height;

	public Apple(int a, int b, int c) {
		System.out.println("hii");
		this.length = a;
		this.breadth = b;
		this.height = c;

		// only final is permitted
		final String name;
	}

	public void multiply() {
		int area = length * breadth * height;
		System.out.println(area);
	}

	// Copy constructor copies all the contents of a constructor with reference as
	// shown below 'a'
	// When we want to create multiple objects with same characteristics, then we
	// can use copy constructor.
	public Apple(Apple a) {
		a.breadth = 99;
		a.length = 100;
		a.height = 88;

		// am trying to change the value
		breadth = a.breadth;
		length = a.length;
		height = a.height;

	}

}

/**
 * OUTPUT: hii 96 871200
 *
 */

public class CopyConstructorInJava {
	public static void main(String[] args) {

		// Here we are using constructor to assign variable at the time of object
		// creation
		Apple apple = new Apple(4, 4, 6);

		// Values applied to constructor while creating object is used by method
		apple.multiply();

		Apple ap2 = new Apple(apple);
		ap2.multiply();

	}

}
