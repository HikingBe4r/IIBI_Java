// �߻�Ŭ������ ��ӹ޾Ƽ� Ǯ��.
abstract class figure {
	double area;
	double circumference;

	figure() {}
	figure() {
		
	}


	public abstract double getCircumference();	// public abstract
	public abstract double getArea();
}

class Circle extends figure {
	double radius;

	public double getCircumference() {
		return 3.14*radius*2;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class AbstractTest2 {
	public static void main(String[] args) {
		
	}
}