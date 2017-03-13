// volume 인터페이스
interface ExtendedVolume {
	//abstract method
	void volumeOn(int _volumeLevel);
	void volumeOff();
}
interface Volume extends ExtendedVolume{
	// abstract method
	void volumeUp(int _volumeLevel);		// public abstract 생략
	void volumeDown(int _volumeLevel);		// public abstract 생략
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
	// public abstract가 생략된것이기 때문에 public을 붙여줘야한다.
	public void volumeUp(int _volumeLevel) {
		this.volumeLevel += _volumeLevel;
		System.out.println("소리를 높입니다. 현재소리: "+ this.volumeLevel);
	}

	public void volumeDown(int _volumeLevel) {
		this.volumeLevel -= _volumeLevel;
		System.out.println("소리를 낮춥니다. 현재소리: "+ this.volumeLevel);
	}

	public void volumeOn(int _volumeLevel) {
		this.volumeLevel = _volumeLevel;
		System.out.println("소리를 켭니다. 현재소리: "+ this.volumeLevel);
	}

	public void volumeOff() {
		this.volumeLevel = 0;
		System.out.println("소리를 끕니다. 현재소리: "+ this.volumeLevel);
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
		System.out.println("소리를 높입니다. 현재소리: "+ this.volumeLevel);
	}

	public void volumeDown(int _volumeLevel) {
		this.volumeLevel -= _volumeLevel;
		System.out.println("소리를 낮춥니다. 현재소리: "+ this.volumeLevel);
	}

	public void volumeOn(int _volumeLevel) {
		this.volumeLevel = _volumeLevel;
		System.out.println("소리를 켭니다. 현재소리: "+ this.volumeLevel);
	}

	public void volumeOff() {
		this.volumeLevel = 0;
		System.out.println("소리를 끕니다. 현재소리: "+ this.volumeLevel);
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