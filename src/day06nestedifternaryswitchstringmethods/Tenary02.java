package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Tenary02 {
	
	/*
	 * Type java code by using ternary.
Write a program to print absolute value of an integer entered by user.
	 * 
	 *
	 * Type java code by using using ternary.
	Take values of length and width of a rectangle from user and check if it is square or not.

	 * 
	 * 
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//	First Question
//		System.out.println("Enter an integer...");
//		int a = scan.nextInt();
		
//		int result1 = a<0 ? -1* a: a;
//		System.out.println(result1);

		//Qecond Question
		System.out.println("Enter the length and width of the regtangle");
		double length = scan.nextDouble();
		double width = scan.nextDouble();
		
		String result2 = length == width ? "Square" :"Rectangle";
		
		System.out.println(result2);
	
	
	
	
	}


}
