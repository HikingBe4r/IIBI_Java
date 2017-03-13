// "Hello Java"�� io2.txt�� ����ʹ�. byte���.

import java.io.*;

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		
		String fileName = "C:/KSH/io/io3.txt";
		FileOutputStream fos = null;

		String desc = "Hello, Java\n";
		
		try {
			fos = new FileOutputStream(fileName, true);

			byte[] buf = desc.getBytes();

			fos.write(buf);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}