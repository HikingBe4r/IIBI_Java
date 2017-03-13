import java.util.*;

public class ComparableTest1{

	public static void main(String[] args) {
		
		ArrayList<Car> list = new ArrayList<Car>();

		list.add(new Car("K5", "기아", "중형", "흰색"));
		list.add(new Car("말리브", "쉐보레", "중형", "그레이"));
		list.add(new Car("제네시스", "현대", "대형", "블랙"));
		list.add(new Car("K9", "기아", "대형", "흰색"));
		list.add(new Car("소나타", "현대", "중형", "블랙"));

		System.out.println("초기상태");
		for(Car c: list) {
			System.out.println(c);
		}
		System.out.println();


		// 자동차명 오름차순 정렬
		Collections.sort(list);	// compareTo를 자동차명 비교로 재정의해서 자동차명으로 정렬됨.

		System.out.println("정렬후");

		for(Car c: list) {
			System.out.println(c);
		}



	}
}