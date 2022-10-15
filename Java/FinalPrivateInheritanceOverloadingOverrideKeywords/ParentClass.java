/**
 * Final class cannot be extended.
 * 
 * @author Vivek Kumar
 *
 */
public class ParentClass {
	public String className = this.getClass().getName();

	public String getClassName() {
		return className;
	}

	static class NestedClassInsideMainClass {
		private static void name() {
			System.out.println("nestedClassInsideMainClass");

		}

		private void name2() {
			System.out.println("nestedClassInsideMainClass");

		}
	}

	public static void main(String[] args) {
		FinalClassInJavaVehicle finalClassInJavaVehicle = new FinalClassInJavaVehicle();

		// No need to create object of class if static method is accessed
		FinalClassInJavaVehicle.Bus();

		// Need to create a object of class if non-static and public method is accessed
		finalClassInJavaVehicle.car();

		ParentClass parentClass = new ParentClass();
		System.out.println(parentClass.className);
		System.out.println(parentClass.getClassName());

		// Call final variable that is also static in nature without creating the object
		System.out.println(FinalClassInJavaVehicle.NAME);

		// Call variable that is also non-static ,final and public in nature after
		// creating the object
		System.out.println(finalClassInJavaVehicle.RK);

		/**
		 * Try to change final variable. It will give error
		 */
		String variable1 = FinalClassInJavaVehicle.NAME;

		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * The final field FinalClassInJavaVehicle.NAME cannot be assigned
		 * 
		 * FinalClassInJavaVehicle.NAME = "variable2"; finalClassInJavaVehicle.RK = "f";
		 */

		System.out.println(variable1 + " is updated ");

		// Create object of subclass
		callingFinalCLassAndMethod callingFinalCLassAndMethod = new callingFinalCLassAndMethod();
		callingFinalCLassAndMethod.TVS();
		callingFinalCLassAndMethod.Hero();

		// create object of nested class
		callingFinalCLassAndMethod.StaticNestedClass calll = new callingFinalCLassAndMethod.StaticNestedClass();
		calll.StaticNestedMethodName();

		NestedClassInsideMainClass nes = new NestedClassInsideMainClass();
		nes.name2();
		NestedClassInsideMainClass.name();
	}

}

class callingFinalCLassAndMethod extends FinalMethodInJava {

	// Cannot override the final method from FinalMethodInJava
	/*
	 * void Hero() { System.out.println("SP125"); }
	 * 
	 * 
	 */
	static class StaticNestedClass {

		public void StaticNestedMethodName() {

			System.out.println("StaticNestedMethodName");
		}

	}

	public void name() {

		System.out.println("Hi");
	}
}
