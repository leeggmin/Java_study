import java.util.*;
public class test20211210 {

	public static void main(String[] args) {
	String s1="this th";
	String s2="tsdf th";
	System.out.println(s1+" "+s2);
	
	long lightspeed;
	long distance;

	lightspeed=300000;
	distance=lightspeed*24*60*60*365;
	System.out.println(distance);
	
	int x=1;
	int y=1;
	int nextx=++x;
	int nexty=y++;
	System.out.println(nexty);
	System.out.println(nextx);
	System.out.println(y);
	
	int a =15;
	int b =10;
	boolean c;
	c=(a+b>20)&&(a-b<20);
	c=(a+b<20)||(a-b>20);
	c=!(b<=10);
	System.out.println(c);

	int num1=150;
	int num2=240;
	System.out.println(num1+"+"+num2+"="+(num1+num2));
	System.out.println(num1+"-"+num2+"="+(num1-num2));
	System.out.println(num1+"*"+num2+"="+(num1*num2));
	float num3=(float)num1/num2;
	System.out.println(num1+"/"+num2+"="+num3);
	boolean result;
	int num2_1=num2*num2*num2;
	result=num2_1/num1>=10;
	System.out.println(result);
	int x_x=2;
	int result_3=7*(x_x*x_x*x_x)-(9*x_x)-2;
	System.out.println("f("+x_x+")="+result_3);
	
	Scanner input=new Scanner(System.in);
	int sdf=input.nextInt();
	System.out.println(sdf);
	System.out.printf("%b",result);
	System.out.print("가로 길이를 입력하세요 >>");
	int xx=input.nextInt();
	System.out.print("세로 길이를 입력하세요 >>");
	int yy=input.nextInt();
	int enffp=(xx*yy)*2;
	System.out.println("직사각형의 둘레 = "+enffp);
	int sjfqdl=(xx*yy);
	System.out.println("직사각형의 넓이 = "+sjfqdl);
	
	System.out.print("숫자를 입력하세요 >>");
	int number=input.nextInt();
	boolean result2;
	result=number%2==0;
	System.out.printf("%d은 %b입니다",number,result);
	
	
	}

}
