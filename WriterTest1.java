// "�ȳ�, �ڹ�" ���ڿ��� C:/KSH/io/io2.txt�� ����.

import java.io.*;

public class WriterTest1{
	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			fw = new FileWriter("C:/KSH/io/io2.txt", true);
			
			String str = "�ȳ�, �ڹ�\n";

			fw.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}