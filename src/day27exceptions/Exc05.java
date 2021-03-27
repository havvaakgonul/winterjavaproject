package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exc05 {
	/*
	 1)"Throws" keyword is used for "checked exceptions"
	 2)"Throws" keyword is used when we do not want to handle exception
	 3)After "throws" keyword, you can multiple Exception classes by putting comma between them
	 4)"throws" keyword cannot be used in method body. It must be used in method name line  
	 5)After "throws" keyword, if you use child and parent Exception Classes together, it works but not recommended
	 because when you use just parent it will cover the child.
	 */
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		FileInputStream fis = new FileInputStream("\\Users\\10\\eclipse-workspace\\winterjavaproject\\src\\day25overridingexceptions\\fileForExc");
		
		int k = 0;
	
		while((k = fis.read()) != -1) {
			
			System.out.print((char)k);
			
		}
		
	}
	
}