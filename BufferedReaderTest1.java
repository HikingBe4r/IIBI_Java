// C:/io/io.txt
// �Ѷ��ξ� �о �ֿܼ� ����ϴ� ���α׷�
// �Է½�Ʈ�� : BufferedReader
// ��½�Ʈ�� : System.out

import java.io.*;

public class BufferedReaderTest1{
	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("C:/KSH/io/io.txt"));
			
			String str = "";

			while (br.readLine() != null) {
				System.out.println(br.readLine());
			}
			System.out.println("��");
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}