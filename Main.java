/*
ù° �ٿ��� �׽�Ʈ���̽� C�� �־�����.

��° �ٺ��� �� �׽�Ʈ���̽� ���� ù ���� ���� N(1 <= N <= 1000)���� �л�
�� �־����� �� �������� N���� 0���� 100 ������ ������ �̾ �־�����.

���
�� ���̽����� ���پ� ����� �Ѵ� �л����� ������ 
�Ҽ��� ��°�ڸ����� �ݿø��Ͽ� ����Ѵ�.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt(); // testcase
        int[] N = new int[C];
        int sum = 0;
        
        // ���� �Է����� �ʱ�ȭ, ���ձ��ϱ�.
        for(int i = 0 ; i < N.length; i++) {
			 N[i] = scan.nextInt();
			 scan.nextLine();
             sum += N[i];
        }
        // ������ ���� ��� ���ϱ�.
        int avg = sum / N.length;
        System.out.printf("%d, %d, %d\n",avg, sum, N.length);
        
        // ��� �Ѵ¾��� ã��
        int overAvg = 0;
        for (int i = 0; i < N.length; i++) {
            if(N[i] > avg) {
                overAvg++;
            }
        }
		//System.out.println(overAvg);
        
        // ��ճѴ¾��̰� ���ۼ�Ʈ���� ���.
        System.out.printf("%.3f%%\n", (double) overAvg / N.length * 100);
        
    }
    
}