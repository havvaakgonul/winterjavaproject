package day12dowhileloop;

public class InstanceLocalAndClassVariables {
/*
 * 1)If a variable is created
 * a)inside the class but outside the main method and
 * b)it is not "static"
 * then it is called "Instance (Object) Variable"
 * 
 * Note: I you do not assign any value for an instance variable, Java assings "0" for it, if the variable is a number
 * The values which java assigns are called "default value"
 * 
 * 2) if a variable is created
 * a)Ýnside the class but outside the main method and
 * b)it "is static"
 * then it is called "Class Variable"
 * 
 * Note: The main difference between "static(class)" and "instance (object)" variables is that 
 * a) All updates on a static variable is visible by all objects which are created from the class but
 * all updates on an "instance variable" is visible just by the object 
 * b)"static variables" are common for all objects, but instance variables are specified for an object
 *
 * 
 * 3) if a varýable is created inside a method, it is called "local variable" 
 * 
 * Note: For "local variables", there is no default value.
 * You have to assign value, when you create a local variable
 * 
 * Note: "local variables" which are created in a "static method" are "static" automatically.
 * 
 * 
 * 
 * */
	
	int i=12; // This is instance variable
	int k; // This is instance variable
	 String str ; // This is instance variable, default value for str is null
	boolean bl; // This is instance variable, default value for bl is false
	char ch; //This is instance variable, default value for ch is '' (no character)
	
	static byte by; 
	
	
	
	public static void main(String[] args) {
		short sh= 11; // this is "local variable"
		sh++;
		
		
	}

}
