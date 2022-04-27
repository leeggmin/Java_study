class Problem1{
	private int number;
	private String name;
	
	public String getName() {return name;}
	public int getNumber() {return number;}
	public void setName(String ne) {name=ne;}
	public void setNumber(int num) {number=num;}
}
public class question_1 {

	public static void main(String[] args) {
		Problem1 problem1=new Problem1();
		problem1.setName("Java");
		problem1.setNumber(2);
		
		int sum=problem1.getNumber()+5;
		System.out.println("(p객체에 저장되어 있는 number) + 5의 결과: "+sum);
		System.out.println("저장되어 있는 이름 = "+problem1.getName());

	}

}
