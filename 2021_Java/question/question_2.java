class Problem2{
	private int number1;
	private int number2;
	
	protected int sum() {
		return this.number1 + this.number2;
	}
	
	public Problem2(int number1,int number2) {
		this.number1=number1;
		this.number2=number2;
	}
	
}
public class question_2 {

	public static void main(String[] args) {
		Problem2 p1=new Problem2(2,4);
		Problem2 p2=new Problem2(1,2);
		System.out.println(p1.sum());
		System.out.println(p2.sum());
	}

}
