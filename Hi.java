public class Hi {

	//main method
	public static void main(String[] args) {
		System.out.println("Hi, java");


				Scanner scan = new Scanner(System.in);
		int dan=0;
		boolean stop = false;
		while(!stop) {
			System.out.print("����� ����Ͻðڽ��ϱ�?  ");
			dan = scan.nextInt();

			for(int i = 2; i <= 3; i++) {
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d%n", i, j, i*j);
				}
				System.out.printf("== i�� ==", i);
			}
			System.out.print("����Ͻðڽ��ϱ� [Y/N]");

	}

}