class Person{
	static int sum;
	public Person(String name) {
		System.out.println(name+" is born.");
		sum++;
	}
	static String get_popualtion(){
		return sum+"��";
	}
}
class Person2{
	boolean head=true;
	void walk() {
		System.out.println("�ȱ�");
	}
}
class Man extends Person2{
	void run() {
		System.out.println("�޸���");
	}
}
class Woman extends Person2{
	void jump() {
		System.out.println("����");
	}
}
class Car{
	String color;
	Car(String color)
	{
		this.color=color;
	}
}
class SportsCar extends Car{
	int speedlimit;
	public SportsCar(String color,int speedlimit) {
		super(color);
		this.color=super.color;
		this.speedlimit=speedlimit;
	}
}
class Animal{
	void jump() {
		System.out.println("jump");
	}
}
class Dog extends Animal{
	@Override
	void jump() {
		System.out.println("jump X2");
	}
}
class Bank{
	int money=200;
	void getinterestRate() {
		
	}
}
class GoodBank extends Bank
{
	void getinterestRate() {
		System.out.println(money+"���� GoodBank�� ���� : "+(float)(money/10));
	}
	
}
class NormalBank extends Bank
{
	void getinterestRate() {
		System.out.println(money+"���� NormalBank�� ���� : "+(float)(money/20));
	}
	
}
class BadBank extends Bank
{
	void getinterestRate() {
		System.out.println(money+"���� BadBank�� ���� : "+(float)(money/33));
	}
	
}
class Shop{
	static int total;
	
	static void sales(String name) {
		switch (name) {
		case "������": {
			total +=3000;
			break;
		}
		case "����": {
			total +=1000;
			break;
		}
		case "Ƣ��": {
			total +=500;
			break;
		}
		case "���": {
			total +=2000;
			break;}
		}	
	}

	static void sales(String name,int count) {
		switch (name) {
		case "������": {
			total +=(3000*count);
			break;
		}
		case "����": {
			total +=(1000*count);
			break;
		}
		case "Ƣ��": {
			total +=(500*count);
			break;
		}
		case "���": {
			total +=(2000*count);
			break;}
		}	
	}

	static void sales(String name,int count,String name2,int count2) {
		switch (name) {
		case "������": {
			total +=(3000*count);
			break;
		}
		case "����": {
			total +=(1000*count);
			break;
		}
		case "Ƣ��": {
			total +=(500*count);
			break;
		}
		case "���": {
			total +=(2000*count);
			break;}
		}	
		switch (name2) {
		case "������": {
			total +=(3000*count2);
			break;
		}
		case "����": {
			total +=(1000*count2);
			break;
		}
		case "Ƣ��": {
			total +=(500*count2);
			break;
		}
		case "���": {
			total +=(2000*count2);
			break;}
		}	
	}

}
public class test20211227 {

	public static void main(String[] args) {
		Person man=new Person("james");
		Person woman=new Person("emily");
		System.out.println("��ü �α��� = "+Person.get_popualtion());
		
		Person2 person2=new Person2();
		Man man2=new Man();
		Woman woman2=new Woman();
		System.out.println(man2.head);
		man2.walk();
		woman2.walk();
		SportsCar sportscar =new SportsCar("red", 300);
		System.out.println(sportscar.color);
		System.out.println(sportscar.speedlimit);
		Dog dog1=new Dog();
		dog1.jump();
		GoodBank goodBank1=new GoodBank();
		goodBank1.getinterestRate();
		NormalBank normalBank1=new NormalBank();
		normalBank1.getinterestRate();
		BadBank badBank1=new BadBank();
		badBank1.getinterestRate();
		
		Shop.sales("������");//3000
		Shop.sales("���",2);//4000
		Shop.sales("Ƣ��",5);//2500
		Shop.sales("����",3,"���",4);//11000
		System.out.println("�� ���� : "+Shop.total+"��");//20500
	}

}