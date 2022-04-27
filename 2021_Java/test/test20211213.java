import java.util.Scanner;
public class test20211213 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		/*
		String id="java";
		String pw="abc123";
		System.out.print("id를 입력해주세요 >>");
		String inputid= input.nextLine();
		if(id.equals(inputid))
		{
			System.out.println("id가 일치합니다");
			System.out.print("pw를 입력해주세요 >>");
			String inputpw=input.nextLine();
			if(pw.equals(inputpw)) {
				System.out.println("로그인 성공");
			}
			else{
				System.out.println("pw가 틀렸습니다");
			}
		}
		else
		{
			System.out.println("id가 틀렸습니다");	
		}
		
		System.out.print("정수를 입력해주세요 >>");
		int num1= input.nextInt();
		System.out.print("정수를 입력해주세요 >>");
		int num2= input.nextInt();
		System.out.print("정수를 입력해주세요 >>");
		int num3= input.nextInt();
		if(num1>num2&&num1>num3)
		{
			System.out.printf("가장 큰 정수는 %d\n",num1);
		}
		else if(num2>num1&&num2>num3)
		{
			System.out.printf("가장 큰 정수는 %d\n",num2);
		}
		else
			System.out.printf("가장 큰 정수는 %d\n",num3);
		
		System.out.print("국어 성적 입력:");
		int korean= input.nextInt();
		System.out.print("수학 성적 입력:");
		int math= input.nextInt();
		System.out.print("영어 성적 입력:");
		int english= input.nextInt();
		float result1=(float)(korean+math+english)/3;
		System.out.printf("평균 : %.1f\n",result1);
		if(result1>=30&&result1<50)
		{
			System.out.println("등급 : C");
		}
		else if(result1>=50&&result1<80)
		{
			System.out.println("등급 : B");
		}
		else if(result1>=80)
		{
			System.out.println("등급 : A");
		}
		else
			System.out.println("등급 : D");
		
		System.out.print("임의의 정수를 입력하세요 >>>");
		int number= input.nextInt();
		if(number%3==0)
			System.out.printf("%d는 3의 배수입니다\n",number);
		else
			System.out.printf("%d는 3의 배수가 아닙니다\n",number);
		
		String s=input.nextLine();
		
		while(!s.equals("a"))
		{
			System.out.println("문자가 다릅니다");
			s=input.nextLine();
		}
		System.out.println("문자가 맞습니다");
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
					System.out.println(hour+"시"+min+"분"+sec+"초");
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
