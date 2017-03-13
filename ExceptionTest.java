

public class ExceptionTest{
	// main method
	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5};
		/*
		try {
			for(int i = 0; i <= nums.length; i++) {
				System.out.printf("%d\n", nums[i]);	//throw new ArrayIndexOutOfBoundsException()
			}
		} catch(ArrayIndexOutOfBoundsException ex) {
			//System.out.printf("Error: %s\n", ex.getMessage());
			ex.printStackTrace();
		}
		*/

		for(int i = 0; i <= nums.length; i++) {
			try {
				System.out.printf("%d\n", nums[i]);	//throw new ArrayIndexOutOfBoundsException()

			} catch(Exception e) {
				e.printStackTrace();
			}
		} 
				
			
		System.out.println("End!");

	}
}