package homework;

import java.util.Scanner;

public class Day02HomeWork03 {
/*
 3)Type a program which converts the mile to kilometer. Mile value will be
entered by user. (Use double)
Hint 1: km = mile x 1.6
Hint 2: To get double, use nextDouble()
*/
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please, enter mile value");
		double mile = scan.nextDouble();
		
		double km = mile*1.6;
		System.out.println("km: "+ km);

	}

}
