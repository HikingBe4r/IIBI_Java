import java.util.*;

public class ComparableTest2{

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "a", "ㄱ", 10000, 1));
		books.add(new Book(5, "b", "ㄹ", 50000, 5));
		books.add(new Book(4, "c", "ㄷ", 40000, 4));
		books.add(new Book(2, "d", "ㅁ", 20000, 2));
		books.add(new Book(3, "e", "ㄴ", 30000, 3));

		// 출력
		for(Book b: books) {
			System.out.println(b);
		}
		System.out.println();


		// 도서번호 오름차순 정렬
		Collections.sort(books);


		System.out.println("정렬후");


		for(Book b: books) {
			System.out.println(b);
		}
		System.out.println();

		// 이름 오름차순 정렬
	}
}