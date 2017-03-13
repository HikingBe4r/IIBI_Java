// ����ó����
// �˻��ӵ��� ���� TreeMap�� �̿��� ����.
// �̸��� �������� �����ؼ� ����/���� �غ���.
// * TreeMap�� �⺻ �����ڴ� Key�� ���� �������� ������ �⺻�̴�.

import java.util.*;

public class TreeMapTest1{
	public static void main(String[] args) {

		TreeMap<String, Contact> map = new TreeMap<String, Contact>();

		//Contact(String _name, String _phone, String _email)
		map.put("2", new Contact("2", "010-222-2222", "bbb@bbb.com"));
		map.put("1", new Contact("1", "010-111-1111", "aaa@aaa.com"));
		map.put("3", new Contact("3", "010-333-3333", "ccc@ccc.com"));
		

		for(String s: map.keySet()) {
			System.out.println(map.get(s));
		}

	}
}