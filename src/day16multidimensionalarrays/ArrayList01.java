package day16multidimensionalarrays;

import java.util.ArrayList;

public class ArrayList01 {
	/*
	  1)ArrayLists are flexible in size
	  2)ArrayLists cannot store multiple data types
	  3)ArrayLists store non-primitive data types
	  4)ArrayLists are updated version of Arrays
	  */

	public static void main(String[] args) {
		// it is primitive 

		ArrayList<Integer>list1=new ArrayList<>();
		
		// to print an ArrayList, using just its name in System.out.println() is enough
		System.out.println(list1); // []

	// How to add elements into an ArrayList
		list1.add(12);
		list1.add(21);
		list1.add(33);
		
		// How to add an element into a specific index
		list1.add(1, 45);
		
		System.out.println(list1); //[12, 21,33]
	
	}

}
