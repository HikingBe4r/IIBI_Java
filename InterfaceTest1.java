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

public class InterfaceTest1 {
	public static void main(String[] args) {
		Circle c = new Circle(5.0);
	//	System.out.printf("둘레: %.2f\n넓이: %.2f\n", c.getCircumference(), c.getArea());
		
		
		Rectangle r = new Rectangle(5.0, 10.0);
	//	System.out.printf("둘레: %.2f\n넓이: %.2f\n", r.getCircumference(), r.getArea());
	}
}