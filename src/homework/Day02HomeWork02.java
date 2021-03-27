package homework;

import java.util.Scanner;

public class Day02HomeWork02 {

	/*  2)Type a program which calculates the perimeter of a triangle whose
Side lengths are entered by user. (Use byte)
Hint 1: Perimeter of a triangle is a + b + c
Hint 2: To get byte, use nextByte()
*/
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please, enter side length of the triangle ");
		byte length1 = scan.nextByte();
		
		System.out.println("please, enter side length of the triangle");
		byte length2 = scan.nextByte();
		
		System.out.println("please, enter side length  of the triangle");
		byte length3 = scan.nextByte();
		

		System.out.println("Primeter: "+ (length1+length2+length3));
	}

}
