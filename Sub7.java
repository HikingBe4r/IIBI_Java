/*	Obj: 
	
*/

//import, Package

public class Sub7{
	public static void main(String[] args) {
		
		int[] num = {8, 3, 4, 9, 7};


		// num[i]�� ó�� ���� �� A
		// num[j]�� ���� �� B
		int count = 0;

		for(int i =0; i < num.length; i++) {
			for(int j = i+1; j <num.length; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}
				
			}			
		}

		System.out.println();
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%d\t", num[i]);
		}
		
		
			


	}
}
