package day22stringbuilderencapsulation;

public class Encapsulation01 {
	
	/*
	 1) Encapsulation means "data hiding"
	 2) How do you achive "encapsulation"?
	 		a)Make the variables private
	 		b)To read private variables vlaues create get methods (getters)
	 		c)To update private variables create set methods(setter)
	 		
	 */
	
	private String ssn="12356789";
	private int salary=12345;
	
	// 
	// source-generate getters and setters-Insertion point-After getSsn
	public String getSsn() {
		return ssn;
	}


	public int getSalary() {
		return salary;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	

	



	
}
