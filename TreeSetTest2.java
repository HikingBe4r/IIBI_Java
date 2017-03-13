import java.util.*;


// 중복배제, 자동차객체관리, 자동차 이름순으로 정렬해서 관리
// Comparator 이용.
public class TreeSetTest2{

	public static void main(String[] args) {
		

		TreeSet<Car> set = new TreeSet<Car>(new Comparator<Car>() {
			public int compare(Car a, Car b) {
				return a.getName().compareTo(b.getName());
			}
		});

		// Car(String _name, String _company, String _kind, String _color) 

		set.add(new Car("이름2", "company2", "Kind2", "Color1"));
		set.add(new Car("이름5", "company3", "Kind3", "Color3"));
		set.add(new Car("이름1", "company1", "Kind4", "Color2"));
		set.add(new Car("이름8", "company4", "Kind1", "Color4"));


		for(Car c: set) {
			System.out.println(c);
		}
	}
}