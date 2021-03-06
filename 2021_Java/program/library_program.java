import java.util.*;

class Books{
	static ArrayList book_name_array=new ArrayList();
	static ArrayList book_count_array=new ArrayList();
}
class Books_Info extends Books{ 
	public static void add() {
		Scanner input=new Scanner(System.in);
		System.out.print("사들일 책의 이름을 입력하세요 : ");
		String book_name=input.next();
		for (Object object : book_name_array) {
			if(object.equals(book_name)){
			int index_number=book_name_array.indexOf(book_name);
			System.out.print("해당 책의 개수를 입력하세요 : ");
			int book_count=input.nextInt();
			book_count_array.set(index_number,(int)book_count_array.get(index_number)+book_count);
			System.out.println(book_name+"책을 "+book_count+"권 추가했습니다");
			return;
			}
		}
		book_name_array.add(book_name);
		System.out.print("해당 책의 개수를 입력하세요 : ");
		int book_count=input.nextInt();
		book_count_array.add(book_count);
		System.out.println(book_name+"책을 "+book_count+"권 추가했습니다");
	}
	public static void remove() {
		Scanner input=new Scanner(System.in);
		System.out.print("팔 책의 이름을 입력하세요 : ");
		String book_name=input.next();
		int index_number=book_name_array.indexOf(book_name);
		System.out.print("해당 책의 개수를 입력하세요 : ");
		int book_count=input.nextInt();
		boolean TorF=true;
		for (Object object : book_name_array) {
			TorF=false;
			if(object.equals(book_name))
			{TorF=true;
				break;}
		}
		if(TorF==false){System.out.println("해당 책이 존재하지 않습니다");
		return;}
		if(((int)book_count_array.get(index_number))>0 && ((int)book_count_array.get(index_number))>=book_count )
		{
			System.out.println(book_name+"책을 "+book_count+"권 삭제했습니다");
			book_count_array.set(index_number,(int)book_count_array.get(index_number)-book_count);
		}
		else
			System.out.println("해당 책의 재고가 부족합니다");
	}
	public static void check_book() {
		int turn_num=book_count_array.size();
		for (int i = 0; i < turn_num; i++) {
			System.out.println("책 제목 : "+book_name_array.get(i)+" 재고량 : "+book_count_array.get(i));
		}
	}
}
class Users extends Books{
	public static void rental() {
		Scanner input=new Scanner(System.in);
		System.out.print("대여할 책의 이름을 입력하세요 : ");
		String book_name_rental=input.next();
		boolean TorF=true;
		for (Object object : book_name_array) {
			TorF=false;
			if(object.equals(book_name_rental))
			{TorF=true;
				break;}
		}
		if (TorF==false) {
			System.out.println("해당 책이 존재하지 않습니다");
			return;
		}
		int index_number_rental=book_name_array.indexOf(book_name_rental);
		if((int)book_count_array.get(index_number_rental)>0)
		{
			System.out.println(book_name_rental+"책을 대여하였습니다");
			book_count_array.set(index_number_rental,(int)book_count_array.get(index_number_rental)-1);
		}
		else if((int)book_count_array.get(index_number_rental)<=0)
		{System.out.println("해당 책은 재고가 없습니다");}
	}
	public static void return_b() {
		Scanner input=new Scanner(System.in);
		System.out.print("반납할 책의 이름을 입력하세요 : ");
		String book_name_rtb=input.next();
		boolean TorF=true;
		for (Object object : book_name_array) {
			TorF=false;
			if(object.equals(book_name_rtb))
			{TorF=true;
				break;}
		}
		if(TorF==false) 
		{System.out.println("해당 책이 존재하지 않습니다");
		return;}
		int index_number_rtb=book_name_array.indexOf(book_name_rtb);
		System.out.println(book_name_rtb+"책을 정상적으로 반납하였습니다");
		book_count_array.set(index_number_rtb,(int)book_count_array.get(index_number_rtb)+1);
	}
}
public class library_program {

	public static void main(String[] args) {
		Books newBooks=new Books();
		Users jiminUsers=new Users();
		while(true) 
		{
			System.out.print("메뉴를 선택하세요 : 1.책 추가 2.책 삭제 3.책 대여 4.책 반납 5.책 재고 확인 6.종료 >> ");
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
				System.out.println("도서 프로그램 종료!");
				break;
			}
		}
	}
}