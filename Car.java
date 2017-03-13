/*	Obj: �ڵ����� ������ Ŭ����
	
*/

//import, Package

public class Car implements Cloneable, Comparable<Car> {
	// class variable (����(static) ����)
	static int count = 0;	

	// Instance Variable
	private String name;		// �̸�
	private String company;		// ������
	private String kind;		// ����
	private String color;		// ����

	// default constructor
	public Car() {	
		count++;
	}

	// parameter constructors
	public Car(String _name, String _company, String _kind, String _color) {
		count++;
		this.name = _name;
		this.company = _company;
		this.kind = _kind;
		this.color = _color;
	}
	


	public String getName() {
		return this.name;
	}

	public String getCompany() {
		return this.company;
	}

	public String getKind() {
		return this.kind;
	}

	public String getColor() {
		return this.color;
	}



	public void setColor(String _color) {
		color = _color;
	}

	public void print() {
		System.out.println("name: "+ name);
		System.out.println("company: "+ company);
		System.out.println("kind: "+ kind);
		System.out.println("color: "+ color);
		
	}

	public static Car Create() {
		Car obj = new Car("SM5", "�Ｚ", "����", "���");
		return obj;
	}


	// method overriding
	public String toString() {
		return "name: " + name +
			", company: " + company +
			", kind: " + kind+
			", color: " + color;
	}

	public boolean equals(Object obj) {
		Car car = (Car) obj;
		if(this.name.equals(car.name) &&
			this.company.equals(car.company) &&
			this.kind.equals(car.kind) &&
			this.color.equals(car.color)) {
			return true;
		}
		return false;
	}

	protected Car clone() throws CloneNotSupportedException {
		return (Car)super.clone();
	}
	
	// method overriding
	public int compareTo(Car _car) {
	//	return this.name.compareTo(_car.name);	// �������� ����
		return -this.name.compareTo(_car.name);	// �������� ����
	}
	

	// set�� ���� overriding
	public int hashCode() {
		return (Integer)name.hashCode() + (Integer)company.hashCode() + (Integer)kind.hashCode() + (Integer)color.hashCode();
	}

	public boolean equals(Car car) {
		if(this.hashCode() ==car.hashCode()) {
			return true;
		} 
		return false;
	}

}