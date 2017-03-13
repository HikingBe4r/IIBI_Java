/*	Obj: �л� �������� �ý��� ��ɺκ�.
	
	1. �л��������	

		public static StudentInfo[] AddStudent(StudentInfo[] temp)

	2. ��ȣ�� �л����� ��ȸ
		public static void viewStudentsByNumber (StudentInfo[] temp)

	3. ������ ��ü �л����� ��ȸ
		public static void viewByRank (StudentInfo[] temp)

	4. ���κ� �л����� ��ȸ(�̸�or��ȣ �Է�)
		a. �̸�
			public static void viewStudentByName(StudentInfo[] temp)
		b. ��ȣ
			public static void viewStudentByNumber(StudentInfo[] temp)
	
+	��ȸ�Ҷ� Ʋ		public static void printCase()
	�л���ȸ �ݺ�	public static void printStudent(StudentInfo[] temp)
	�����ű��		public static void determineRanking (StudentInfo[] temp)

	�޴����ñ�		setMenu();
	�л��������	printStudent(StudentInfo... temp)
*/

import java.util.Scanner;

public class Operations {

	public StudentInfo[] student = new StudentInfo[2];

	// �޴����ñ�
	public void setMenu() {
		Scanner sc = new Scanner(System.in);
      while(true) {
		 System.out.println("=====�л� �������� �ý���=====");
         System.out.println("1. �л� ���� ���");
         System.out.println("2. ��ȣ�� ��ü �л� ���� ��ȸ");
         System.out.println("3. ������ ��ü �л� ���� ��ȸ");
         System.out.println("4. ���κ� �л� ���� ��ȸ");
         System.out.println("   - �̸�");
         System.out.println("   - ��ȣ");
         System.out.println("5. ����");
         System.out.print("�޴��� �����ϼ���[1-5] : ");
         int i = sc.nextInt();
         System.out.println();

         switch(i) {
            case 1:
               //1. ���
				student = AddStudent(student);
               break;
            case 2:
               // 2. ��ȣ�� ��ȸ
				viewStudentsByNumber(student);
               break;
            case 3:
               // 3. ������ ��ȸ
				viewByRank(student);
               break;
            case 4:
               // 4. ���κ� ����(�̸� or ��ȣ�� ��ȸ)
				chooseView(student);
               break;
            case 5:
               // 5. ����
               System.out.println("���α׷��� �����մϴ�.");
               return ;
            default:
               System.out.println("1~5 ������ ��ȣ�� �Է��ϼ���.");
               System.out.println();
               break;
         }
      }
	}	// end setMenu

	// 0. ���ְ� ��ȸ�ϱ�.
	public void printCase() {
		System.out.printf("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����\n");
		System.out.printf("=============================================================\n");
	} // end printCase
	
	// �л����� ���1: �迭 ��� 
	public void printStudent(StudentInfo... temp) {
		printCase();
		for(StudentInfo i: temp) {
			if(i != null) {
				System.out.printf("%d\t", i.getNo()+1);			// ��ȣ
				System.out.printf("%s\t", i.getName());			// �̸�
				System.out.printf("%d\t", i.getKorScore());		// ����
				System.out.printf("%d\t", i.getEngScore());		// ����
				System.out.printf("%d\t", i.getMathScore());	// ����
				System.out.printf("%d\t", i.getToTal());		// ����
				System.out.printf("%.2f\t", i.getAverage());	// ���
				System.out.printf("%d\n", i.getRank());			//���� ���
			} else {
				break;
			}
		}
		System.out.println();	// ������� ����
	} // end printStudent

	// �迭 ũ�� ������Ű��.
	public StudentInfo[] expandArray(StudentInfo[] temp) {
		
		StudentInfo[] expand = new StudentInfo[temp.length+1];
		for(int i = 0; i < temp.length; i++) {
				expand[i] = temp[i];
		}
		return expand;
	}

	// 1. �л� ���
	// StudentInfo[]�� ���� �������׿� ++ ���Ѽ� �߰���Ų��.
	// **StudentInfo[]�� ũ�Ⱑ 1�϶� �Ǵµ� ó������ ũ�� ������������...?
	public StudentInfo[] AddStudent(StudentInfo[] temp) {
		// ������: String name, int korScore, int engScore, int mathScore

		// ����� �л����� �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸�: ");
		String _name = scan.nextLine();
		System.out.print("��������: ");
		int _korScore = scan.nextInt();
		System.out.print("��������: ");
		int _engScore = scan.nextInt();
		System.out.print("��������: ");
		int _mathScore = scan.nextInt();
		System.out.println();
		StudentInfo std = new StudentInfo(_name, _korScore, _engScore, _mathScore);
		
		// StudentInfo[]�� ũ�Ⱑ 1�϶� �Ǵµ� ó������ ũ�� ������������...?
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

	// 2. ��ȣ����ȸ method
	// StudentInfo[] �� �׳� ������ ��.
	public void viewStudentsByNumber (StudentInfo[] temp) {
		if(temp[0] == null) {
			System.out.println("�л��� ����ϼ���.\n");
		} else {
			printStudent(temp);
		}
		/*
		for(StudentInfo i: temp) {
			if(i == null) {
				System.out.println("�л��� ������ּ���.");
				System.out.println();
				break;
			} else if(i != null) {
				System.out.printf("%d\t", i.getNo());			// ��ȣ
				System.out.printf("%s\t", i.getName());			// �̸�
				System.out.printf("%d\t", i.getKorScore());		// ����
				System.out.printf("%d\t", i.getEngScore());		// ����
				System.out.printf("%d\t", i.getMathScore());	// ����
				System.out.printf("%d\t", i.getToTal());		// ����
				System.out.printf("%.2f\t", i.getAverage());	// ���
				System.out.printf("%d\n", i.getRank());			//���� ���
				//System.out.println();
			}
		}
		*/
		
	} // end viewStudentByNumber

	// 3. ������ ��ü �л����� ��ȸ
	// �л���϶� rank�� �Է½�Ű��, ��ũ�� ������ ���.
	// bug: 1233367 �϶� 3�� ù��°���� ����.
	public void viewByRank (StudentInfo[] temp) {

		// rank�� ������ ������ rank���� null�� �Ǵ� ����
		// -> rank�� ������ ��ȣ������ ���. �ؾ��Ѵ�.
		if(temp[0] == null) {
			System.out.println("�л��� ����ϼ���.\n");
		} else {
			printStudent(sortByRank(temp));
		}
		/*
		for(StudentInfo i: sortByRank(temp)) {
			if(i == null) {
				System.out.println("�л��� ������ּ���.");
				System.out.println();
				break;
			} else if(i != null) {
				System.out.printf("%d\t", i.getNo());			// ��ȣ
				System.out.printf("%s\t", i.getName());			// �̸�
				System.out.printf("%d\t", i.getKorScore());		// ����
				System.out.printf("%d\t", i.getEngScore());		// ����
				System.out.printf("%d\t", i.getMathScore());	// ����
				System.out.printf("%d\t", i.getToTal());		// ����
				System.out.printf("%.2f\t", i.getAverage());	// ���
				System.out.printf("%d\n", i.getRank());			//���� ���
			}
		}
		*/
	} // end viewByRank

	// ���� ����
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
	
	// * ���� �ű��
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

	// 4. ���κ� �л� ���� ��ȸ
	public void chooseView(StudentInfo[] temp) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. �̸��˻�\t2.��ȣ�˻�: ");
		int a = Integer.parseInt(sc.nextLine());
		
		switch(a) {
			case 1:
				System.out.print("\n�˻��� �̸�: ");
				String _name = sc.nextLine();
				viewStudentByName(temp, _name);
				break;
			case 2:
				System.out.print("�˻��� ��ȣ: ");
				int _num = sc.nextInt();
				viewStudentByNumber(temp, _num);
				break;
			default:
				System.out.println("�߸� �Է��߽��ϴ�..");
				break;
		}

	}
	// a. �̸��Է�
	public void viewStudentByName(StudentInfo[] temp, String _name) {
		StudentInfo[] std = new StudentInfo[temp.length];	// ����� �л������迭. �̸��� ������츦 ���� �迭�� ����
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
	// b. ��ȣ�Է�
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