// copy�� clone�� ����

public class CopyTest1{
	public static void main(String[] args) throws CloneNotSupportedException{
		Car obj = new Car("SM5", "�Ｚ", "����", "���");

		// copy
		Car copy = obj;
		System.out.printf("obj: %s\ncopy: %s\n", obj, copy);
		copy.setColor("��");
		System.out.printf("obj: %s\ncopy: %s\n", obj.getColor(), copy.getColor());

		
		// clone
		Car clone = obj.clone();
		System.out.printf("obj: %s\nclone: %s\n", obj, clone);
		clone.setColor("�����");
		System.out.printf("obj: %s\nclone: %s\n", obj.getColor(), clone.getColor());
	}
}