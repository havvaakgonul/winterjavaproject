package day10forloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		printOdd1();
		System.out.println();
		printOdd2();
		System.out.println();
		printDivBySixEight();
	}

	/*
	 	Type a program o print odd integers from 4 to 25 in the same line with a space on the console
	  	1)Use for-loop
	  	2)Use while-loop
	 
	  */
//for loop
	public static void printOdd1() {
		
		
		for (int i=4; i<=26; i++) {
			
			if (i%2!=0) {
			
				System.out.print(i+" ");
			
			}
		
		}
	
	}
	
// While loop
	// more readeble

	public static void printOdd2() {
		int i=4;
		
		while(i<26) {
			
			if(i%2!=0) {
				
				System.out.print(i+ " ");

			}
		
			i++;
		}	
	}

	
	/*
	 Create a method to print integers which are divisible by 6 and 8 from 500  to 25 on the console
	
	 * */
	public static void printDivBySixEight() {
		int i=500;
		
		while(i>25) {
			
			if(i%6==0 && i%8==0 ) {
				
				System.out.print(i+ " ");

			}
		
			i--;

		}

		}

}
