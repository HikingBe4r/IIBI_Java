// C:/src/a.jpg �� C:/dest/ �� �Űܶ�?
//FileInputStream, FileOutputStream
import java.io.*;

public class FileCopyTest1{
	public static void main(String[] args) {
		
		String fileName = "C:/KSH/dest/c.jpg";
		String destName = "C:/KSH/dest/c4.jpg";

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream(destName, true);

			int fileReader = 0;
			byte[] b = new byte[1024];

			while ( (fileReader = fis.read(b, 0, b.length)) != -1 ) {
				fos.write(b,0,fileReader);
			}

			System.out.println("���Ϻ��� �Ϸ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// resource release
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}