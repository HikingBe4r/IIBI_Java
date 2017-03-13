/* 도서 온라인 쇼핑몰 시스템 
	장바구니(Cart)

	class :		Book	(도서)

	attribute:	isbn	(??)		도서식별코드??
				title	(도서명)
				writer	(작가)
				price	(가격)
				quantity(수량)
	
	operation:	get - 전체
				set - 수량

	---------------------------------
	class:		Cart			// (has-a) Book

	attribute:	userId	
	
	operation:	addCart		(담기)
				removeCart	(삭제하기)
				getCartList	(조회)
				modifyCart	(변경)
				emptyCart	(전체삭제)

*/
public class Book implements Comparable<Book>{
	
	private int isbn;
	private String title;
	private String writer;
	private int price;
	private int quantity;
	

	public Book() {};
	public Book(int _isbn, String _title, String _writer, int _price, int _quantity) {
		this.isbn = _isbn;
		this.title = _title;
		this.writer = _writer;
		this.price = _price;
		this.quantity = _quantity;
	}

	// get
	public int getIsbn() {
		return this.isbn;
	}
	public String getTitle() {
		return this.title;
	}
	public String getWriter() {
		return this.writer;
	}
	public int getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return this.quantity;
	}

	// set
	public void setQuantity(int _quantity) {
		this.quantity = _quantity;
	}

	// method overriding
	public String toString() {
		return "isbn: "+ isbn + ", title: "+ title + ", writer: "+ writer + ", price: "+ price + ", quantity: "+ quantity;
	}

	public int hashCode() {
		return new Integer(isbn).hashCode() + title.hashCode() + writer.hashCode() +
			new Integer(price).hashCode() + new Integer(quantity).hashCode();
	}

	public boolean equals(Object obj) {
		if(this.hashCode() == ((Book)obj).hashCode()) {
			return true;
		}
		return false;
	}

	public int compareTo(Book book) {
		Integer a = this.isbn;
		Integer b = book.isbn;

		return a.compareTo(b);
	}

}