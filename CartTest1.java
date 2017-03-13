import java.util.*;

public class CartTest1{

	public static void main(String[] args) {
		Cart cart = new Cart("java");
		
		// 1������  "java"  "�ϱ浿"	30000	4
		// 2������  "jsp"	"�̱浿"	40000	2
		cart.addCart(new Book(1, "java", "�ϱ浿", 30000, 4));
		cart.addCart(new Book(2, "jsp", "�̱浿", 40000, 2));
		
		if(cart.getCartList().isEmpty()) {
			System.out.println("��ٱ��Ͽ� ���������� �������� �ʽ��ϴ�.");
		} else {
			for(Book b: cart.getCartList()) {
				System.out.printf("%s\n", b);
			}
		}
		System.out.println();




		// 1�� ������ ������ 10���� �ٲٽÿ�.
		System.out.println("1�� ������ ������ 10���� �ٲٽÿ�.");
		cart.modifyCart(1, 10);

		if(cart.getCartList().isEmpty()) {
			System.out.println("��ٱ��Ͽ� ���������� �������� �ʽ��ϴ�.");
		} else {
			for(Book b: cart.getCartList()) {
				System.out.printf("%s\n", b);
			}
		}
		System.out.println();



		// 1�������� �����ϼ���.
		System.out.println("1�������� �����ϼ���. removeCart");
		cart.removeCart(1);

		if(cart.getCartList().isEmpty()) {
			System.out.println("��ٱ��Ͽ� ���������� �������� �ʽ��ϴ�.");
		} else {
			for(Book b: cart.getCartList()) {
				System.out.printf("%s\n", b);
			}
		}
		System.out.println();

		// 2�������� �����ϼ���.
		System.out.println("2�������� �����ϼ���. removeCart2");
		System.out.println(cart.getCartList().remove(cart.getCartList().get(0)));
		//cart.removeCart2(2);

		if(cart.getCartList().isEmpty()) {
			System.out.println("��ٱ��Ͽ� ���������� �������� �ʽ��ϴ�.");
		} else {
			for(Book b: cart.getCartList()) {
				System.out.printf("%s\n", b);
			}
		}
		System.out.println();



		// ��ٱ��ϸ� ��켼��.
		System.out.println("��ٱ��ϸ� ��켼��.");
		cart.emptyCart();

		if(cart.getCartList().isEmpty()) {
			System.out.println("��ٱ��Ͽ� ���������� �������� �ʽ��ϴ�.");
		} else {
			for(Book b: cart.getCartList()) {
				System.out.printf("%s\n", b);
			}
		}
		System.out.println();

	}
}