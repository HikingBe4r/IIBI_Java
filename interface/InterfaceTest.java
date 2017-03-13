// volume �������̽�
interface ExtendedVolume {
	//abstract method
	void volumeOn(int _volumeLevel);
	void volumeOff();
}
interface Volume extends ExtendedVolume{
	// abstract method
	void volumeUp(int _volumeLevel);		// public abstract ����
	void volumeDown(int _volumeLevel);		// public abstract ����
} // end Volume interface

class TV implements Volume {
	// instance varable
	private int volumeLevel;

	// constructor
	TV() {}
	TV(int _volumeLevel) {
		this.volumeLevel = _volumeLevel;
	}

	// method overriding
	// public abstract�� �����Ȱ��̱� ������ public�� �ٿ�����Ѵ�.
	public void volumeUp(int _volumeLevel) {
		this.volumeLevel += _volumeLevel;
		System.out.println("�Ҹ��� ���Դϴ�. ����Ҹ�: "+ this.volumeLevel);
	}

	public void volumeDown(int _volumeLevel) {
		this.volumeLevel -= _volumeLevel;
		System.out.println("�Ҹ��� ����ϴ�. ����Ҹ�: "+ this.volumeLevel);
	}

	public void volumeOn(int _volumeLevel) {
		this.volumeLevel = _volumeLevel;
		System.out.println("�Ҹ��� �մϴ�. ����Ҹ�: "+ this.volumeLevel);
	}

	public void volumeOff() {
		this.volumeLevel = 0;
		System.out.println("�Ҹ��� ���ϴ�. ����Ҹ�: "+ this.volumeLevel);
	}
	
}

class Audio implements Volume {
	// instance variable
	private int volumeLevel;

	// constructor method
	Audio() {}
	Audio(int _volumeLevel) {
		this.volumeLevel = _volumeLevel;
	}
	
	// method overriding
	public void volumeUp(int _volumeLevel) {
		this.volumeLevel += _volumeLevel;
		System.out.println("�Ҹ��� ���Դϴ�. ����Ҹ�: "+ this.volumeLevel);
	}

	public void volumeDown(int _volumeLevel) {
		this.volumeLevel -= _volumeLevel;
		System.out.println("�Ҹ��� ����ϴ�. ����Ҹ�: "+ this.volumeLevel);
	}

	public void volumeOn(int _volumeLevel) {
		this.volumeLevel = _volumeLevel;
		System.out.println("�Ҹ��� �մϴ�. ����Ҹ�: "+ this.volumeLevel);
	}

	public void volumeOff() {
		this.volumeLevel = 0;
		System.out.println("�Ҹ��� ���ϴ�. ����Ҹ�: "+ this.volumeLevel);
	}
}



public class InterfaceTest {
	public static void main(String[] args) {
		TV obj1 = new TV(10);
		obj1.volumeUp(50);
		obj1.volumeDown(1000);
		obj1.volumeOff();
		obj1.volumeOn(100);

		Audio obj2 = new Audio(100);
		obj2.volumeUp(50);
		obj2.volumeDown(100);
		obj1.volumeOff();
		obj1.volumeOn(100);
	}
}