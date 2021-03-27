package day10forloops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		factorial ();

	}

	/*
	 Get an ýnteger from user and calculate the factorýal 
	 for example; user --->5 ==>5!=120
	
	
	  */
	
	public static void factorial () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to see multiplication table");
		int d = scan.nextInt();
		
		int i=1;
		int result = 1;
		
		while (i<=d) {
			
			result = result*i;
			i++;
		}
		System.out.println(result);
	
		scan.close();
	}
	
	
}
