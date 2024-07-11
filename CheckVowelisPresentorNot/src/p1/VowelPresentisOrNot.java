package p1;

import java.util.Scanner;

public class VowelPresentisOrNot {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word::");
		String str=sc.next();
		String str1="Java";
		//exists return true otherwise false
		System.out.println(str.toLowerCase().matches(".*[aeiou].*"));
		System.out.println(str1.toLowerCase().matches(".[aeiou].*"));
		

	}

}
