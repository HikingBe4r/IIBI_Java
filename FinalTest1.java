interface Season {
	public static final int SPRING = 1;
	public static final int SUMMER = 2;
	public static final int FALL = 3;
	public static final int WINTER = 4;
}
public class FinalTest1{

	static final int a = 10;
	final static int b = 10;

	public static void main(String[] args) {
		final int num = 5;

		System.out.printf("a: %d, b: %d\n", a, b);
		
	}
}