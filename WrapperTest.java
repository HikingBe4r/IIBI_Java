

public class WrapperTest{
	public static void main(String[] args) {

		int num = 5;

/*
		// 1. Primitive Data Type --> Reference Data Type
		Integer i = new Integer(num);

		System.out.printf("%s\n", i.toString());	// %d가 아니라 %s
*/

/*
		// 2. 
		Integer i = Integer.valueOf(num);

		System.out.printf("%s\n", i.toString());	// %d가 아니라 %s
*/
		
/*
		// 3. AutoBoxing
		print(num);	// or print(Integer.valueOf(num))
*/
/*
		// 4. reference data type -> primitive data type 산술연산
		Integer obj1 = new Integer(5); 
		Integer obj2 = new Integer(10); 

		int result = obj1.intValue() + obj2.intValue();

		System.out.printf("%d\n", result);
*/

/*
		// 5. 
		int result2 = total(new Integer(5), new Integer(10));
		System.out.println(result2);
*/

	}

/*
	public static void print(Integer i) {
		System.out.printf("%s\n", i.toString());
	}
*/

	public static int total (Integer num1, Integer num2) {
		return num1.intValue() + num2.intValue();
	}

}