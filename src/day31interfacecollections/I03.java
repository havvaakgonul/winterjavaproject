package day31interfacecollections;

/*
 Until Java8, we could not create "methods with body" in interfaces
 In Java8, Oracle gave us change to create "methods with body" in interfaces
 */
public interface I03 {
 default int add(int a, int b) {
	 return a+b;
 }
}
