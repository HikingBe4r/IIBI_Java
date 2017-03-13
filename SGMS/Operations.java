/*	Obj: 학생 성적관리 시스템 기능부분.
	
	1. 학생성적등록	

		public static StudentInfo[] AddStudent(StudentInfo[] temp)

	2. 번호별 학생성적 조회
		public static void viewStudentsByNumber (StudentInfo[] temp)

	3. 순위별 전체 학생성적 조회
		public static void viewByRank (StudentInfo[] temp)

	4. 개인별 학생성적 조회(이름or번호 입력)
		a. 이름
			public static void viewStudentByName(StudentInfo[] temp)
		b. 번호
			public static void viewStudentByNumber(StudentInfo[] temp)
	
+	조회할때 틀		public static void printCase()
	학생조회 반복	public static void printStudent(StudentInfo[] temp)
	순위매기기		public static void determineRanking (StudentInfo[] temp)

	메뉴선택기		setMenu();
	학생정보출력	printStudent(StudentInfo... temp)
*/

import java.util.Scanner;

public class Operations {

	public StudentInfo[] student = new StudentInfo[2];

	// 메뉴선택기
	public void setMenu() {
		Scanner sc = new Scanner(System.in);
      while(true) {
		 System.out.println("=====학생 성적관리 시스템=====");
         System.out.println("1. 학생 성적 등록");
         System.out.println("2. 번호별 전체 학생 성적 조회");
         System.out.println("3. 순위별 전체 학생 성적 조회");
         System.out.println("4. 개인별 학생 성적 조회");
         System.out.println("   - 이름");
         System.out.println("   - 번호");
         System.out.println("5. 종료");
         System.out.print("메뉴를 선택하세요[1-5] : ");
         int i = sc.nextInt();
         System.out.println();

         switch(i) {
            case 1:
               //1. 등록
				student = AddStudent(student);
               break;
            case 2:
               // 2. 번호별 조회
				viewStudentsByNumber(student);
               break;
            case 3:
               // 3. 순위별 조회
				viewByRank(student);
               break;
            case 4:
               // 4. 개인별 성적(이름 or 번호로 조회)
				chooseView(student);
               break;
            case 5:
               // 5. 종료
               System.out.println("프로그램을 종료합니다.");
               return ;
            default:
               System.out.println("1~5 사이의 번호를 입력하세요.");
               System.out.println();
               break;
         }
      }
	}	// end setMenu

	// 0. 멋있게 조회하기.
	public void printCase() {
		System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\t순위\n");
		System.out.printf("=============================================================\n");
	} // end printCase
	
	// 학생정보 출력1: 배열 출력 
	public void printStudent(StudentInfo... temp) {
		printCase();
		for(StudentInfo i: temp) {
			if(i != null) {
				System.out.printf("%d\t", i.getNo()+1);			// 번호
				System.out.printf("%s\t", i.getName());			// 이름
				System.out.printf("%d\t", i.getKorScore());		// 국어
				System.out.printf("%d\t", i.getEngScore());		// 영어
				System.out.printf("%d\t", i.getMathScore());	// 수학
				System.out.printf("%d\t", i.getToTal());		// 총점
				System.out.printf("%.2f\t", i.getAverage());	// 평균
				System.out.printf("%d\n", i.getRank());			//순위 출력
			} else {
				break;
			}
		}
		System.out.println();	// 깔끔함을 위해
	} // end printStudent

	// 배열 크기 증가시키기.
	public StudentInfo[] expandArray(StudentInfo[] temp) {
		
		StudentInfo[] expand = new StudentInfo[temp.length+1];
		for(int i = 0; i < temp.length; i++) {
				expand[i] = temp[i];
		}
		return expand;
	}

	// 1. 학생 등록
	// StudentInfo[]의 가장 마지막항에 ++ 시켜서 추가시킨다.
	// **StudentInfo[]의 크기가 1일땐 되는데 처음부터 크게 정해져있으면...?
	public StudentInfo[] AddStudent(StudentInfo[] temp) {
		// 생성자: String name, int korScore, int engScore, int mathScore

		// 등록할 학생정보 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String _name = scan.nextLine();
		System.out.print("국어점수: ");
		int _korScore = scan.nextInt();
		System.out.print("영어점수: ");
		int _engScore = scan.nextInt();
		System.out.print("수학점수: ");
		int _mathScore = scan.nextInt();
		System.out.println();
		StudentInfo std = new StudentInfo(_name, _korScore, _engScore, _mathScore);
		
		// StudentInfo[]의 크기가 1일땐 되는데 처음부터 크게 정해져있으면...?
		if(StudentInfo.getNumberOfStudent()-1 == temp.length) {
			temp = expandArray(temp);
			temp[StudentInfo.getNumberOfStudent()-1] = std;
			determineRanking(temp);
			return temp;
		} else {
			temp[StudentInfo.getNumberOfStudent()-1] = std;
			determineRanking(temp);
			return temp;
		}

	} // end AddStudent

	// 2. 번호별조회 method
	// StudentInfo[] 을 그냥 읽으면 됨.
	public void viewStudentsByNumber (StudentInfo[] temp) {
		if(temp[0] == null) {
			System.out.println("학생을 등록하세요.\n");
		} else {
			printStudent(temp);
		}
		/*
		for(StudentInfo i: temp) {
			if(i == null) {
				System.out.println("학생을 등록해주세요.");
				System.out.println();
				break;
			} else if(i != null) {
				System.out.printf("%d\t", i.getNo());			// 번호
				System.out.printf("%s\t", i.getName());			// 이름
				System.out.printf("%d\t", i.getKorScore());		// 국어
				System.out.printf("%d\t", i.getEngScore());		// 영어
				System.out.printf("%d\t", i.getMathScore());	// 수학
				System.out.printf("%d\t", i.getToTal());		// 총점
				System.out.printf("%.2f\t", i.getAverage());	// 평균
				System.out.printf("%d\n", i.getRank());			//순위 출력
				//System.out.println();
			}
		}
		*/
		
	} // end viewStudentByNumber

	// 3. 순위별 전체 학생성적 조회
	// 학생등록때 rank를 입력시키고, 랭크순 정렬후 출력.
	// bug: 1233367 일때 3의 첫번째에서 끊김.
	public void viewByRank (StudentInfo[] temp) {

		// rank가 같으면 다음번 rank들은 null이 되는 문제
		// -> rank가 같으면 번호순으로 출력. 해야한다.
		if(temp[0] == null) {
			System.out.println("학생을 등록하세요.\n");
		} else {
			printStudent(sortByRank(temp));
		}
		/*
		for(StudentInfo i: sortByRank(temp)) {
			if(i == null) {
				System.out.println("학생을 등록해주세요.");
				System.out.println();
				break;
			} else if(i != null) {
				System.out.printf("%d\t", i.getNo());			// 번호
				System.out.printf("%s\t", i.getName());			// 이름
				System.out.printf("%d\t", i.getKorScore());		// 국어
				System.out.printf("%d\t", i.getEngScore());		// 영어
				System.out.printf("%d\t", i.getMathScore());	// 수학
				System.out.printf("%d\t", i.getToTal());		// 총점
				System.out.printf("%.2f\t", i.getAverage());	// 평균
				System.out.printf("%d\n", i.getRank());			//순위 출력
			}
		}
		*/
	} // end viewByRank

	// 순위 정렬
	public StudentInfo[] sortByRank (StudentInfo[] temp) {
		StudentInfo[] StudentRank = new StudentInfo[temp.length];
		for(int i = 0; i < StudentRank.length; i++) {
			for(int j = 0; j < temp.length; j++) {
				if(temp[j] != null) {
					if(temp[j].getRank() == i+1) {
						StudentRank[i] = temp[j];
						break;
					}
				}
			}
		}
		return StudentRank;
	} // end sortByRank
	
	// * 순위 매기기
	public void determineRanking (StudentInfo[] temp) {
		int rank;
		for(int i = 0; i < StudentInfo.getNumberOfStudent(); i++) {
			rank = 1;
			for(int j = 0; j < StudentInfo.getNumberOfStudent(); j++) {
				if(temp[i].getToTal() < temp[j].getToTal()) {
					rank++;
				}
			}
			temp[i].setRank(rank);
		}
	} // end determineRanking

	// 4. 개인별 학생 성적 조회
	public void chooseView(StudentInfo[] temp) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 이름검색\t2.번호검색: ");
		int a = Integer.parseInt(sc.nextLine());
		
		switch(a) {
			case 1:
				System.out.print("\n검색할 이름: ");
				String _name = sc.nextLine();
				viewStudentByName(temp, _name);
				break;
			case 2:
				System.out.print("검색할 번호: ");
				int _num = sc.nextInt();
				viewStudentByNumber(temp, _num);
				break;
			default:
				System.out.println("잘못 입력했습니다..");
				break;
		}

	}
	// a. 이름입력
	public void viewStudentByName(StudentInfo[] temp, String _name) {
		StudentInfo[] std = new StudentInfo[temp.length];	// 출력할 학생정보배열. 이름이 같은경우를 위해 배열로 선언
		int choosen =0;
		for(int i = 0; i < std.length; i++) {
			for(int j = choosen; j < temp.length; j++) {
				if(temp[j].getName().equals(_name)) {
					std[i] = temp[j];
					choosen = j+1;
					break;
				}
			}
		}

		printStudent(std);

	}
	// b. 번호입력
	public void viewStudentByNumber(StudentInfo[] temp, int _num) {
		StudentInfo[] std = new StudentInfo[1];
		for(StudentInfo a: temp) {
			if(a.getNo()+1 == _num) {
				std[0] = a;
				break;
			}
		}

		printStudent(std[0]);
	}
}