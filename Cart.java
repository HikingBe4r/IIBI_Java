/* ���� �¶��� ���θ� �ý��� 
	��ٱ���(Cart)

	class :		Book	(����)

	attribute:	isbn	(??)	// �����ĺ��ڵ�??
				title	(������)
				writer	(�۰�)
				price	(����)
				quantity(����)
	
	operation:	get - ��ü
				set - ����

	---------------------------------
	class:		Cart			// (has-a) Book

	attribute:	userId			// id 1���� ���ؼ� �������� book�� �ü�����.
	
	operation:	addCart		(���)
				removeCart	(�����ϱ�)
				getCartList	(��ȸ)
				modifyCart	(����)
				emptyCart	(��ü����)

*/

import java.util.*;

public class Cart{

	private String userId;	// 
	private ArrayList<Book> books = new ArrayList<Book>();	// 0..*   : 0������ *�� ���� �Ҽ��ִٴ� ��.

	public Cart() {};
	public Cart(String _userId) {
		this.userId = _userId;
	}

	public String getUserId() {
		return this.userId;
	}

	// isbn�� �ߺ��Ǵ°� �ִ��� üũ�ϰ�, �ߺ��� ������ books�� �߰�.
	// �ߺ��̸� ���� ���� �߰�.
	public void addCart(Book _book) {

		boolean wndqhr = false;
		for(Book b: books) {
			if(b.getIsbn() == _book.getIsbn()) {
				wndqhr = true;
				b.setQuantity(b.getQuantity() + _book.getQuantity());	// �ߺ��̴ϱ� ���� �߰�. -- �̰� �ɱ�?
			}
		}

		if(wndqhr == false) {
			books.add(_book);	// �ߺ��� ������ ���� �߰�.
		} 
	}

	// �����ȸ
	public ArrayList<Book> getCartList() {
		return this.books;
	}

	// ���� �����ϱ�.
	// isbn�� ���� å�� ������ set
	public void modifyCart(int _isbn, int _quantity) {
		for(Book b: books) {
			if(b.getIsbn() == _isbn) {
				b.setQuantity(_quantity);
				break;
			}
		}
	}

	// �����ϱ�
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

	// ��ü����
	public void emptyCart() {
		books.clear();
	}
}