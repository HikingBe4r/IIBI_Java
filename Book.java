/* ���� �¶��� ���θ� �ý��� 
	��ٱ���(Cart)

	class :		Book	(����)

	attribute:	isbn	(??)		�����ĺ��ڵ�??
				title	(������)
				writer	(�۰�)
				price	(����)
				quantity(����)
	
	operation:	get - ��ü
				set - ����

	---------------------------------
	class:		Cart			// (has-a) Book

	attribute:	userId	
	
	operation:	addCart		(���)
				removeCart	(�����ϱ�)
				getCartList	(��ȸ)
				modifyCart	(����)
				emptyCart	(��ü����)

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