// 로또. 3개 5등, 4개 4등, 5개 3등, 5+보너스1 2등, 6 1등
// 키보드로 입력받은 수가 당첨이 됐는지 확인.
// 로또 당첨번호는 오름차순 정렬

import java.util.*;

public class Lotto645{
	// main method
	public static void main(String[] args) {
		// 로또 당첨번호 생성
		int[] lotto = new int[7];	// 6 + 보너스
		
		Random r = new Random();
		
		while(true) {
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = r.nextInt(45)+1;
			}
			
			// 중복번호가 뜨면 다시 번호 생성.
			int b = 0;

			for(int i = 0; i < lotto.length; i++) {
				for(int j =i+1; j <i; j++) {
					if(lotto[i] == lotto[j]) {
						b++;
					}
				}				
			}

			if(b == 0) break;
		}

			

		// 당첨번호 오름차순 정렬

		for(int i =0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(lotto[i] < lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		System.out.printf("\t당첨번호\t보너스\n" );

		// 로또 당첨번호 출력
		for( int i = 0 ; i < lotto.length; i++) {
			if(i<6) {
				System.out.printf("%d  ", lotto[i]);
			}
			else
				System.out.printf("\t%d\n", lotto[i]);
		}
		
		// 확인하고싶은 번호 입력
		
		Scanner sc = new Scanner(System.in);
		int[] myNum = new int[6];
		int c = 0;	// 입력한 번호 갯수.
		
		while(true) {
			boolean well = false;	// true일때만 배열에 숫자 입력.

			System.out.printf("%d번째 번호: ",c+1);
			int a = sc.nextInt();

			// 입력받은 수가 1~45사이인지.
			if(a>=1 && a<=45) {
				well = true;

				for(int i = 0; i < myNum.length; i++) {
					if(a == myNum[i]) {
						System.out.println("중복숫자입니다. 다시 입력하세요.");
						well = false;
						break;
					}
				}
			} else {
				System.out.println("1~45사이의 숫자를 입력하세요.");
				continue;
			}

			if(well) {
				myNum[c] = a;
				c++;
			}

			if(c >= 6)
				break;
		}
		
		// 입력한 수 출력
		System.out.println("입력한 번호");
		for( int i = 0 ; i < myNum.length; i++) {
			System.out.printf("%d  ", myNum[i]);
		}


		// 당첨확인
		int count = 0;
		boolean _2nd = false;

		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(myNum[i] == lotto[j]) {
					count++;
				}
			}
			if(myNum[i] == lotto[6]) {
				_2nd = true;
			}
		}
		
		System.out.printf("\n당첨결과: ");
		if(count == 6) {
			System.out.println("1등");
		} else if(count == 5 && _2nd) {
			System.out.println("2등");
		} else if(count == 5) {
			System.out.println("3등");
		} else if(count == 4) {
			System.out.println("4등");
		} else if(count == 3) {
			System.out.println("5등");
		} else {
			System.out.println("기부왕");
		}

		
	}
}