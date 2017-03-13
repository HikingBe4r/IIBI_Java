import java.util.*;

public class ContactMgr{
						// �̸�, �ּҷ�
	private static HashMap<String, Contact> map = new HashMap<String, Contact>();
	
	// ����ó ���
	public static void registerContact() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸�:\t");		
		String name = sc.nextLine();

		System.out.print("��ȣ:\t");	
		String phone = sc.nextLine();

		System.out.print("����:\t");		
		String email = sc.nextLine();

		Contact contact = new Contact(name, phone, email);

		if(!map.containsKey(name)) {
			map.put(contact.getName(), contact);
		}
		else {
			System.out.println("�ߺ�");
			return;
		}
		
		System.out.println("��ϵǾ����ϴ�.");
	}


	// ��ü ����ó ������ ��ȸ�ϴ�.
	public static void retrieveContacts() {

		if(map.isEmpty()) {
			System.out.println("��ϵ� ������ �����ϴ�");
		} else {

				System.out.printf("�̸�\t��ȣ\t����\n");

			for(Contact c: map.values()) {
				System.out.printf("%s\n", c);
			}
		}
	}

	// ����ó ������ �˻��ϴ�/
	public static void findContact() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �̸�: ");
		String name = sc.nextLine();

		if(map.containsKey(name)) {
			System.out.printf("%s\n", map.get(name));
		} else {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}
	}
	

	// ����ó ������ �����Ѵ�.
	public static void removeContact() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �̸�: ");
		String name = sc.nextLine();

		if(map.containsKey(name)) {
			map.remove(name);
			System.out.println("�����Ͽ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}
	}

	// ����ó ������ �����ϴ�
	public static void modifyContact() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �̸�: ");
		String name = sc.nextLine();

		if(map.containsKey(name)) {
			System.out.print("������ ������ �����ϼ���.\n [1. ��ȣ����, 2. ���Ϻ���, 3. ����] : ");
			int a = Integer.parseInt(sc.nextLine());
			switch (a) {
				case 1:
					// 1. ��ȣ����
					System.out.print("������ ��ȣ: ");
					String phone = sc.nextLine();
					map.replace(name, new Contact(name, phone, map.get(name).getEmail()));
					break;
				case 2:
					// 2. ���Ϻ���
					System.out.print("������ ����: ");
					String email = sc.nextLine();
					map.replace(name, new Contact(name, map.get(name).getPhone(), email));
					break;
				case 3:
					// ����
					return;
				default:
					System.out.println("�ٽ� �Է����ּ���.");
					break;
			}

			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print ("\n====��ȭ��ȣ�� ���α׷�====\n" + 
								 "1. ����ó ���\n"+
								 "2. ����ó �˻�\n"+
								 "3. ����ó ����\n"+
								 "4. ����ó ����\n"+
								 "5. ��ü ����ó ��ȸ\n"+
								 "6. ����\n"+
								 "�޴��� �����ϼ���: ");

			int i = sc.nextInt();

			System.out.println();


			switch (i) {
				case 1:
					// 1. ����ó ���
					registerContact();
					break;
				case 2:
					// 2. ����ó �˻�
					findContact();
					break;
				case 3:
					// 3. ����ó ����
					modifyContact();
					break;
				case 4:
					// 4. ����ó ����
					removeContact();
					break;
				case 5:
					// 5. ��ü ����ó ��ȸ
					retrieveContacts();
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