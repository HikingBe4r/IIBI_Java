import java.util.*;

public class ComparatorTest1{
	public static void main(String[] args) {
		
		LinkedList<Article> list = new LinkedList<Article>();
		list.add(new Article("��", "a", "4", "��й�ȣ"));
		list.add(new Article("��", "d", "3", "��й�ȣ"));
		list.add(new Article("��", "b", "2", "��й�ȣ"));
		list.add(new Article("��", "c", "5", "��й�ȣ"));
		list.add(new Article("��", "e", "1", "��й�ȣ"));

		for(Article a: list) {
			System.out.println(a);
		}

		System.out.println();
		
		//�Խñ� ��ȣ �������� ����
		Collections.sort(list, new NoComparator());

		for(Article a: list) {
			System.out.println(a);
		}

		System.out.println();

		//�Խñ� ���� �������� ����
		Collections.sort(list, new ContentComparator());

		for(Article a: list) {
			System.out.println(a);
		}
		System.out.println();

		//�Խñ� �ۼ��� �������� ����
							       
		Collections.sort(list, new WritterComparator());

		for(Article a: list) {
			System.out.println(a);
		} 
	}
}