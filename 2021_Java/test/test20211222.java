import java.util.*;

class CoffeeMachine
{
	int change_calculator(String coffee, int input_money) {
		int menu=0;
		switch(coffee)
		{
		case "�Ƹ޸�ī��":
			menu=1000;
			break;
		case "ī���":
			menu=1500;
			break;
		case "īǪġ��":
			menu=2000;
			break;
		default:
			System.out.println("error : ���� �޴�");
			return input_money;
		}
		if(input_money<menu)
			{System.out.println("�ݾ��� ������");
			return input_money;
			}
		
		return input_money-menu;
		
	}
}

public class test20211222 {

	public static void main(String[] args) {
		/*
		String[] s= {"one4seveneight","23fourfive6","eight123four","57124","zerofivesix"};
		for (int i = 0; i < s.length; i++) {
			String nows=s[i];
			s[i]=s[i].replace("zero","0");
			s[i]=s[i].replace("one","1");
			s[i]=s[i].replace("two","2");
			s[i]=s[i].replace("three","3");
			s[i]=s[i].replace("four","4");
			s[i]=s[i].replace("five","5");
			s[i]=s[i].replace("six","6");
			s[i]=s[i].replace("seven","7");
			s[i]=s[i].replace("eight","8");
			s[i]=s[i].replace("nine","9");
			System.out.println(Integer.valueOf(s[i])+1);
		}
		
		String ss="eight123four";
		ss=ss.replace("eight","8");
		ss=ss.replace("four","4");
		System.out.println(ss);
		*/
		Scanner input=new Scanner(System.in);
		
		System.out.print("Ŀ�� ������ �Է��ϼ��� >>>");
		String coffee=input.nextLine();
		System.out.print("���� ���� �Է��ϼ��� >>>");
		int input_money=input.nextInt();
		CoffeeMachine cm=new CoffeeMachine();
		int result_change=cm.change_calculator(coffee, input_money);
		System.out.println("���� �ܵ� : "+result_change);
		
	}

}
