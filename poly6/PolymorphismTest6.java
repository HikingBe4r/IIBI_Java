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
public class PolymorphismTest6 {
	public static void main(String[] args) {
		Figurable temp = create(1);
		System.out.printf("원의 둘레: %.2f\n", temp.getCircumference());
		System.out.printf("temp reference: %s\n", temp);
		temp = create(2);
		System.out.printf("사각형의 둘레: %.2f\n", temp.getCircumference());
		System.out.printf("temp reference: %s\n", temp);
	}

	public static Figurable create(int type) {
		if(type == 1) {
			/*
			Circle temp = new Circle(5.0);
			return temp;
			*/
			return new Circle(5.0);
		} else if (type == 2) {
			Rectangle temp = new Rectangle(4.5, 5.0);
			return temp;
		}
		return null;
	}
}