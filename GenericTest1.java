
public class GenericTest1{

	public static void main(String[] args) {
		Generic<Integer> instance = new Generic<Integer>();

		//instance.setObj(5); // auto unboxing


		instance.setObj(new Integer(5));


		//System.out.printf("%d\n", instance.getObj()); // auto unboxing


		System.out.printf("%d\n", instance.getObj().intValue());
	}
}