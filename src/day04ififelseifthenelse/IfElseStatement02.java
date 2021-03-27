package day04ififelseifthenelse;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		
		char ch = scan.next().charAt(0);
		
		if(ch>='a'&& ch<='z') {
			System.out.println("ýt is from alfabeth");
		}else {
			System.out.println("it is not from alfabeth");
			
		}
	
	}

}
