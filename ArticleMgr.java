/*
	Article.java 의 객체를 생성해 LinkedList에서 관리하라.
	게시판 프로그램 작성


	=== 게시판 프로그램 ===
	1. 게시글 등록			
	2. 게시글 상세조회		
	3. 전체 게시글 목록조회	
	4. 게시글 삭제			// 비밀번호 필요
	5. 게시글 수정			// 비밀번호 필요
	6. 종료					

	메뉴를 선택하세요: 

*/
import java.util.*;

public class ArticleMgr{

	private static LinkedList<Article> list = new LinkedList<Article>();

	// 1. 게시글 등록
	//  _writter,  _subject,  _content,  _password
	public static void writePost() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름:\t");		
		String writter = sc.nextLine();
		System.out.print("비번:\t");		
		String password = sc.nextLine();
		System.out.print("제목:\t");	
		String subject = sc.nextLine();
		System.out.print("내용:\t");		
		String content = sc.nextLine();

		list.add(new Article(writter, subject, content, password));

		System.out.println("등록되었습니다.");
	}

	// 2. 게시글 상세조회
	public static void viewPost() {
		if(list.isEmpty()){
			System.out.println("등록된 게시글이 없습니다.");
			return;
		} 
		Scanner sc = new Scanner(System.in);

		System.out.print("게시글 번호:\t");		
		int no = Integer.parseInt(sc.nextLine());
	
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNo() == no) {
				System.out.printf("%s\n", list.get(i));
				break;
			}
		}



	
	}

	// 3. 전체 게시글 목록 조회
	public static void viewAll() {
		if(list.isEmpty()) {
			System.out.println("등록된 게시글이 없습니다.");
			return;
		}
/*
		for(Article a: list) {
			System.out.println(a);
		}
*/

		Iterator<Article> i = list.iterator();
		while(i.hasNext()) {
			Article a = i.next();
			System.out.println(a);
		}
	}

	// 4. 게시글 삭제	
	// 비밀번호가 같으면 삭제.
	public static void deletePost() {
		if(list.isEmpty()) {
			System.out.println("등록된 게시글이 없습니다.");
			return;
		}

		Scanner sc = new Scanner(System.in);

		System.out.print("삭제할 게시글 번호:\t");		
		int no = Integer.parseInt(sc.nextLine());

		boolean flag = false;

		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNo() == no) {
				flag = true;
				break;
			}
		}

		if(flag == false) {
			System.out.println("해당 게시글이 없습니다.");
			return;
		}

		System.out.print("비밀번호를 입력하세요:\t");
		String pw = sc.nextLine();


		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNo() == no) {
				if(list.get(i).getPassword().equals(pw)) {
					list.remove(i);
					System.out.println("삭제가 완료되었습니다.");
					return;
				} else {		
					System.out.println("비밀번호가 틀렸습니다.");
					return;
				}
			}
		}

	}

	// 5. 게시글 수정
	public static void modifyPost() {
		if(list.isEmpty()) {
			System.out.println("등록된 게시글이 없습니다.");
			return;
		}
			
		Scanner sc = new Scanner(System.in);

		System.out.print("수정할 게시글 번호:\t");		
		int no = Integer.parseInt(sc.nextLine());

		System.out.print("비밀번호를 입력하세요:\t");
		String pw = sc.nextLine();

		if(!(list.get(no-1).getPassword().equals(pw))) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}

		System.out.print("수정할 제목:\t");
		String sub = sc.nextLine();

		System.out.print("수정할 내용:\t");
		String con = sc.nextLine();
		list.get(no-1).setSubject(sub);
		list.get(no-1).setContent(con);

		System.out.println("수정이 완료되었습니다.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print ("\n====전화번호부 프로그램====\n" + 
								 "1. 게시글 등록\n"+
								 "2. 게시글 상세조회\n"+
								 "3. 전체 게시글 목록 조회\n"+
								 "4. 게시글 삭제\n"+
								 "5. 게시글 수정\n"+
								 "6. 종료\n"+
								 "메뉴를 선택하세요: ");

			int i = sc.nextInt();

			System.out.println();


			switch (i) {
				case 1:
					// 1. 게시글 등록
					writePost();
					break;
				case 2:
					// 2. 게시글 상세조회
					viewPost();
					break;
				case 3:
					// 3. 전체 게시글 목록 조회
					viewAll();
					break;
				case 4:
					// 4. 게시글 삭제
					deletePost();
					break;
				case 5:
					// 5. 게시글 수정
					modifyPost();
					break;
				case 6:
					// 6. 종료
					return;
				default:
					// 다시 입력하세요.
					break;

				
			}
		}
	}
}