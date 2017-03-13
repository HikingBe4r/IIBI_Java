// 키보드로 한라인씩 읽어서 콘솔에 출력하시오.
// Scanner쓰지말고.

// 입력: BufferedReader, System.in - InputStream --> InputStreamReader 를 쓰면된다.
// 출력: 

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