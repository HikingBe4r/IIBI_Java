// copy와 clone의 차이

public class CopyTest1{
	public static void main(String[] args) throws CloneNotSupportedException{
		Car obj = new Car("SM5", "삼성", "중형", "흰색");

		// copy
		Car copy = obj;
		System.out.printf("obj: %s\ncopy: %s\n", obj, copy);
		copy.setColor("블랙");
		System.out.printf("obj: %s\ncopy: %s\n", obj.getColor(), copy.getColor());

		
		// clone
		Car clone = obj.clone();
		System.out.printf("obj: %s\nclone: %s\n", obj, clone);
		clone.setColor("뭐라니");
		System.out.printf("obj: %s\nclone: %s\n", obj.getColor(), clone.getColor());
	}
}