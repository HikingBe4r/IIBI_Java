public class CloneTest{
	public static void main(String[] args) throws CloneNotSupportedException {
		Car[] obj = new Car[3];

		obj[0] = new Car("SM", "삼성", "중형", "흰색");
		obj[1] = new Car("SM2", "삼성2", "중형2", "흰색2");
		obj[2] = new Car("SM3", "삼성3", "중형3", "흰색3");

		Car[] clone = obj.clone();		// 이걸하면 다 복제되게하고싶다.
		
		for(int i =0; i < obj.length; i++) {
			clone[i] = obj[i].clone();
		}

		for(Car temp: obj) {
			System.out.printf("%s\t", temp);
		}
		System.out.println();

		for(Car temp: clone) {
			System.out.printf("%s\t", temp);
		}

		System.out.println();
	}
}