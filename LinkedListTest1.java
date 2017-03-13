import java.util.*;

public class LinkedListTest1{

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		// java, jsp, spring, android �߰�
		list.add("java");
		list.add("jsp");
		list.add("spring");
		list.add("android");

		// oracle�� jsp�տ� �߰�
		list.add(list.indexOf("jsp"), "oracle");

		// spring�� ����
		list.remove("spring");

		// ���

		for(int i =0; i < list.size(); i++) {
			System.out.printf("%s\n", list.get(i));
		}
		System.out.println();

		for(String str: list) {
			System.out.printf("%s\n", str);
		}
	}
}