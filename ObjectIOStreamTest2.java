import java.io.*;

public class ObjectIOStreamTest2{
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("C:/KSH/io/Person.ser"));

			Person obj = (Person)ois.readObject();
			
			System.out.println(obj);
			

			System.out.println("³¡");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}