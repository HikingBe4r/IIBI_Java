import java.util.*;

public class LottoTest{
	public static void main(String[] args) {
		Lotto lotto = new Lotto();

		// 로또 번호 생성.
		lotto.createLottoNumbers();
		
		// 번호입력
		Scanner scan = new Scanner(System.in);

		System.out.println("로또번호를 입력하세요.[1 2 3 4 5 6]");
		int[] nums = new int[6];
		for(int i =0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(scan.next());
		}

		// 입력받은 번호 출력
		for(int temp: nums) {
			System.out.printf("%d  ", temp);
		}
		System.out.println();
		
		
		
		// 당첨번호 콘솔 출력
		int[] lottoNum = lotto.getLottoNumbers();
		System.out.println("\n======로또당첨번호=====");
		for (int temp: lottoNum) {
			System.out.printf("%d  ", temp);
		}
		System.out.println();

		// 당첨여부 확인.
		int[] winningNumbers = lotto.getWinningNumbers(nums);

		System.out.println("\n======당첨 확인======");

		switch(winningNumbers.length) {
			case 6:
				System.out.println("1등");
				break;
			case 5:
				System.out.println("2등");
				break;
			case 4:
				System.out.println("3등");
				break;
			case 3:
				System.out.println("4등");
				break;
			default:
				System.out.println("다음주도 출근");
				break;
			
			
		}

	}
}