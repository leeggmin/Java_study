import java.util.*;
public class test20211215 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		/*
		System.out.print("����� �������� �Է��ϼ��� >>");
		int dan=input.nextInt();
		for(int i=1; i<10; i++)
		{
			System.out.printf(dan+"x"+i+"="+(dan*i)+"\t");
		}
		*/
		
		System.out.print("���� ���� �Է��Ͻÿ� >>");
		int n=input.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ� >>");
		int m=input.nextInt();
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("������ �Է��Ͻÿ� >>");
		int a=input.nextInt();
		//���丮�� ��
		int fac=1;
		for (int i = 1; i <=a ; i++) 
		{
			fac *=i;
		}
		System.out.println(fac);
	
		System.out.print("������ �Է��Ͻÿ� >>");
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
