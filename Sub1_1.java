import java.util.Calendar;
import java.util.GregorianCalendar;

public class Sub1_1{
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);

		String num1 = "790608-2552416";
		String num2 = "234567-892345";

		int sum=0;

		num1 = num1.split("-")[0] + num1.split("-")[1];
		num2 = num2.split("-")[0] + num2.split("-")[1];

		for(int i = 0; i < num2.length(); i++) {

			sum += ((num1.charAt(i)-48)*(num2.charAt(i)-48));	//char�� �̴ϱ� -48 or '0'
			
			System.out.printf("sum %d: %d\n", i, sum);
		
		}

		int check = (11-(sum%11))%10;
		System.out.printf("sum: %d, check: %d\n", sum, check);

		if(check == num1.charAt(num1.length()-1)-48) {
			System.out.printf("��ȿ�� �ֹε�Ϲ�ȣ �Դϴ�.\n");
		} else {
			System.out.printf("�߸��� �ֹε�Ϲ�ȣ �Դϴ�.\n");
		}

		// 1, 2�̸� 1900�⵵, 3,4�̸� 2000�⵵
		// ���� ���̸� ���϶�.
		int yAge=0;
		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		
		if(num1.charAt(6) == '1' || num1.charAt(6) == '2' ) {

			//num1.substring(0,2) "79"
			//Integer.parseInt(num1.substring(0,2)) 79 +1900 = 1979
			// 2017 - 1979 =����
			yAge = 1900 + Integer.parseInt(num1.substring(0,2));
		} else if(num1.charAt(6) == '3' || num1.charAt(6) == '4' ) {

			yAge = 2000 + Integer.parseInt(num1.substring(0,2));
		} 
		//System.out.printf("%d\n", yAge);

		int age = year - yAge;
		System.out.printf("����: %d\n", age);


	}
}