/*
첫째 줄에는 테스트케이스 C가 주어진다.

둘째 줄부터 각 테스트케이스 마다 첫 수로 정수 N(1 <= N <= 1000)명의 학생
이 주어지고 그 다음으로 N명의 0부터 100 사이의 점수가 이어서 주어진다.

출력
각 케이스마다 한줄씩 평균을 넘는 학생들의 비율을 
소수점 넷째자리에서 반올림하여 출력한다.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt(); // testcase
        int[] N = new int[C];
        int sum = 0;
        
        // 점수 입력으로 초기화, 총합구하기.
        for(int i = 0 ; i < N.length; i++) {
			 N[i] = scan.nextInt();
			 scan.nextLine();
             sum += N[i];
        }
        // 총합을 통해 평균 구하기.
        int avg = sum / N.length;
        System.out.printf("%d, %d, %d\n",avg, sum, N.length);
        
        // 평균 넘는아이 찾기
        int overAvg = 0;
        for (int i = 0; i < N.length; i++) {
            if(N[i] > avg) {
                overAvg++;
            }
        }
		//System.out.println(overAvg);
        
        // 평균넘는아이가 몇퍼센트인지 출력.
        System.out.printf("%.3f%%\n", (double) overAvg / N.length * 100);
        
    }
    
}