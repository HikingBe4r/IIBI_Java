/*	Obj: 가변인자목록(Variable Arguments) 테스트	
*/

public class VarArgsMethodTest1 {

	public static void main(String[] args) {

		Circle obj1 = new Circle(4.5);
		Rectangle obj2 = new Rectangle(4.5, 5.5);
		
		printFigurable(obj1);
		printFigurable(obj1, obj2);
	}

	public static void printFigurable(Figurable... _f) {
		for(Figurable temp: _f) {
			System.out.printf("둘레: %.2f  ", temp.getCircumference());
			System.out.printf("넓이: %.2f\n", temp.getArea());

		}
		System.out.println();
	}

}