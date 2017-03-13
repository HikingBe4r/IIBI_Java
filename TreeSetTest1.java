import java.util.*;

public class TreeSetTest1{

	public static void main(String[] args) {
		
		Comparator cp = new Comparator(){
			public int compare(Object a, Object b) {
				Book _a = (Book)a;
				Book _b = (Book)b;
				return _a.getTitle().compareTo(_b.getTitle());

			}
		};

		TreeSet<Book> set = new TreeSet<Book>(cp);
		set.add(new Book(2, "3자바", "5길동", 30000, 1));
		set.add(new Book(5, "4자바", "2길동", 10000, 4));
		set.add(new Book(1, "2자바", "4길동", 40000, 2));
		set.add(new Book(3, "5자바", "3길동", 50000, 5));
		set.add(new Book(4, "1자바", "1길동", 20000, 3));
		set.add(new Book(1, "2자바", "4길동", 40000, 2));
		
		// compareTo를 isbn을 오름차순으로 정렬하기 때문에
		// add할때 정렬하면서 add한다.

		for(Book b: set) {
			System.out.println(b);
		}

		 
		// 도서명 순으로 오름차순 정렬

	}
}