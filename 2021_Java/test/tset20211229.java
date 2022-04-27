interface Providable{
	void leisure();
	void sight();
	void food();
}
class TourGuide{
	private Providable tour=new KoreaTour();
	
	public void leisuretour() {
		tour.leisure();
	}
	public void sighttour() {
		tour.sight();
	}
	public void foodtour() {
		tour.food();
	}
}
class KoreaTour implements Providable{
	@Override
	public void leisure() {
		System.out.println("¼ö»ó½ºÅ°");
		
	}
	@Override
	public void sight() {
		System.out.println("°æºÏ±Ã °ü¶÷");
	}
	@Override
	public void food() {
		System.out.println("ºñºö¹ä");
	}
}
abstract class Ehdanf{
	String name;
	abstract void attack();
	abstract void sound();
	
	void jump() {
		System.out.println("jump");
	}
}
class fsd extends Ehdanf{
	@Override
	void attack() {
		System.out.println("100");
	}
	@Override
	void sound() {
		System.out.println("sound");
	}
}

public class tset20211229 {

	public static void main(String[] args) {
		TourGuide james=new TourGuide();
		james.leisuretour();
		james.sighttour();
		james.foodtour();
	}

}
