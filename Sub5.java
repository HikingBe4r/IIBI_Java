/*	Obj: 
1
2
3
4
5
를 출력하시오. for while do~while
	
*/

//import, Package

public class Sub5{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		
		// for
		for(int i = 1; i <= 5; i++) {
			System.out.printf("%d\n", i);
		}

		System.out.println("-----------------------------");

		// while
		int b = 1;
		while (b <= 5) {
			System.out.printf("%d\n", b);
			b++;
		}

		System.out.println("-----------------------------");

		// do~while
		int c = 1;
		do {
			System.out.printf("%d\n", c);
			c++;

		} while(c <= 5);

	}
}
