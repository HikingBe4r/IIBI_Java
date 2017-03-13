import java.util.*;

public class ArrayListTest1{
	public static void main(String[] args) {

		ArrayList list = new ArrayList();	// 10
		
		// ��� �߰�
		list.add(new Car("k5", "���", "����", "���"));
		list.add(new Car("k52", "���2", "����2", "���2"));
		list.add(new Car("k53", "���3", "����3", "���3"));

		list.add(new Account("1", "�ϱ浿", "1111", "2017.01.01", 10000));

		// ��� ���� ��ȸ �� ���
		int size = list.size();
		System.out.printf("list: %d\n", size);

		for(int i = 0; i < list.size(); i++) {
			Object car = list.get(i);
			System.out.printf("%s\n", car);
			
			// �ڵ��� ���� ���� ���
			if(car instanceof Car) { 
				System.out.printf("%s\n", ((Car)car).getColor());
			}

		}

	}
}