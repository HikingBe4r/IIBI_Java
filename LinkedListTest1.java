import java.util.*;

public class LinkedListTest1{

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		// java, jsp, spring, android 추가
		list.add("java");
		list.add("jsp");
		list.add("spring");
		list.add("android");

		// oracle을 jsp앞에 추가
		list.add(list.indexOf("jsp"), "oracle");

		// spring을 삭제
		list.remove("spring");

		// 출력

		for(int i =0; i < list.size(); i++) {
			System.out.printf("%s\n", list.get(i));
		}
		System.out.println();

		for(String str: list) {
			System.out.printf("%s\n", str);
		}
	}
}