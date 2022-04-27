class Person{
	static int sum;
	public Person(String name) {
		System.out.println(name+" is born.");
		sum++;
	}
	static String get_popualtion(){
		return sum+"¸í";
	}
}
class Person2{
	boolean head=true;
	void walk() {
		System.out.println("°È±â");
	}
}
class Man extends Person2{
	void run() {
		System.out.println("´Þ¸®±â");
	}
}
class Woman extends Person2{
	void jump() {
		System.out.println("Á¡ÇÁ");
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
		System.out.println(money+"¿øÀÇ GoodBankÀÇ ÀÌÀÚ : "+(float)(money/10));
	}
	
}
class NormalBank extends Bank
{
	void getinterestRate() {
		System.out.println(money+"¿øÀÇ NormalBankÀÇ ÀÌÀÚ : "+(float)(money/20));
	}
	
}
class BadBank extends Bank
{
	void getinterestRate() {
		System.out.println(money+"¿øÀÇ BadBankÀÇ ÀÌÀÚ : "+(float)(money/33));
	}
	
}
class Shop{
	static int total;
	
	static void sales(String name) {
		switch (name) {
		case "¶±ººÀÌ": {
			total +=3000;
			break;
		}
		case "¼ø´ë": {
			total +=1000;
			break;
		}
		case "Æ¢±è": {
			total +=500;
			break;
		}
		case "±è¹ä": {
			total +=2000;
			break;}
		}	
	}

	static void sales(String name,int count) {
		switch (name) {
		case "¶±ººÀÌ": {
			total +=(3000*count);
			break;
		}
		case "¼ø´ë": {
			total +=(1000*count);
			break;
		}
		case "Æ¢±è": {
			total +=(500*count);
			break;
		}
		case "±è¹ä": {
			total +=(2000*count);
			break;}
		}	
	}

	static void sales(String name,int count,String name2,int count2) {
		switch (name) {
		case "¶±ººÀÌ": {
			total +=(3000*count);
			break;
		}
		case "¼ø´ë": {
			total +=(1000*count);
			break;
		}
		case "Æ¢±è": {
			total +=(500*count);
			break;
		}
		case "±è¹ä": {
			total +=(2000*count);
			break;}
		}	
		switch (name2) {
		case "¶±ººÀÌ": {
			total +=(3000*count2);
			break;
		}
		case "¼ø´ë": {
			total +=(1000*count2);
			break;
		}
		case "Æ¢±è": {
			total +=(500*count2);
			break;
		}
		case "±è¹ä": {
			total +=(2000*count2);
			break;}
		}	
	}

}
public class test20211227 {

	public static void main(String[] args) {
		Person man=new Person("james");
		Person woman=new Person("emily");
		System.out.println("ÀüÃ¼ ÀÎ±¸¼ö = "+Person.get_popualtion());
		
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
		
		Shop.sales("¶±ººÀÌ");//3000
		Shop.sales("±è¹ä",2);//4000
		Shop.sales("Æ¢±è",5);//2500
		Shop.sales("¼ø´ë",3,"±è¹ä",4);//11000
		System.out.println("ÃÑ ¸ÅÃâ : "+Shop.total+"¿ø");//20500
	}

}