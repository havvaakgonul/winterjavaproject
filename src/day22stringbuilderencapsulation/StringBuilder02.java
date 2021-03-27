package day22stringbuilderencapsulation;

public class StringBuilder02 {
	
	/*
	 In StringBuilder we use "append()", In String we use "concat()" or "+" 
	 */

	public static void main(String[] args) {
		
		long startingTimeSb=System.nanoTime();
		StringBuilder sb1= new StringBuilder();
		for(int i=0; i<1000; i++) {
			sb1.append("abc");
		}
		long endingTimeSb=System.nanoTime();
		// bilgisayarýn performansý internet hýzýna göre degisebilir
		System.out.println(endingTimeSb-startingTimeSb);
		
		
		long startingTimeStr=System.nanoTime();
		String str1= new String();
		for(int i=0; i<1000; i++) {
			str1.concat("abc");
		}
		long endingTimeStr=System.nanoTime();
		System.out.println(endingTimeStr-startingTimeStr);
	}

}
