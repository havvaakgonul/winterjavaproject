package day26exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions01 {
	/*
	 1)There are 2 main types of Exceptions;
	  a)Compile Time Exceptions
	  b)Run Time Exceptions
	  2)After try block you can use 1 or more catch blocks
	  3)Try block cannot be used alone
	  4)When you use multiple 
	
	 */
	/*
	 What is the meaning of "platform independent"?
	 the meaning of platform-independent is that the java compiled code(byte code) can run on all operating systems.
	 */

	public static void main(String[] args) {
		FileInputStream fis=null;
		// You may use nested try-catch block
	/*	try {
			fis= new FileInputStream("\\Users\\10\\eclipse-workspace\\winterjavaproject\\src\\day25overridingexceptions\\fileForExc");
		
		int k=0;
		try {
		while((k=fis.read())!=-1) {
			
			System.out.print((char)k);
		}
		}catch(IOException e) {
			System.out.println("File could not be read");
			
		}
		
		}catch(FileNotFoundException e) {
			System.out.println("Fie is deleted or path is wrong");
	}
	*/
		
		// without using nested try-catch 
		
		try {
			fis= new FileInputStream("\\Users\\10\\eclipse-workspace\\winterjavaproject\\src\\day25overridingexceptions\\fileForExc");
		
			int k = 0;
			
			while((k = fis.read()) != -1) {
				
				System.out.print((char)k);
				
			}
		} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	
		System.out.println("File is deleted or path is wrong "+e.getMessage());
		
		}catch(IOException e){
			System.out.println("File could not be read");
		}
		
		
	}
}