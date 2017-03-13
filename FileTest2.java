import java.io.*;

public class FileTest2{
	public static void main(String[] args) {
		//String pathName = "C:" + File.separator +"io" + File.separator + "io.txt";
		//System.out.println(pathName);
		try {
			File file = new File(".");	// �����
				
			if(file.exists()) {
				System.out.println(file.length());
			} else {
				System.out.println("1: "+file.getName());
				System.out.println("2: "+file.getPath());				// ���
				System.out.println("3: "+file.getAbsolutePath());		// ������
				System.out.println("4: "+file.getCanonicalPath());	// ������
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}