package seleniumTestCases;

import java.io.PrintStream;
import java.util.ArrayList;

public class BeginnerLevelCodingTest {
	
	public void logInfoMessage(Object obj) {
		
		System.out.println( obj.toString());
	
	}
	
	public static void main(String args[]) {
		
		BeginnerLevelCodingTest codingTest=new BeginnerLevelCodingTest();
		
		String var1="This is my first code after a long time.";
		
		//Initialize list
		ArrayList<String> listOfString=new ArrayList<>();
		listOfString.add("First time");
		listOfString.add("Nope,and me");
		
		codingTest.logInfoMessage(var1);
		codingTest.logInfoMessage(listOfString);
	}
}
