import java.util.*;
class Problem4{
	static int number=2;
	
	static String notFour() {
		if(number>=4)
		{
			return "4�̻��� ����";
		}
		return "4�̸��� ����";
	}
}
public class question_4 {

	public static void main(String[] args) {
		System.out.println(Problem4.notFour());
		Problem4.number++;
		Problem4.number++;
		System.out.println(Problem4.notFour());
	}

}
