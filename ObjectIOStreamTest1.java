import java.io.*;

public class ObjectIOStreamTest1{
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("C:/KSH/io/Person.ser"));
			
			oos.writeObject(new Person("�ϱ浿", 10));

			System.out.println("��");

//			byte[] b = new byte[256];

				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
} 