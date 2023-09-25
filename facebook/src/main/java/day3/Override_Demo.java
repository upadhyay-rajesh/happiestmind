package day3;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
	protected void add(int i,float j)throws Exception{
		System.out.println(i+j);
	}
}

class Child extends Parent{
	@Override
	protected void add(int i,float j)throws Exception{
		System.out.println("i am child class method");
	}
	
	public void classicAdd(int i,float j)throws Exception {
		super.add(i, j);
	}
}

public class Override_Demo {

	public static void main(String args[])throws Exception {
		Child c=new Child();
		c.add(3, 5.6f);
		c.classicAdd(3, 4.4f);

	}
	
	public static void main(int[] args) {
		//int i[7];
		int[] i=new int[7];
	}

}











