import java.util.*;

public class ArrayListTest4{
	public static void main(String[] args) {

		ArrayList<Car> list = new ArrayList<Car>();

		// 리스트에 요소 추가
		list.add(new Car("k5", "기아", "중형", "흰색"));
		list.add(new Car("k52", "기아2", "중형2", "흰색2"));
		list.add(new Car("k53", "기아3", "중형3", "흰색3"));


		
		// 리스트에 요소 추가
		list.add(1, new Car("말리부", "쉐보레", "중형4", "흰색4"));

				// 리스트 요소 출력.
		for(Car temp: list) {
			System.out.printf("%s\n", temp.toString());
		}

			
	}
}