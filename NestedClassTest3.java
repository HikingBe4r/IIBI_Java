
public class NestedClassTest3 {

	public static void main(String[] args) {
		int num1 = 5;

		class LocalInner {
			private int num2 = 10;

			public LocalInner() {
			
			}

			public void printLocalInner() {
				System.out.printf("num1: %d\n", num1);
				System.out.printf("num2: %d\n", num2);
			}
		}

		LocalInner li = new LocalInner();

		li.printLocalInner();


	}


}