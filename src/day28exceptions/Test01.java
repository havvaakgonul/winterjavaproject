package day28exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Work real hard");
			FileInputStream fis= new FileInputStream("\\Users\\10\\eclipse-workspace\\winterjavaproject\\src\\day25overridingexceptions\\fileForExc");
			
		}catch (IOException e) {
			
		}catch(RuntimeException e) {
			
		}
	}

}
