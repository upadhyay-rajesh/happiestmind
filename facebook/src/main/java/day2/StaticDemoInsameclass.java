package day2;

public class StaticDemoInsameclass {
	
	static void add() {
		System.out.println("static add of class StaticDemoInsameclass");
	}
	void sub() {
		System.out.println("non-static add of class StaticDemoInsameclass");
	}
	
	void mult() {
		//NS-->NS
		sub();
		//S-->NS
		add();
	}

	public static void main(String[] args) {
		//S-->S
		add();
		//NS-->S
		StaticDemoInsameclass a=new StaticDemoInsameclass();
		a.sub();

	}

}
