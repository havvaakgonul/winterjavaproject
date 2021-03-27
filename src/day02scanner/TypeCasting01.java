package day02scanner;

public class TypeCasting01 {
	/* 
	 */

	public static void main(String[] args) {
// Auto Widening: 	
		
		byte b1 = 112;
		int i1 = b1;
		
		System.out.println(b1);  
		System.out.println(i1);
		
		int i2=120;
		short s1 = (short)i2;
		
		System.out.println(i2);
		System.out.println(s1);
		

	}

}
