package day10forloops;

public class ForLoop03 {

	public static void main(String[] args) {
		sumOfAllInt();

	}
	/*
	 Find the sum of all integers from 10 to 200
	 *
	 * 
	 * Why do we put 0 but not an empty container? I missed it even if you explained it sorry.
in string put an element that doesn´t effect the result (in this case zero)
	 * */

	public static void sumOfAllInt() {
		
		int sum =0;
		
		for (int i=4; i<7; i++) {
			
		//	sum= i;
			sum= sum+i; // sum+=1; works as well
		// if you want to see the sum value for every loop, put "System.out.println(sum);" inside the "for loop"
			System.out.println(sum);
		}
		
		//if you type "System.out.println(sum);" after the "for loop" it will display the final value of sum
	//System.out.println(sum);
	
	}
}
