package day30interfaces;
/*
 	1) All methods in an interface must be abstract
 	Putting "abstract" keyword or not putting "abstract" keyword are same.
 	 
 	 2) All methods in an interface must be public
 	 Putting "public" keyword or not putting "public" keyword are same.
 	 In an interface, if you do not see "access modifier" for a method,
 	 It is public not default
 	 3)In an interface, variables are "public", "static" and "final" as default.
 	 No need to type "public", "static" and "final" for variables
 
 	4) In an interface, we have uncompleted methods (abstract methods) because of that java does not 
 	let us to create objects by using interfaces.
 	Because of the same reason, we cannot create objects by using abstract classes
 	
 	 NOTE: interfaces do not have constructor
 	abstract classes have constructors but the constructors are not used to create
 */
public interface Sound {
	
	public abstract void sound ();
		
	public void increaseVolume();
	
	void decreaseVolume();
	
	//Variables in an interface are "public", "static" and "final"
	
	public static final int LEVEL=12;
	
	int PRÝCE=23;
	
}
