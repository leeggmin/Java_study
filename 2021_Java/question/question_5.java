import java.util.*;
class Problem5{
	void Test()
	{
		System.out.println("Test Version");
	}
	void Test(int number)
	{
		System.out.println("Test Version:"+number);
	}
	void Test(double number,String version)
	{
		System.out.println("Test Version:"+number+version);
	}
}
public class question_5 {

	public static void main(String[] args) {
		Problem5 P=new Problem5();
		P.Test();
		P.Test(2);		
		P.Test(2.51,"beta");

	}

}
