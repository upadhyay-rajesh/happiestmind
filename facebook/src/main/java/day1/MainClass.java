package day1;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String ss="y";
		
		while(ss.equals("y")) {
		System.out.println("************MAIN MENU********");
		System.out.println("press 1 to run hello");
		System.out.println("press 2 to run addition");
		System.out.println("press 3 to run table");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		
		int c=sc.nextInt();
		
		switch(c) {
		case 1 : Hello.main(args);
			break;
		case 2: AddTwoNumber.main(args);
			break;
		case 3 : VariableDemo v=new VariableDemo();
				 
			break;
			default : System.out.println("wrong choice");
		}
		System.out.println("to continue press y");
		ss=sc.next();
		}

	}

}
