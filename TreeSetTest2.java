import java.util.*;


// �ߺ�����, �ڵ�����ü����, �ڵ��� �̸������� �����ؼ� ����
// Comparator �̿�.
public class TreeSetTest2{

	public static void main(String[] args) {
		

		TreeSet<Car> set = new TreeSet<Car>(new Comparator<Car>() {
			public int compare(Car a, Car b) {
				return a.getName().compareTo(b.getName());
			}
		});

		// Car(String _name, String _company, String _kind, String _color) 

		set.add(new Car("�̸�2", "company2", "Kind2", "Color1"));
		set.add(new Car("�̸�5", "company3", "Kind3", "Color3"));
		set.add(new Car("�̸�1", "company1", "Kind4", "Color2"));
		set.add(new Car("�̸�8", "company4", "Kind1", "Color4"));


		for(Car c: set) {
			System.out.println(c);
		}
	}
}