import java.util.*;

public class ArrayListTest1{
	public static void main(String[] args) {

		ArrayList list = new ArrayList();	// 10
		
		// 요소 추가
		list.add(new Car("k5", "기아", "중형", "흰색"));
		list.add(new Car("k52", "기아2", "중형2", "흰색2"));
		list.add(new Car("k53", "기아3", "중형3", "흰색3"));

		list.add(new Account("1", "일길동", "1111", "2017.01.01", 10000));

		// 요소 내용 조회 및 출력
		int size = list.size();
		System.out.printf("list: %d\n", size);

		for(int i = 0; i < list.size(); i++) {
			Object car = list.get(i);
			System.out.printf("%s\n", car);
			
			// 자동차 색깔 정보 출력
			if(car instanceof Car) { 
				System.out.printf("%s\n", ((Car)car).getColor());
			}

		}

	}
}