import java.io.*;

public class FileTest2{
	public static void main(String[] args) {
		//String pathName = "C:" + File.separator +"io" + File.separator + "io.txt";
		//System.out.println(pathName);
		try {
			File file = new File(".");	// 상대경로
				
			if(file.exists()) {
				System.out.println(file.length());
			} else {
				System.out.println("1: "+file.getName());
				System.out.println("2: "+file.getPath());				// 경로
				System.out.println("3: "+file.getAbsolutePath());		// 절대경로
				System.out.println("4: "+file.getCanonicalPath());	// 절대경로
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}