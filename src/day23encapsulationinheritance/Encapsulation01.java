package day23encapsulationinheritance;
//void is used a)When you print sth on the console
	//b)When you do just an action
public class Encapsulation01 {

	private String name= "Ali Can";
	private int age=21;
	private boolean retired=false;
	
	private String adress="Miami Florida";
	private char initial='A';
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	//For getters of boolean variables start the name of getter with "is"
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
// To Make "initial" variable just readable, you should not create "setter", create just "getter"
	public char getInitial() {
		return initial;
	}
	//Make "address" just updatable, you should not create "getter", you should create "setter"

	

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	/*
	1) If you want not to update any value, do not create any setter method.
	 
	 Question: How can make a class "immutable class"?
	 Answer: Make all variable private then do not create any setter method
	 
	
	 */
	
	
	
	}
