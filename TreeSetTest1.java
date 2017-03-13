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
		set.add(new Book(2, "3�ڹ�", "5�浿", 30000, 1));
		set.add(new Book(5, "4�ڹ�", "2�浿", 10000, 4));
		set.add(new Book(1, "2�ڹ�", "4�浿", 40000, 2));
		set.add(new Book(3, "5�ڹ�", "3�浿", 50000, 5));
		set.add(new Book(4, "1�ڹ�", "1�浿", 20000, 3));
		set.add(new Book(1, "2�ڹ�", "4�浿", 40000, 2));
		
		// compareTo�� isbn�� ������������ �����ϱ� ������
		// add�Ҷ� �����ϸ鼭 add�Ѵ�.

		for(Book b: set) {
			System.out.println(b);
		}

		 
		// ������ ������ �������� ����

	}
}