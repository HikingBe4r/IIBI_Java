
public class EnumTest4{

	public static void main(String[] args) {
		Season1 temp = Season1.WINTER;
		System.out.println(temp.getName());
		System.out.println(temp);

		temp.setName("¤²¤²¤²");
		System.out.println(temp.getName());
	}
}