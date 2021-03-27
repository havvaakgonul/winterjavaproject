package day22stringbuilderencapsulation;

public class StringBuilder03 {

	public static void main(String[] args) {
		
		
		// String is immutable, because of that when you want to update a String
		//JVM needs to do many tasks like creating a new container, putting the updated value into it
		// then remove the previous String object
		
		String str= "Java";
		str.concat("X");
		
		//StringBuffer is create to update Strings easily but java made the StringBuffer
		//thread-safe and synchronized but that features made the StringBuffer slow. Then
		// Java created StringBuilder which is not thread-safe and not synchronized.
		// So it worked faster than StringBuffer
		
		StringBuffer sbf= new StringBuffer("Java");
		sbf.insert(4, "X");
		System.out.println(sbf);//JavaX
		
		// As a result; Ýf you are sure ou will not need multi-threading just single threading 
		//is enough for you use StringBuilder when you need to update a String. But if it is possible
		//you will use multithreading use StringBuffer
		
		StringBuilder sb= new StringBuilder("Java");
		sb.insert(4, "X");
		System.out.println(sb); //JavaX

	}

}
