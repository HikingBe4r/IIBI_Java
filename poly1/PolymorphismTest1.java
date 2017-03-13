/*	Obj: ��� Ŭ����. ������(Regular), �Ͽ���(Daily)�� ���� Ŭ����(super class)
		public�� ����������?? -> �ؿ� ���� Ŭ������ �������..

*/

//import, Package

class Employee{
	// instance Variable
	String no;				// �����ȣ
	String name;			// �̸�
	String hiredate;		// �Ի�����

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
		return 0;	// �߻�޼ҵ� ���� ���� �Ƚ�Ŵ.
	}

	public void getEmployeeInfo() {
		System.out.println("�����ȣ: "+no);
		System.out.println("����̸�: "+name);
		System.out.println("�Ի�����: "+hiredate);
	}

} // end Employee class

// sub: Regular, super: Employee
class Regular extends Employee {
	// instance variable
	int salary;		// �޿�

	// constructor
	Regular() {
		//super();	//��������, ����Ŭ������ default ������ �޼ҵ�
	}

	Regular(String _no, String _name, String _hiredate, int _salary) {
		super(_no, _name, _hiredate);	// ����Ŭ������ ������ �޼ҵ� ȣ��
		this.salary = _salary;
	}
	
	// method overriding �޼ҵ� ������
	public int payCheck() {
		return salary;
	}

	public void getEmployeeInfo() {
		super.getEmployeeInfo();
		System.out.printf("�޿�: %,d��\n", payCheck());
	}


	public int getSalary() {
		return this.salary;
	}

} // end Regular class

class Sales extends Regular {
	// instance variable
	private int performance;		// �ǸŽ���
	private double commission;		// �߰������(Ŀ�̼�) 1õ���� �̻�-> 10%, 900�̻� 9% ... 500�̻� 5%, 500�̸� 0

	// ����Ʈ ������ �޼ҵ�
	Sales() {
	
	}

	Sales(String _no, String _name, String _hiredate, int _salary, int _performance) {
		super(_no, _name, _hiredate, _salary);
		this.performance = _performance;
		this.commission = calCommission(_performance);
	}

	double calCommission(int _performance) {
		// �߰������(Ŀ�̼�) 1õ���� �̻�-> 10%, 900�̻� 9% ... 500�̻� 5%, 500�̸� 0
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
		System.out.printf("�ǸŽ���: %,d\n", performance);
		System.out.printf("Ŀ�̼�: %.1f%%\n", commission*100);
	}


} // end Salesman class

class Daily extends Employee {
	private int workday;	// �ٹ� �ϼ�
	private int dailypay;	// �ϴ�

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
		System.out.println("�ٹ��ϼ�: "+ workday);
		System.out.printf("�ϴ�޿�: %,d��\n", dailypay);
		System.out.printf("�� �޿�: %,d��\n", payCheck());
	}

} // end Daily class


// ����Ŭ����: ������-����׽�Ʈ
public class PolymorphismTest1 {
	public static void main(String[] args) {
		Employee emp = create(2);
		emp.getEmployeeInfo();
		printSalary(emp);
	}
	
	// �Ű������� Employee���� ���������� ���� Daily, Regular�� ����ɼ��ִ�.
	public static void printSalary(Employee _emp) {
		System.out.printf("%s�� �޿�: %,d��\n", _emp.name, _emp.payCheck());
	}


	public static Employee create(int type) {
		Employee emp;

		if(type == 1) {
			// ��������� ����
			emp = new Regular("R001", "������1ȣ", "2017.01.10", 4000000);
			return emp;
		} else if(type == 2) {
			// �Ͽ������ ����
			emp = new Daily("D001", "�Ͽ���1ȣ", "2017/01/01", 20, 250000);
			return emp;
		} else {
			// ��������� ����
			emp = new Sales("S001", "������1ȣ", "2017.04.04", 4000000, 100000000);
			return emp;
		}
	}
}