// C:/src/a.jpg �� C:/dest/ �� �Űܶ�?
//FileInputStream, FileOutputStream
import java.io.*;

public class FileCopyTest2{
	public static void main(String[] args) {
		
		String fileName = "C:/KSH/dest/c.jpg";
		String destName = "C:/KSH/dest/c2.jpg";

		BufferedInputStream fis = null;
		BufferedOutputStream fos = null;

		try {
			fis = new BufferedInputStream(new FileInputStream(fileName));
			fos = new BufferedOutputStream(new FileOutputStream(destName));

			int fileReader = 0;
			byte[] b = new byte[1];

			while ( (fileReader = fis.read(b)) != -1 ) {
				fos.write(b,0,fileReader);
			}
			fos.flush();
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