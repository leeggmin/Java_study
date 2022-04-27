import java.util.*;

class Books{
	static ArrayList book_name_array=new ArrayList();
	static ArrayList book_count_array=new ArrayList();
}
class Books_Info extends Books{ 
	public static void add() {
		Scanner input=new Scanner(System.in);
		System.out.print("����� å�� �̸��� �Է��ϼ��� : ");
		String book_name=input.next();
		for (Object object : book_name_array) {
			if(object.equals(book_name)){
			int index_number=book_name_array.indexOf(book_name);
			System.out.print("�ش� å�� ������ �Է��ϼ��� : ");
			int book_count=input.nextInt();
			book_count_array.set(index_number,(int)book_count_array.get(index_number)+book_count);
			System.out.println(book_name+"å�� "+book_count+"�� �߰��߽��ϴ�");
			return;
			}
		}
		book_name_array.add(book_name);
		System.out.print("�ش� å�� ������ �Է��ϼ��� : ");
		int book_count=input.nextInt();
		book_count_array.add(book_count);
		System.out.println(book_name+"å�� "+book_count+"�� �߰��߽��ϴ�");
	}
	public static void remove() {
		Scanner input=new Scanner(System.in);
		System.out.print("�� å�� �̸��� �Է��ϼ��� : ");
		String book_name=input.next();
		int index_number=book_name_array.indexOf(book_name);
		System.out.print("�ش� å�� ������ �Է��ϼ��� : ");
		int book_count=input.nextInt();
		boolean TorF=true;
		for (Object object : book_name_array) {
			TorF=false;
			if(object.equals(book_name))
			{TorF=true;
				break;}
		}
		if(TorF==false){System.out.println("�ش� å�� �������� �ʽ��ϴ�");
		return;}
		if(((int)book_count_array.get(index_number))>0 && ((int)book_count_array.get(index_number))>=book_count )
		{
			System.out.println(book_name+"å�� "+book_count+"�� �����߽��ϴ�");
			book_count_array.set(index_number,(int)book_count_array.get(index_number)-book_count);
		}
		else
			System.out.println("�ش� å�� ����� �����մϴ�");
	}
	public static void check_book() {
		int turn_num=book_count_array.size();
		for (int i = 0; i < turn_num; i++) {
			System.out.println("å ���� : "+book_name_array.get(i)+" ����� : "+book_count_array.get(i));
		}
	}
}
class Users extends Books{
	public static void rental() {
		Scanner input=new Scanner(System.in);
		System.out.print("�뿩�� å�� �̸��� �Է��ϼ��� : ");
		String book_name_rental=input.next();
		boolean TorF=true;
		for (Object object : book_name_array) {
			TorF=false;
			if(object.equals(book_name_rental))
			{TorF=true;
				break;}
		}
		if (TorF==false) {
			System.out.println("�ش� å�� �������� �ʽ��ϴ�");
			return;
		}
		int index_number_rental=book_name_array.indexOf(book_name_rental);
		if((int)book_count_array.get(index_number_rental)>0)
		{
			System.out.println(book_name_rental+"å�� �뿩�Ͽ����ϴ�");
			book_count_array.set(index_number_rental,(int)book_count_array.get(index_number_rental)-1);
		}
		else if((int)book_count_array.get(index_number_rental)<=0)
		{System.out.println("�ش� å�� ����� �����ϴ�");}
	}
	public static void return_b() {
		Scanner input=new Scanner(System.in);
		System.out.print("�ݳ��� å�� �̸��� �Է��ϼ��� : ");
		String book_name_rtb=input.next();
		boolean TorF=true;
		for (Object object : book_name_array) {
			TorF=false;
			if(object.equals(book_name_rtb))
			{TorF=true;
				break;}
		}
		if(TorF==false) 
		{System.out.println("�ش� å�� �������� �ʽ��ϴ�");
		return;}
		int index_number_rtb=book_name_array.indexOf(book_name_rtb);
		System.out.println(book_name_rtb+"å�� ���������� �ݳ��Ͽ����ϴ�");
		book_count_array.set(index_number_rtb,(int)book_count_array.get(index_number_rtb)+1);
	}
}
public class library_program {

	public static void main(String[] args) {
		Books newBooks=new Books();
		Users jiminUsers=new Users();
		while(true) 
		{
			System.out.print("�޴��� �����ϼ��� : 1.å �߰� 2.å ���� 3.å �뿩 4.å �ݳ� 5.å ��� Ȯ�� 6.���� >> ");
			Scanner input=new Scanner(System.in);
			int menu_number=input.nextInt();
			if(menu_number==1)
			{
				Books_Info.add();
			}
			else if(menu_number==2)
			{
				Books_Info.remove();
			}
			else if(menu_number==3)
			{
				Users.rental();
			}
			else if(menu_number==4)
			{
				Users.return_b();
			}
			else if(menu_number==5)
			{
				Books_Info.check_book();
			}
			else if(menu_number==6)
			{
				System.out.println("���� ���α׷� ����!");
				break;
			}
		}
	}
}