import java.util.*;
public class test20211215 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		/*
		System.out.print("출력할 구구단을 입력하세요 >>");
		int dan=input.nextInt();
		for(int i=1; i<10; i++)
		{
			System.out.printf(dan+"x"+i+"="+(dan*i)+"\t");
		}
		*/
		
		System.out.print("가로 값을 입력하시오 >>");
		int n=input.nextInt();
		System.out.print("세로 값을 입력하시오 >>");
		int m=input.nextInt();
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("정수를 입력하시오 >>");
		int a=input.nextInt();
		//팩토리얼 식
		int fac=1;
		for (int i = 1; i <=a ; i++) 
		{
			fac *=i;
		}
		System.out.println(fac);
	
		System.out.print("정수를 입력하시오 >>");
		int aa=input.nextInt();
		int sum2=0;
		for (int i = 1; i <= aa; i++) {
			if(aa%i==0)
			{
				sum2 +=i;
			}
		}
		System.out.println(sum2);
	
	}

}
