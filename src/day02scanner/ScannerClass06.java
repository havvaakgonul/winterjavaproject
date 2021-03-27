package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {
/* Ask user to enter his/her full name
	 	Then ask user to enter his/her spouse's first name
	 	Then ask user to enter his/her adress
	 	Then print them all on the console.
	 	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your full name");

		String fullName = scan.nextLine();
		
		System.out.println("Your full name is" + fullName);
		
		
		
	}

}
