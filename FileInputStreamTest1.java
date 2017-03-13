// C:/KSH/io/io.txt 파일부터 256바이트 단위로 읽어서 콘솔에 출력.

import java.io.*;

public class FileInputStreamTest1{
	public static void main(String[] args) {
		FileInputStream fis = null; 
		try {
			String fileName = "C:/KSH/io/io.txt";
			fis = new FileInputStream(fileName);
			
			byte[] buf = new byte[256];
			
			int readByte = 0;
			
			while ( (readByte = fis.read(buf)) != -1) {
				System.out.write(buf, 0, readByte);
			}
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();	// resource release
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}