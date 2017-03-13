public class IndexTest{
	// main method
	public static void main(String[] args) {
		Figurable[] obj = new Figurable[2];

		obj[0] = new Circle(5.5);
		obj[1] = new Rectangle(1.0, 4.5);

		for(Figurable f: obj) {
			f.getCircumference();
		}
	}
}