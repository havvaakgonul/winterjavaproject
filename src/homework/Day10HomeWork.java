package homework;

import java.util.Scanner;

public class Day10HomeWork {

	public static void main(String[] args) {
		pickName();
		yearSugar();
		max_MinValue();
		threeDigits();
		multiplicationTable();
	}
	/*
	 	Create 3 char variables then print A L I on the console using 
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		hi guys  one of you can create this simple poll
	 * */
	
		public static void pickName() {
			String pickName= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			char ch1 = pickName.charAt(0);
			char ch2 = pickName.charAt(11);
			char ch3 = pickName.charAt(8);
			
			System.out.print(ch1+""+ch2+""+ch3);
		}	
		/*
		Ask the user how many tea they drink and how many sugars they use a day. Calculate how many kg of sugar is used in a year and print it.
		1 sugar = 1.7 gr
		Sample: Input ⇒      
		Tea : 10
		Sugar :2
		Output : 12.41 kg/year
		*/ 
		public static void yearSugar() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please, enter how many cups of tea drinks in a day");
			int tea = scan.nextInt();
			System.out.println("Please, enter how many sugar use a day ");
			int sugar = scan.nextInt();
			double kg=((sugar*1.7)*tea)/1000;
			double result=kg*365;
			System.out.println("You use "+result+" sugar per year");
		
			scan.close();
		}
		/*
		 	Write the code that shows the Maximum and Minimum values ​​of integer data type on the console.
		 */
		public static void max_MinValue() {
			
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			
		}

		/*
		 
		Ask user to enter a three digits number and find the sum of digits of this number.

		  */
		
		public static void threeDigits() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please, enter a three digits");
			int a = scan.nextInt();
			if(a%10!=0) {
			int sum =(a%10)+(a/10);
			System.out.println("sum of digits "+ sum);
			}if(a%10==0) {
				int sum=(a/100)+((a%100)/10);
				System.out.println("sum of digits "+ sum);
			}
		}
		/*
		 Assign two values : 
			num1=1,
			num2=1 
			Then print the multiplication table using ‘increment’ 
			Note: When you use ++ increment sign then it increases by 1 
			Print The Following multiplication table:
			1 X 1 = 1
			1 X 2 = 2  
			1 X 3 = 3
			...
			1 X 10 =10


		 * */
		
		public static void multiplicationTable() {
			
			int num1=1;
			int num2=1;
			while (num2<=10) {
			System.out.println(num1+"x"+num2+"="+num1*num2);
			num2++;
			
			}
			}
		}
		