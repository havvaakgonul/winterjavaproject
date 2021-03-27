package day02scanner;

import java.util.Scanner;
/*
  Type a program which calculates the area and the perimeter of a rectangle
whose length and with are entered by user.
Hint 1: Area of a rectangle is width x length
Hint 2: Perimeter of a rectangle is 2x (width + length)
 */
public class ScannerClass03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please, enter length of the rectangle");
		double length = scan.nextDouble();
	
		System.out.println("please, enter width of the rectangle");
		double width = scan.nextDouble();
		
		System.out.println(" Area:" +width*length);
		System.out.println("Perimeter: "+ (2*(width+length)));
		
	}
}
