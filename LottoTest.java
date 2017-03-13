import java.util.*;

public class LottoTest{
	public static void main(String[] args) {
		Lotto lotto = new Lotto();

		// �ζ� ��ȣ ����.
		lotto.createLottoNumbers();
		
		// ��ȣ�Է�
		Scanner scan = new Scanner(System.in);

		System.out.println("�ζǹ�ȣ�� �Է��ϼ���.[1 2 3 4 5 6]");
		int[] nums = new int[6];
		for(int i =0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(scan.next());
		}

		// �Է¹��� ��ȣ ���
		for(int temp: nums) {
			System.out.printf("%d  ", temp);
		}
		System.out.println();
		
		
		
		// ��÷��ȣ �ܼ� ���
		int[] lottoNum = lotto.getLottoNumbers();
		System.out.println("\n======�ζǴ�÷��ȣ=====");
		for (int temp: lottoNum) {
			System.out.printf("%d  ", temp);
		}
		System.out.println();

		// ��÷���� Ȯ��.
		int[] winningNumbers = lotto.getWinningNumbers(nums);

		System.out.println("\n======��÷ Ȯ��======");

		switch(winningNumbers.length) {
			case 6:
				System.out.println("1��");
				break;
			case 5:
				System.out.println("2��");
				break;
			case 4:
				System.out.println("3��");
				break;
			case 3:
				System.out.println("4��");
				break;
			default:
				System.out.println("�����ֵ� ���");
				break;
			
			
		}

	}
}