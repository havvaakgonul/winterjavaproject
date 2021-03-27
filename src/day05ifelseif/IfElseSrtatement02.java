package day05ifelseif;

import java.util.Scanner;



public class IfElseSrtatement02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a character to check if it is in alphabet or not");
		
		char ch = scan.next().toLowerCase().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println(ch+ " is an alphabet");
		}
	}

}
