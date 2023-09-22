package day1;

public class A1 {      
	
	int m=9;
	int j;
	
	void add() {
		
	}
	                                                 
	public A1() {  
		super();
		System.out.println("A1");                     
	}
	public A1(int i) {
		this.j=i;
	}
}

class B1 extends A1{
	public B1() {
		super();
		System.out.println("B1");
		System.out.println(super.m);
		super.add();
	}
	public B1(int k) {
		super(k);
		System.out.println("B1");
	}
}

class C1 extends B1{
	public C1() {
		super();
		System.out.println("C1");
	}
}

class D1 {
	public static void main(String arg[]) {
		new C1();
	}
}
