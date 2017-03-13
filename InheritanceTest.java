/*	Obj: 사원 클래스. 정규직(Regular), 일용직(Daily)의 상위 클래스(super class)
		public을 지운이유는?? -> 밑에 메인 클래스를 만드려고..

*/

//import, Package

class Employee{
	// instance Variable
	String no;				// 사원번호
	String name;			// 이름
	String hiredate;		// 입사일자

	// constructor
	Employee() {
	}
	Employee(String _no, String _name, String _hiredate) {
		this.no = _no;
		this.name = _name;
		this.hiredate = _hiredate;
	}
	
	// instance method
	public int payCheck() {
		return 0;	// 추상메소드 배우면 리턴 안시킴.
	}

	public void getEmployeeInfo() {
		System.out.println("사원번호: "+no);
		System.out.println("사원이름: "+name);
		System.out.println("입사일자: "+hiredate);
	}

} // end Employee class

// sub: Regular, super: Employee
class Regular extends Employee {
	// instance variable
	int salary;		// 급여

	// constructor
	Regular() {
		//super();	//생략가능, 상위클래스의 default 생성자 메소드
	}

	Regular(String _no, String _name, String _hiredate, int _salary) {
		super(_no, _name, _hiredate);	// 상위클래스의 생성자 메소드 호출
		this.salary = _salary;
	}
	
	// method overriding 메소드 재정의
	public int payCheck() {
		return salary;
	}

	public void getEmployeeInfo() {
		super.getEmployeeInfo();
		System.out.println("급여: "+ salary);
	}

	public int getSalary() {
		return this.salary;
	}

} // end Regular class

class Sales extends Regular {
	// instance variable
	private int performance;		// 판매실적
	private double commission;		// 추가수당률(커미션) 1천만원 이상-> 10%, 900이상 9% ... 500이상 5%, 500미만 0

	// 디폴트 생성자 메소드
	Sales() {
	
	}

	Sales(String _no, String _name, String _hiredate, int _salary, int _performance) {
		super(_no, _name, _hiredate, _salary);
		this.performance = _performance;
		this.commission = calCommission(_performance);
	}

	double calCommission(int _performance) {
		// 추가수당률(커미션) 1천만원 이상-> 10%, 900이상 9% ... 500이상 5%, 500미만 0
		if(_performance >= 10000000) {
			return 0.1;
		} else if (_performance >= 9000000) {
			return 0.09;
		} else if (_performance >= 8000000) {
			return 0.08;
		} else if (_performance >= 7000000) {
			return 0.07;
		} else if (_performance >= 6000000) {
			return 0.06;
		} else if (_performance >= 5000000) {
			return 0.05;
		} else {
			return 0;
		}
	}

	public int payCheck() {
		return (int) (salary + (performance * commission));
	}

	public void getEmployeeInfo() {
		super.getEmployeeInfo();
		System.out.println("판매실적: "+performance);
		System.out.printf("커미션: %d%%\n",(int) (commission*100));
	}

	public int getPerformance() {
		return this.performance;
	}

	public double getCommission() {
		return this.commission*100.0;
	}

} // end Salesman class

class Daily extends Employee {
	private int workday;	// 근무 일수
	private int dailypay;	// 일당

	Daily() {
		// default constructor
	}

	Daily(String _no, String _name, String _hiredate, int _workday, int _dailypay) {
		super(_no, _name, _hiredate);

		this.workday = _workday;
		this.dailypay = _dailypay;
	}
	
	public int payCheck() {
		return this.workday * this.dailypay;
	}

	public void getEmployeeInfo() {
		super.getEmployeeInfo();
		System.out.println("근무일수: "+ workday);
		System.out.println("일당급여: "+ dailypay);
	}
	public int getDailypay() {
		return this.dailypay;
	}
	public int getWorkday() {
		return this.workday;
	}
	public void print() {
		System.out.printf("Daily.print(): %s\n", no);
	}

} // end Daily class


// 메인클래스: 상속테스트
public class InheritanceTest {
	public static void main(String[] args) {
		Daily emp1 = new Daily("D001", "일용직1호", "2017.01.01", 20, 200000);
		emp1.print();
	}
}