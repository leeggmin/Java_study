import java.util.*;
class Test{
	private int number;
	public void setNumber(int number) {this.number=number;}
	int getNumber() {return number;}
	
	public Test(){
		
	}
}

public class test220211224 {

	public static void main(String[] args) {
		Test test=new Test();
		test.setNumber(10);
		System.out.println(test.getNumber());
	}

}