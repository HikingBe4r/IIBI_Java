import java.util.*;

public class ComparableTest1{

	public static void main(String[] args) {
		
		ArrayList<Car> list = new ArrayList<Car>();

		list.add(new Car("K5", "���", "����", "���"));
		list.add(new Car("������", "������", "����", "�׷���"));
		list.add(new Car("���׽ý�", "����", "����", "��"));
		list.add(new Car("K9", "���", "����", "���"));
		list.add(new Car("�ҳ�Ÿ", "����", "����", "��"));

		System.out.println("�ʱ����");
		for(Car c: list) {
			System.out.println(c);
		}
		System.out.println();


		// �ڵ����� �������� ����
		Collections.sort(list);	// compareTo�� �ڵ����� �񱳷� �������ؼ� �ڵ��������� ���ĵ�.

		System.out.println("������");

		for(Car c: list) {
			System.out.println(c);
		}



	}
}