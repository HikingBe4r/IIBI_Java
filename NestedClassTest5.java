
public class NestedClassTest5{
	public static void main(String[] args) {

		Object obj = new Object() {
			public String toString() {
				return "Hi, anony";
			}
		};


		Object obj2 = new Object();
		

		System.out.println(obj);
		System.out.println(obj2);
	}
}