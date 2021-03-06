// C:/KSH/src/io.txt
// C:/KSH/dest/io5.txt
// 한 라인씩 복사.
// 입력: FileReader, BufferedReader
// 출력: FileWriter-> PrintWriter

import java.io.*;

public class CopyTest4{
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("C:/KSH/src/io.txt"));
			pw = new PrintWriter(new FileWriter("C:/KSH/dest/io5.txt"));
			String str = null;
			while ((str = br.readLine()) != null) {
				pw.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}