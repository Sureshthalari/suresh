package p1;

import java.util.Scanner;

public class EqualsOperator {

	public static void main(String[] args) {
		
		/*
		 * String str1 = new String("Hello"); String str2 = new String("Hello");
		 * 
		 * if(str1 == str2) { System.out.println("Strings are equals"); }else {
		 * System.out.println("Strings are not equals"); }
		 */
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
	    if(str1.equalsIgnoreCase(str2)) {
	    	System.out.println("Strings are equals");  	
	    }else {
	    	System.out.println("Strings are not equals");
	    }
		
	    @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
	    
	    System.out.println("Enter the String-1:");
	    String s1=sc.nextLine();
	    System.out.println("Enter the String-2:");
	    String s2=sc.nextLine();
	    
	    if(s1.equalsIgnoreCase(s2)) {
	    	System.out.println("Strings are equals");
	    }else {
	    	System.out.println("Strings are not equals");
	    }		
	}
}
