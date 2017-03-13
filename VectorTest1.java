import java.util.*;

public class VectorTest1{
	public static void main(String[] args) {
		
		Vector<String> subjects = new Vector<String>();
		
		subjects.addElement("java");
		subjects.addElement("jsp");
		subjects.addElement("oracle");
		subjects.addElement("spring");

		for(int i = 0; i < subjects.size(); i++) {
			System.out.printf("%s\n", subjects.elementAt(i));
		}

		for(String a : subjects) {
			System.out.printf("%s\n", a);
		}

	}
}