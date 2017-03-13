// 지역변수(Local Variable)의 유효범위(Scope)에 대한 예제
public class VarScope1 {
	//main method
	public static void main(String[] args) {
		//Local Variable
		int num1 = 5;

		{
			int num2 = 66;
			num1 = 1000;
			System.out.printf("%d%n", num1);
			System.out.printf("%d%n", num2);
		}

		System.out.printf("%d%n", num1);
		System.out.printf("%d%n", num2);	// error
		
	}
}
