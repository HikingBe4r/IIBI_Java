import java.util.*;

public class ArrayListTest2{
	public static void main(String[] args) {

		ArrayList<Car> list = new ArrayList<Car>();

		// ����Ʈ�� ��� �߰�
		list.add(new Car("k5", "���", "����", "���"));
		list.add(new Car("k52", "���2", "����2", "���2"));
		list.add(new Car("k53", "���3", "����3", "���3"));

		// ����Ʈ ��� ���.

		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%s\n", list.get(i));	// .toString() ����
			System.out.printf("%s\n", list.get(i).getColor());	// .toString() ����
		}

		for(Car c: list) {
			System.out.printf("%s\n", c);	// .toString() ����
		}
	}
}