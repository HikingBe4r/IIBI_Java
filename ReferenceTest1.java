public class ReferenceTest1 {
	// �ν��Ͻ�����.

	// ������

	// �ν��Ͻ��޼ҵ�
	public String[] makeArray() {
		String[] names = {"�ϱ浿", "�̱浿", "��浿"};
		return names;
	}

	// main method
	public static void main(String[] args) {
		ReferenceTest1 rf1 = new ReferenceTest1();

		for(String str: rf1.makeArray()) {
			System.out.printf("%s\n", str);
		}
	}


}