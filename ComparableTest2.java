import java.util.*;

public class ComparableTest2{

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "a", "��", 10000, 1));
		books.add(new Book(5, "b", "��", 50000, 5));
		books.add(new Book(4, "c", "��", 40000, 4));
		books.add(new Book(2, "d", "��", 20000, 2));
		books.add(new Book(3, "e", "��", 30000, 3));

		// ���
		for(Book b: books) {
			System.out.println(b);
		}
		System.out.println();


		// ������ȣ �������� ����
		Collections.sort(books);


		System.out.println("������");


		for(Book b: books) {
			System.out.println(b);
		}
		System.out.println();

		// �̸� �������� ����
	}
}