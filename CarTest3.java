/*	Obj: 
	
*/

//import, Package

public class CarTest3{
	// class variable  (static variable)


	// instance Variable


	// main method
	public static void main(String[] args) {
		Car car1 = new Car("K5", "기아","중형","흰색");
		System.out.printf("car1: %s\n", car1);
		System.out.printf("car1.getColor(): %s\n", car1.getColor());

		Car car2 = new Car("SM5", "삼성", "중형", "블랙");
		System.out.printf("car2: %s\n", car2);
		System.out.printf("car2.getColor(): %s\n", car2.getColor());

	}
}