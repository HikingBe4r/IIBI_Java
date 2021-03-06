/*	Obj: 게시판 관리 시스템. 
		1. 게시글번호 자동 부여. // 생성할때마다 게시글번호를 부여하고싶다. (따로 지정해주는것이 아니다.)
		2. String getArticleInfo() // 게시글정보 조회기능 (글번호, 제목, 내용, 작성자)
		3. ArticleTest1 에서 getArticleInfo에서 받아온 String을 출력하라.

		LinkedList로 관리하라
*/

//import, Package

public class Article {
	// class variable  (static variable)
	private static int totalNo = 0;		//전체 글 수
	
	// instance Variable
	private int no;				// 글번호
	private String writter;		// 작성자
	private String subject;		// 제목
	private String content;		// 글 내용
	private String password;	// 비밀번호

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
		return "번호:\t" + no + "\t작성자:\t" + writter
			+ "\t제목:\t" + subject + "\t내용:\t" + content;
	}


}