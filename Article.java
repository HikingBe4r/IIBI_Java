/*	Obj: �Խ��� ���� �ý���. 
		1. �Խñ۹�ȣ �ڵ� �ο�. // �����Ҷ����� �Խñ۹�ȣ�� �ο��ϰ��ʹ�. (���� �������ִ°��� �ƴϴ�.)
		2. String getArticleInfo() // �Խñ����� ��ȸ��� (�۹�ȣ, ����, ����, �ۼ���)
		3. ArticleTest1 ���� getArticleInfo���� �޾ƿ� String�� ����϶�.

		LinkedList�� �����϶�
*/

//import, Package

public class Article {
	// class variable  (static variable)
	private static int totalNo = 0;		//��ü �� ��
	
	// instance Variable
	private int no;				// �۹�ȣ
	private String writter;		// �ۼ���
	private String subject;		// ����
	private String content;		// �� ����
	private String password;	// ��й�ȣ

	// constructor
	public Article() {
		no = ++totalNo;
	}
	
	public Article(String _writter, String _subject, String _content, String _password) {
		this.no = ++totalNo;
		this.writter = _writter;
		this.subject = _subject;
		this.content = _content;
		this.password = _password;
	}

	// method
	public int getNo() {
		return this.no;
	}
	public String getWritter() {
		return this.writter;
	}
	public String getSubject() {
		return this.subject;
	}
	public String getContent() {
		return this.content;
	}
	public String getPassword() {
		return this.password;
	}
	public void setNo(int _no) {
		
	}
	public void setSubject(String _subject) {
		if(!subject.equals(_subject)) {
			this.subject = _subject;	
		}
	}
	public void setContent(String _content) {
		if(!content.equals(_content)) {
			this.content = _content;	
		}
	}

	public String toString() {
		return "��ȣ:\t" + no + "\t�ۼ���:\t" + writter
			+ "\t����:\t" + subject + "\t����:\t" + content;
	}


}