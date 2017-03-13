public class CloneTest{
	public static void main(String[] args) throws CloneNotSupportedException {
		Car[] obj = new Car[3];

		obj[0] = new Car("SM", "�Ｚ", "����", "���");
		obj[1] = new Car("SM2", "�Ｚ2", "����2", "���2");
		obj[2] = new Car("SM3", "�Ｚ3", "����3", "���3");

		Car[] clone = obj.clone();		// �̰��ϸ� �� �����ǰ��ϰ�ʹ�.
		
		for(int i =0; i < obj.length; i++) {
			clone[i] = obj[i].clone();
		}

		for(Car temp: obj) {
			System.out.printf("%s\t", temp);
		}
		System.out.println();

		for(Car temp: clone) {
			System.out.printf("%s\t", temp);
		}

		System.out.println();
	}
}