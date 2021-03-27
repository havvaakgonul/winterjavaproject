package day25overridingexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {
	/*
	 1)Exceptions are unexpected errors in java
	 2)Exceptions can handle by using try-catch blocks
	 3)ArithmeticException is thrown by java in RunTime if there is any issue in Mathematical Operations.
	 4)FileNotFoundException occurs in Compile Time, if there is any issue in the path of the file or in the 
	 	existence of the file
	 */

	public static void main(String[] args) {
		FileInputStream fis=null;
			//Unhandled exception type FileNotFoundException
			// 
	try {
		fis=new FileInputStream("\\Users\\10\\eclipse-workspace\\winterjavaproject\\src\\day25overridingexceptions\\fileForExc");
	}catch(FileNotFoundException e) {
		System.out.println("The file is deleted or the path is wrong ");
		
	}
	
	
	}

}
