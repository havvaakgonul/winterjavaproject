package day11whileloopdowhileloop;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		
		countChars();
	/*	For the String "1234_?!abcdef", type a code to count the number of letters,
		 the number of digits and the number of others by using do-while loop
	*/
	}
	
	public static void countChars() {
		String str = "957_?!abcdef";
		int idx = 0;
		int digitCounter = 0;
		int letterCounter = 0;
		int otherCounter = 0;
		
		do {
			boolean isDigit =str.charAt(idx)>='0'&&str.charAt(idx)<='9';
			
			if(isDigit) {
			digitCounter++;	
			}
			idx++;
		}while(idx<str.length());
	System.out.println(digitCounter);
	}
}
