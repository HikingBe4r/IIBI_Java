//연산자 2. 증감연산자.
import java.util.*;

public class Operator2 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1;

		System.out.printf("num1: %d%n", num1);			
		System.out.printf("num1++: %d%n", num1++);		
		System.out.printf("++num1: %d%n", ++num1);		
		System.out.printf("num1: %d%n", num1);

		int a,b,c;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);

	}
}