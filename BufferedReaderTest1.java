// C:/io/io.txt
// 한라인씩 읽어서 콘솔에 출력하는 프로그램
// 입력스트림 : BufferedReader
// 출력스트림 : System.out

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
			System.out.println("끝");
			
		
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