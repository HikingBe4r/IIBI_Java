// Ű����� �Ѷ��ξ� �о �ֿܼ� ����Ͻÿ�.
// Scanner��������.

// �Է�: BufferedReader, System.in - InputStream --> InputStreamReader �� ����ȴ�.
// ���: 

import java.io.*;

public class IOStreamTest1 {
	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			String str = null;

			while((str = br.readLine()) != null) {
				if(str.equals("q")) break;

				System.out.println(str);
			}

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