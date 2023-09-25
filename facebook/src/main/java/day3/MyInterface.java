package day3;

public interface MyInterface {
	int i=9;
	
	void add();
	void sub();
	void mult();
	
	default void div() {
		
	}
	static void percentage() {
		
	}
	
}
//why to use interface?
//a. to achieve multiple inheritance
//b. to maintain low coupling between 2 classes
//by default all the methods of an interface will be public and abstract
//by default all the variable of an interface will be public static and final
//we can not write static,final, private, protected method inside an interface.
//java8 onward we can write method with body inside an interface using default or static 
//interface without method is known as marker interface

//how a class will use interface?
 class Employee implements MyInterface{

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void sub() {
		// TODO Auto-generated method stub
		
	}

	public void mult() {
		// TODO Auto-generated method stub
		
	}
	
}
 
 //what is difference between abstract class and an interface?
 //1. interface all the methods must be abstract however it is not true with abstract class.
 //2. abstract class will be used via child class however interface can be used via any class.
 //3. abstract class is having IS-A relationship however interface is having HAS-A relationship.
 
 
 
 
 
 
 
 
 
 
 
 
 
