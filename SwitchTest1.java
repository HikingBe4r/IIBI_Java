// Switch~Case¹®

public class SwitchTest1{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		String color = "R";
		switch(color) {
			case "R":
				System.out.println("red");
				break;
			case "G":
				System.out.println("green");
				break;
			case "B":
				System.out.println("blue");
				break;
			case "C":
				System.out.println("cyon");
				break;
			case "M":
				System.out.println("magenta");
				break;
			case "Y":
				System.out.println("yellow");
				break;
			case "K":
				System.out.println("black");
				break;
			default:
				System.out.println("RGB CMYK");
				break;
		}

	}
}
