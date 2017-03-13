/*
	Article.java �� ��ü�� ������ LinkedList���� �����϶�.
	�Խ��� ���α׷� �ۼ�


	=== �Խ��� ���α׷� ===
	1. �Խñ� ���			
	2. �Խñ� ����ȸ		
	3. ��ü �Խñ� �����ȸ	
	4. �Խñ� ����			// ��й�ȣ �ʿ�
	5. �Խñ� ����			// ��й�ȣ �ʿ�
	6. ����					

	�޴��� �����ϼ���: 

*/
import java.util.*;

public class ArticleMgr{

	private static LinkedList<Article> list = new LinkedList<Article>();

	// 1. �Խñ� ���
	//  _writter,  _subject,  _content,  _password
	public static void writePost() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸�:\t");		
		String writter = sc.nextLine();
		System.out.print("���:\t");		
		String password = sc.nextLine();
		System.out.print("����:\t");	
		String subject = sc.nextLine();
		System.out.print("����:\t");		
		String content = sc.nextLine();

		list.add(new Article(writter, subject, content, password));

		System.out.println("��ϵǾ����ϴ�.");
	}

	// 2. �Խñ� ����ȸ
	public static void viewPost() {
		if(list.isEmpty()){
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
			return;
		} 
		Scanner sc = new Scanner(System.in);

		System.out.print("�Խñ� ��ȣ:\t");		
		int no = Integer.parseInt(sc.nextLine());
	
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNo() == no) {
				System.out.printf("%s\n", list.get(i));
				break;
			}
		}



	
	}

	// 3. ��ü �Խñ� ��� ��ȸ
	public static void viewAll() {
		if(list.isEmpty()) {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
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

	// 4. �Խñ� ����	
	// ��й�ȣ�� ������ ����.
	public static void deletePost() {
		if(list.isEmpty()) {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
			return;
		}

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Խñ� ��ȣ:\t");		
		int no = Integer.parseInt(sc.nextLine());

		boolean flag = false;

		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNo() == no) {
				flag = true;
				break;
			}
		}

		if(flag == false) {
			System.out.println("�ش� �Խñ��� �����ϴ�.");
			return;
		}

		System.out.print("��й�ȣ�� �Է��ϼ���:\t");
		String pw = sc.nextLine();


		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNo() == no) {
				if(list.get(i).getPassword().equals(pw)) {
					list.remove(i);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					return;
				} else {		
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					return;
				}
			}
		}

	}

	// 5. �Խñ� ����
	public static void modifyPost() {
		if(list.isEmpty()) {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
			return;
		}
			
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Խñ� ��ȣ:\t");		
		int no = Integer.parseInt(sc.nextLine());

		System.out.print("��й�ȣ�� �Է��ϼ���:\t");
		String pw = sc.nextLine();

		if(!(list.get(no-1).getPassword().equals(pw))) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			return;
		}

		System.out.print("������ ����:\t");
		String sub = sc.nextLine();

		System.out.print("������ ����:\t");
		String con = sc.nextLine();
		list.get(no-1).setSubject(sub);
		list.get(no-1).setContent(con);

		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print ("\n====��ȭ��ȣ�� ���α׷�====\n" + 
								 "1. �Խñ� ���\n"+
								 "2. �Խñ� ����ȸ\n"+
								 "3. ��ü �Խñ� ��� ��ȸ\n"+
								 "4. �Խñ� ����\n"+
								 "5. �Խñ� ����\n"+
								 "6. ����\n"+
								 "�޴��� �����ϼ���: ");

			int i = sc.nextInt();

			System.out.println();


			switch (i) {
				case 1:
					// 1. �Խñ� ���
					writePost();
					break;
				case 2:
					// 2. �Խñ� ����ȸ
					viewPost();
					break;
				case 3:
					// 3. ��ü �Խñ� ��� ��ȸ
					viewAll();
					break;
				case 4:
					// 4. �Խñ� ����
					deletePost();
					break;
				case 5:
					// 5. �Խñ� ����
					modifyPost();
					break;
				case 6:
					// 6. ����
					return;
				default:
					// �ٽ� �Է��ϼ���.
					break;

				
			}
		}
	}
}