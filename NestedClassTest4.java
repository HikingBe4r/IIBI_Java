// �͸� ���� Ŭ����

public class NestedClassTest4{
	public static void main(String[] args) {

		Figurable temp = new Figurable() {
			public double getArea() {
				System.out.println("temp.getarea");
				return 0.0;
			}

			public double getCircumference() {
				System.out.println("temp.getcircu");
				return 0.0;
			}
		};

		Figurable temp2 = new Circle(5.0);
		
		System.out.printf("temp.getArea(): %.2f\n", temp.getArea());
		System.out.printf("temp.getCircumference(): %.2f\n", temp.getCircumference());

		System.out.printf("temp2.getArea(): %.2f\n", temp2.getArea());
		System.out.printf("temp2.getCircumference(): %.2f\n", temp2.getCircumference());


	}
}