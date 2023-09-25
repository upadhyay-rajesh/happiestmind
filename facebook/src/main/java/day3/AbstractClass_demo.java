package day3;

public abstract class AbstractClass_demo {
	public void add() {
		System.out.println(3+5);
	}
	
	abstract public  void sub();
}
class AbstractChild extends AbstractClass_demo{

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}