// 인터페이스로 풀이.
interface Figurable {
	// abstract method
	double getCircumference();	// public abstract
	double getArea();
}

class Circle implements Figurable {
	// instance variable
	private double PI = 3.14;
	private double radius;

	// constructor method
	Circle() {}
	Circle(double _radius) {
		this.radius = _radius;
	}

	// method overriding
	public double getCircumference() {
		return PI*2*radius;
	}

	public double getArea() {
		return PI*radius*radius;
	}
}

class Rectangle implements Figurable {
	// instance variable
	private double width;
	private double height;

	// constructor method
	Rectangle() {}
	Rectangle(double _width, double _height) {
		this.width = _width;
		this.height = _height;
	}

	// method overriding
	public double getCircumference() {
		return 2*(width+height);
	}

	public double getArea() {
		return width*height;
	}
}

// 다형성-인터페이스 예제
public class PolymorphismTest2 {
	public static void main(String[] args) {
//		Figurable obj = null;
		//obj = new Figurable();	// error. 인터페이스는 생성자가 없어서 객체생성 x

		Circle obj = new Circle(4.5);
		printFigurable(obj);


		Rectangle obj2 = new Rectangle(5.5, 4.5);
		printFigurable(obj2);

	}

	public static void printFigurable(Figurable _obj) {
		System.out.printf("둘레: %.2f, 넓이: %.2f\n", _obj.getCircumference(), _obj.getArea());
	}
}