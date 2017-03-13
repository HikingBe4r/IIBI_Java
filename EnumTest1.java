import java.util.*;

public class EnumTest1{
	enum Enum1 {
		SPRING(1), 
		SUMMER(2), 
		FALL(3), 
		WINTER(4);

		private int num;

		private Enum1() {
		}

		private Enum1(int num) {
			this.num = num;
		}

		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¼ıÀÚ: ");
		int inputNum = sc.nextInt();


		Enum1 num;
		num.setNum(inputNum);

		switch(num) {
			case SPRING:
				break;
			default:
				break;
		}
	}
}