import java.util.*;

class Book{
	String book_name; 	
	String book_write; 	
	void set_info(String ����,String ����)
	{
		book_name=����;
		book_write=����;
	}
	
	void print_info()
	{
		System.out.println("å ���� : "+book_name);
		System.out.println("å ���� : "+book_write);
	}
}

class Song{
	String song_name;
	String song_wkdfm;
	void set_song(String ����,String �帣)
	{
		song_name=����;
		song_wkdfm=�帣;
	}
	void print_song() 
	{
		System.out.println("�뷡 ���� : "+song_name);
		System.out.println("�뷡 �帣 : "+song_wkdfm);
	}
}
class Singer{
	String singer;
	String hit_song;
	String hit_wkdfm;
	void set_singer(String ����) {
		singer=����;
		}
	void hit_song(Song song){
		hit_song=song.song_name;
		hit_wkdfm=song.song_wkdfm;
	}
	void print_singer() {
		System.out.println("�����̸� : "+singer);
		System.out.println("�뷡���� : "+hit_song+"("+hit_wkdfm+")");
	}
}
public class test20211224 {

	public static void main(String[] args) {
			Book book1=new Book();
			Book book2=new Book();
			book1.set_info("���̽�","�ΰ���");
			book2.set_info("�����","�������丮");
		
			book1.print_info();
			book2.print_info();
			
			Song song=new Song();
			song.set_song("��������","�߶��");
			
			Singer singer=new Singer();
			singer.set_singer("�赿��");
			
			singer.hit_song(song);
			singer.print_singer();
	}

}
