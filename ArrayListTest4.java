import java.util.*;

public class ArrayListTest4{
	public static void main(String[] args) {

		ArrayList<Car> list = new ArrayList<Car>();

		// ����Ʈ�� ��� �߰�
		list.add(new Car("k5", "���", "����", "���"));
		list.add(new Car("k52", "���2", "����2", "���2"));
		list.add(new Car("k53", "���3", "����3", "���3"));


		
		// ����Ʈ�� ��� �߰�
		list.add(1, new Car("������", "������", "����4", "���4"));

				// ����Ʈ ��� ���.
		for(Car temp: list) {
			System.out.printf("%s\n", temp.toString());
		}

			
	}
}