// "Hello Java"를 io2.txt에 쓰고싶다. byte기반.

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