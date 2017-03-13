/*	Obj: 
	
*/

//import, Package

public class MethodTest2{
	
	// 홀수이면 true 반환.
	public static boolean odd(int num) {
		if(num%2 == 1) {
			return true;
		} else {
			return false;
		}
	}


	// main method
	public static void main(String[] args) {
		System.out.println(odd(5));
		System.out.println(odd(10));

	}
}
