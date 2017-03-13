import java.util.*;

public class HashSetTest1{

	public static void main(String[] args) {
	
		HashSet<Book> set = new HashSet<Book>();
		
		Book book1 = new Book(1, "�ڹ�", "1�浿", 30000, 1);
		Book book2 = new Book(2, "jsp", "2�浿", 40000, 2);
		Book book3 = new Book(3, "oracle", "3�浿", 30000, 1);
		Book book4 = new Book(4, "oracle4", "4�浿", 40000, 4);
		
//		System.out.printf("book1 hashcode: %s\n", book1.hashCode());
//		System.out.printf("book2 hashcode: %s\n", book2.hashCode());
//		System.out.printf("book3 hashcode: %s\n", book3.hashCode());

	//	book3.hashCode() = book1.hashCode();

		set.add(book1);
		set.add(book2);
		set.add(book3);
		set.add(book4);

		// set ���� ���
		if(!set.isEmpty()) {
			for(Book a: set) {
				System.out.println(a);
			}
		}

		// ----------------------


	}
}