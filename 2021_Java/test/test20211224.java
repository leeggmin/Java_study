import java.util.*;

class Book{
	String book_name; 	
	String book_write; 	
	void set_info(String 제목,String 저자)
	{
		book_name=제목;
		book_write=저자;
	}
	
	void print_info()
	{
		System.out.println("책 제목 : "+book_name);
		System.out.println("책 저자 : "+book_write);
	}
}

class Song{
	String song_name;
	String song_wkdfm;
	void set_song(String 제목,String 장르)
	{
		song_name=제목;
		song_wkdfm=장르;
	}
	void print_song() 
	{
		System.out.println("노래 제목 : "+song_name);
		System.out.println("노래 장르 : "+song_wkdfm);
	}
}
class Singer{
	String singer;
	String hit_song;
	String hit_wkdfm;
	void set_singer(String 가수) {
		singer=가수;
		}
	void hit_song(Song song){
		hit_song=song.song_name;
		hit_wkdfm=song.song_wkdfm;
	}
	void print_singer() {
		System.out.println("가수이름 : "+singer);
		System.out.println("노래제목 : "+hit_song+"("+hit_wkdfm+")");
	}
}
public class test20211224 {

	public static void main(String[] args) {
			Book book1=new Book();
			Book book2=new Book();
			book1.set_info("파이썬","민경태");
			book2.set_info("어린왕자","생택쥐페리");
		
			book1.print_info();
			book2.print_info();
			
			Song song=new Song();
			song.set_song("취중진담","발라드");
			
			Singer singer=new Singer();
			singer.set_singer("김동률");
			
			singer.hit_song(song);
			singer.print_singer();
	}

}
