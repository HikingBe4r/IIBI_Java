import java.util.*;

public class ArrayListTest3{
	public static void main(String[] args) {
		// 1,2,3,4,5 저장해서 출력

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 5; i++)
			list.add(new Integer(i));

		for(int i = 0; i < list.size(); i++) 
			System.out.printf("%d\n", list.get(i).intValue());
		

		for(Integer i: list) 
			System.out.printf("%d\n", i);
		
	}
}