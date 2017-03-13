// InputStream.read(,,);
// C:/KSH/io/io.txt 파일부터 512바이트 단위로 읽어서 콘솔에 출력.


import java.io.*;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;

		try {
			String fileName = "C:/KSH/io/io2.txt";
			fis = new FileInputStream(fileName);

			byte[] b = new byte[512];
			int readByte = 0;
			
			//int max = fis.read(b);
			//System.out.println("max: "+max);

			while ((readByte = fis.read(b, 0, b.length)) != -1) {
				System.out.write(b, 0, readByte);
			}
			//System.out.println("readByte: "+ readByte);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


	}
}