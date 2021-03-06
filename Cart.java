/* 도서 온라인 쇼핑몰 시스템 
	장바구니(Cart)

	class :		Book	(도서)

	attribute:	isbn	(??)	// 도서식별코드??
				title	(도서명)
				writer	(작가)
				price	(가격)
				quantity(수량)
	
	operation:	get - 전체
				set - 수량

	---------------------------------
	class:		Cart			// (has-a) Book

	attribute:	userId			// id 1개에 대해서 여러개의 book이 올수있음.
	
	operation:	addCart		(담기)
				removeCart	(삭제하기)
				getCartList	(조회)
				modifyCart	(변경)
				emptyCart	(전체삭제)

*/

import java.util.*;

public class Cart{

	private String userId;	// 
	private ArrayList<Book> books = new ArrayList<Book>();	// 0..*   : 0개부터 *개 까지 할수있다는 뜻.

	public Cart() {};
	public Cart(String _userId) {
		this.userId = _userId;
	}

	public String getUserId() {
		return this.userId;
	}

	// isbn이 중복되는게 있는지 체크하고, 중복이 없으면 books에 추가.
	// 중복이면 도서 수량 추가.
	public void addCart(Book _book) {

		boolean wndqhr = false;
		for(Book b: books) {
			if(b.getIsbn() == _book.getIsbn()) {
				wndqhr = true;
				b.setQuantity(b.getQuantity() + _book.getQuantity());	// 중복이니까 수량 추가. -- 이게 될까?
			}
		}

		if(wndqhr == false) {
			books.add(_book);	// 중복이 없으니 도서 추가.
		} 
	}

	// 목록조회
	public ArrayList<Book> getCartList() {
		return this.books;
	}

	// 수량 수정하기.
	// isbn이 같은 책의 수량을 set
	public void modifyCart(int _isbn, int _quantity) {
		for(Book b: books) {
			if(b.getIsbn() == _isbn) {
				b.setQuantity(_quantity);
				break;
			}
		}
	}

	// 삭제하기
	public void removeCart(int _isbn) {
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getIsbn() == _isbn) {
				books.remove(i);				
			}
		}
	}

	public void removeCart2(int _isbn) {
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getIsbn() == _isbn) {
				books.remove(books.get(i)); // true
			}
		}
	}

	// 전체삭제
	public void emptyCart() {
		books.clear();
	}
}