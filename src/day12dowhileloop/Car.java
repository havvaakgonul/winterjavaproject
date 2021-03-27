package day12dowhileloop;

public class Car {
	/*
	 When you create a class, Java knows you will create objects.
	 To create objects you need "constructor", because of that java puts "constructor" behind the class for you.
	 That kind of constructors are called "default constructor"
	  */

	public String make ="Honda"; // instance
	public String model= "Accord";
	public int price =20000;
	public int year=2020;
	
	public static void main(String[] args) {
	
		
		Car mycar1 = new Car(); // class name+object name +new+ default constructor
		System.out.println(mycar1.make);
		System.out.println(mycar1.model);
		System.out.println(mycar1.price);
		System.out.println(mycar1.year);
		
		mycar1.move();
		mycar1.stop();
	
	}
	
	public static void move() {
		System.out.println("Move fast");
	}
	public static void stop() {
		System.out.println("The car can shop");
	}
}
