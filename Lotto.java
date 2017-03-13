import java.util.*;

public class Lotto{
	// instance Variable
	private int[] lottoNumbers = new int[6];
	

	// ������
	public Lotto() {}
	
	// �ζǹ�ȣ ����
	// ��������6�� ��ȣ ����. �ߺ�üũ
	public void createLottoNumbers() {
		Random ran = new Random();
		boolean isExist = false;

		for(int i = 0; i < lottoNumbers.length; i++) {
			int num = ran.nextInt(45) +1;

			// �ߺ�üũ
			for(int j = 0; j < i; j++) {
				if(num == lottoNumbers[j]) {
					isExist = true;
					break;
				}
			}

			if(isExist) {
				i--;
			} else {
				lottoNumbers[i] = num;
			}
		}
		
	}

	public int[] getLottoNumbers() {
		return lottoNumbers;
	}

	public int[] getWinningNumbers(int[] _nums) {
		int[] winningNumbers = new int[lottoNumbers.length];
		int count = 0;
		for(int i=0; i<lottoNumbers.length; i++) {
			for(int j=0; j<_nums.length; j++) {
				if(lottoNumbers[i] == _nums[j]) {
					winningNumbers[count] = lottoNumbers[i];
					count++;
				}
			}
		}

		int[] temp = new int[count];
		System.arraycopy(winningNumbers, 0,temp, 0, count);
		return temp;
	}

	
	
}