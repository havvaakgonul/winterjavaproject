package day28exceptions;

public class Exc01 {
	/*
	 1)"finally" is used in "try catch" 
	 2)"finally block" is executed under every condition 
	 3)"finally block" is used to end connection with cloud, to end connection with database
	 4)"finally block" can be without catch block
	 Note: try block can be used like;c a)try + catch   	b)try + multiple catch
	 									c) try+ finally 	d)try + catch + finally
	 									e)try + multiple catch + finally
	 									
	 try + finally ===> It means you do not want to handle exception but you want to do sth like ending
	 					connection with database at the end
	 	
	try + catch + finally ===> It means you do not want to handle exception but you want to do sth like ending
	 					connection with database at the end
	 */
	public static void main(String[] args) {
		div(12,4);

	}
	public static void div(int a, int b) {
		try {
			System.out.println(a/b);
			
		}catch(ArithmeticException e) {
			System.out.println("Do not use zero for the second parameter...");
		
		}finally {
			System.out.println("Do you want to  do more operations....");
		}
	}

}
