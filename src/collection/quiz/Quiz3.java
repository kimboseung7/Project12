package collection.quiz;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();
		
		Book book1 = new Book("title1", 1);
		Book book2 = new Book("title2", 2);
		Book book3 = new Book("title3", 3);
		
		book.add(book1);
		book.add(book2);
		book.add(book3);
		
//		//일반 for 문
//		for (int i = book.size() - 1; i >= 0; i--) {			
//			System.out.println(book.get(i));
//		}
//		
		// 람다식 for문 사용
		for (Book list :book) {
			System.out.println(list);
		}
		
		
		book.clear(); //전체 삭제
		
		System.out.println(book.size());
	}


}
class Book{
	String title;
	int no;
	public Book(String title, int no) {
		super();
		this.title = title;
		this.no = no;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", no=" + no + "]";
	}
	
}