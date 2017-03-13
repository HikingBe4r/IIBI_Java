// 사원(Employee)을 구현한 super클래스
// 추상클래스

abstract class Employee {

	// instance variable
	String no;
	String name;
	String hiredate;
	
	// constructor method
	Employee() {}
	Employee(String _no, String _name, String _hiredate) {
		this.no = _no;
		this.name = _name;
		this.hiredate = _hiredate;
	}

	// abstract method
	public abstract int payCheck();

	// method
	public void getEmployeeInfo() {
		System.out.printf("no: %s\n", no);
		System.out.printf("name: %s\n", name);
		System.out.printf("hiredate: %s\n", hiredate);
	}
} // end Employee class

// sub: Daily, super: Employee
class Daily extends Employee {
	// instance variable
	private int workday;
	private int dailypay;

	// constructor method
	Daily() {}
	Daily(String _no, String _name, String _hiredate, int _workday, int _dailypay) {
		super(_no, _name, _hiredate);
		this.workday = _workday;
		this.dailypay = _dailypay;
	}

	// method overriding
	public int payCheck() {
		return workday * dailypay;
	}

	public void getEmployeeInfo() {
		super.getEmployeeInfo();
		System.out.printf("workday: %d일\n", workday);
		System.out.printf("dailypay: %,d원\n", dailypay);
		//System.out.printf("payCheck(): %,d원\n", payCheck());
	}
}

// sub: Regular, super: Employee
class Regular extends Employee {
	// instance variable
	int salary;

	// constructor method
	Regular() {}
	Regular(String _no, String _name, String _hiredate, int _salary){
		super(_no, _name, _hiredate);
		this.salary = _salary;
	}

	// method overriding
	public int payCheck() {
		return salary;
	}

	//public void getEmployeeInfo() {
	//	super.getEmployeeInfo();
	//	System.out.printf("salary: %,d원\n", salary);
	//}

}

public class AbstractTest1 {
	public static void main(String[] args) {
		//Employee emp = new Employee("E001", "일일일", "2017/01/01"); // error - 추상클래스니까 객체생성이 안됨.
		//Regular emp1 = new Regular("D001", "일용직 1호", "2017/01/01", 20000);
		//emp1.getEmployeeInfo();
		//System.out.printf("payCheck(): %,d원\n", emp1.payCheck());
		
		






	}
}