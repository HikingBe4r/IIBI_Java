import java.io.*;

public class InputStreamTest1{
	public static void main(String[] args) {

		try {
			InputStream input = System.in;

			int readByte = 0;
			while((readByte = input.read()) != -1) {
				System.out.println("readByte: "+ readByte);

				// a�Է��ϸ� a ���.
				char c = (char)readByte;
				System.out.println("char: "+ c);

				// --
				System.out.write(readByte);
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}