package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary01 {
	
	/*
	 * Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be �The integer is even�.
 If the integer is odd, the output will be �The integer is odd�.



Type java code by using ternary .Ask user to enter two integers
Write a program to print the minimum one on the console.


*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int a = scan.nextInt();
		//First Question
		// condition Question Mark Code will be excuted if the condition is true Colon code will be excuted if the condition is false 
		// a%2==0 ? "The integer is even" : "The integer is odd";
		
		// 1.Way:
		String result1 = a%2==0 ? "The integer is even" : "The integer is odd";
	
		System.out.println(result1);
	
		//2.Way:
		
		// a%2==0 ? "The integer is even" : "The integer is odd";
		
		// Second Questions
		System.out.println("Enter 2 integers");
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int result2 = b>c ? c : b;
		
		System.out.println(result2);
	
	}
	

}
