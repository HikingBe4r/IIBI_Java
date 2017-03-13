
public class arrayTest13{
	// class variable  (static variable)


	// instance Variable


	// main method
	public static void main(String[] args) {
		
		// local Variable
		int[] array = {1, 2, 3, 4, 5};
		System.out.printf("main. array: %s\n", array);
		printArray(array);

		int[] array2 = {5,6,7};
		System.out.printf("main. array2: %s\n", array2);
		printArray2(array2);
	}

	public static void printArray(int[] _arr) {
		System.out.printf("print. arr: %s\n", _arr);
		for(int i = 0; i < _arr.length; i++) {
			System.out.printf("%d¹ø: %d\n", i, _arr[i]);
		}
	}

	public static void printArray2(int[] _arr) {
		System.out.printf("print. arr: %s\n", _arr);
		for(int i: _arr) {
			System.out.printf("%d\n", i);
		}
	}
}