import java.util.Scanner;
public class test20211213 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		/*
		String id="java";
		String pw="abc123";
		System.out.print("id�� �Է����ּ��� >>");
		String inputid= input.nextLine();
		if(id.equals(inputid))
		{
			System.out.println("id�� ��ġ�մϴ�");
			System.out.print("pw�� �Է����ּ��� >>");
			String inputpw=input.nextLine();
			if(pw.equals(inputpw)) {
				System.out.println("�α��� ����");
			}
			else{
				System.out.println("pw�� Ʋ�Ƚ��ϴ�");
			}
		}
		else
		{
			System.out.println("id�� Ʋ�Ƚ��ϴ�");	
		}
		
		System.out.print("������ �Է����ּ��� >>");
		int num1= input.nextInt();
		System.out.print("������ �Է����ּ��� >>");
		int num2= input.nextInt();
		System.out.print("������ �Է����ּ��� >>");
		int num3= input.nextInt();
		if(num1>num2&&num1>num3)
		{
			System.out.printf("���� ū ������ %d\n",num1);
		}
		else if(num2>num1&&num2>num3)
		{
			System.out.printf("���� ū ������ %d\n",num2);
		}
		else
			System.out.printf("���� ū ������ %d\n",num3);
		
		System.out.print("���� ���� �Է�:");
		int korean= input.nextInt();
		System.out.print("���� ���� �Է�:");
		int math= input.nextInt();
		System.out.print("���� ���� �Է�:");
		int english= input.nextInt();
		float result1=(float)(korean+math+english)/3;
		System.out.printf("��� : %.1f\n",result1);
		if(result1>=30&&result1<50)
		{
			System.out.println("��� : C");
		}
		else if(result1>=50&&result1<80)
		{
			System.out.println("��� : B");
		}
		else if(result1>=80)
		{
			System.out.println("��� : A");
		}
		else
			System.out.println("��� : D");
		
		System.out.print("������ ������ �Է��ϼ��� >>>");
		int number= input.nextInt();
		if(number%3==0)
			System.out.printf("%d�� 3�� ����Դϴ�\n",number);
		else
			System.out.printf("%d�� 3�� ����� �ƴմϴ�\n",number);
		
		String s=input.nextLine();
		
		while(!s.equals("a"))
		{
			System.out.println("���ڰ� �ٸ��ϴ�");
			s=input.nextLine();
		}
		System.out.println("���ڰ� �½��ϴ�");
		*/
		String code="";
		while(!code.equals("AAAAA"))
		{
			code +="A";
			System.out.println(code);
		}
		
		int i=0;
		while(i<10) {
			int j=0;
			while(j<10)
			{
				System.out.println("i="+i);
				System.out.println("j="+j);
				j++;
			}
			i++;
		}
		
		int hour=0;
		
		while(hour<2)
		{
			int min=0;
			while(min<60)
			{
				int sec=0;
				while(sec<60)
				{
					System.out.println(hour+"��"+min+"��"+sec+"��");
					sec++;
				}
				min++;
			}
			hour++;
		}
	
		int c=1;
		while(c<10)	
		{
			int b=2;
			while(b<10)
			{
				System.out.print(b+"x"+c+"="+(b*c)+"\t");
				b++;
			}
			System.out.println();
			c++;
		}
		
		int d=1;
		while(d<100)
		{	
			int e=1;
			if(d%3==0)
			{
				System.out.print(d+" ");
				e++;
				if(d%5==0)
					System.out.println();
			}
			d++;
			
		}
		
	}

}
