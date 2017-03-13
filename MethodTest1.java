/*	Obj: 
	
*/

//import, Package

public class MethodTest1{
	// Global variable

	public static int sum (int _num1, int _num2) {
		return _num1+_num2;
	}
	
	public int sum2(int _num1, int _num2) {
		return _num1+_num2;
	}


	// main method
	public static void main(String[] args) {

		// static int
		System.out.println(sum(1,2));
	
		// int, °´Ã¼ ÇÒ´ç.

		MethodTest1 obj = new MethodTest1();

		System.out.println(obj.sum2(2,3));


	}
}
