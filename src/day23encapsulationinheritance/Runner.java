package day23encapsulationinheritance;

public class Runner {

	public static void main(String[] args) {
		
		Dog dog1=new Dog(); 
		dog1.bark();
		dog1.drink();// dog1 inherited drink() method from Animal Class
		dog1.eat();  // dog1 inherited eat() from animal Class
		dog1.giveBirth(); // dog1 inherited () from Mammal Class
		
	}

}
