import java.util.*;

public class ArrayListTest2{
	public static void main(String[] args) {

		ArrayList<Car> list = new ArrayList<Car>();

		// 리스트에 요소 추가
		list.add(new Car("k5", "기아", "중형", "흰색"));
		list.add(new Car("k52", "기아2", "중형2", "흰색2"));
		list.add(new Car("k53", "기아3", "중형3", "흰색3"));

		// 리스트 요소 출력.

		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%s\n", list.get(i));	// .toString() 생략
			System.out.printf("%s\n", list.get(i).getColor());	// .toString() 생략
		}

		for(Car c: list) {
			System.out.printf("%s\n", c);	// .toString() 생략
		}
	}
}