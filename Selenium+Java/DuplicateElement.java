package takeScreenshot;

import java.util.Scanner;

public class DuplicateElement {
	
	public static void main(String[] args) {
		System.out.print("Enter the size of array.");
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Enter the size of string.");
		String s=sc.next();
		
		 String[] array=new String[n];
		 int arr[]=new int[n];
		for(int i=0;i<3;i++) {

			 n=sc.nextInt();
			 arr[i]=n;
			 array[i]="qwerty"+n;
			 System.out.println(arr[i]+" String ="+array[i]);
	
	}

}}
