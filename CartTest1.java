import java.util.*;

public class CartTest1{

	public static void main(String[] args) {
		Cart cart = new Cart("java");
		
		// 1번도서  "java"  "일길동"	30000	4
		// 2번도서  "jsp"	"이길동"	40000	2
		cart.addCart(new Book(1, "java", "일길동", 30000, 4));
		cart.addCart(new Book(2, "jsp", "이길동", 40000, 2));
		
		if(cart.getCartList().isEmpty()) {
			System.out.println("장바구니에 도서내역이 존재하지 않습니다.");
		} else {
			for(Book b: cart.getCartList()) {
				System.out.printf("%s\n", b);
			}
		}
		System.out.println();




		// 1번 도서의 수량을 10으로 바꾸시오.
		System.out.println("1번 도서의 수량을 10으로 바꾸시오.");
		cart.modifyCart(1, 10);

		if(cart.getCartList().isEmpty()) {
			System.out.println("장바구니에 도서내역이 존재하지 않습니다.");
		} else {
			for(Book b: cart.getCartList()) {
				System.out.printf("%s\n", b);
			}
		}
		System.out.println();



		// 1번도서를 삭제하세요.
		System.out.println("1번도서를 삭제하세요. removeCart");
		cart.removeCart(1);

		if(cart.getCartList().isEmpty()) {
			System.out.println("장바구니에 도서내역이 존재하지 않습니다.");
		} else {
			for(Book b: cart.getCartList()) {
				System.out.printf("%s\n", b);
			}
		}
		System.out.println();

		// 2번도서를 삭제하세요.
		System.out.println("2번도서를 삭제하세요. removeCart2");
		System.out.println(cart.getCartList().remove(cart.getCartList().get(0)));
		//cart.removeCart2(2);

		if(cart.getCartList().isEmpty()) {
			System.out.println("장바구니에 도서내역이 존재하지 않습니다.");
		} else {
			for(Book b: cart.getCartList()) {
				System.out.printf("%s\n", b);
			}
		}
		System.out.println();



		// 장바구니를 비우세요.
		System.out.println("장바구니를 비우세요.");
		cart.emptyCart();

		if(cart.getCartList().isEmpty()) {
			System.out.println("장바구니에 도서내역이 존재하지 않습니다.");
		} else {
			for(Book b: cart.getCartList()) {
				System.out.printf("%s\n", b);
			}
		}
		System.out.println();

	}
}