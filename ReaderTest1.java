/*
<io.txt>
abcdefghijklmnopqrstuvwxyz

<보기편하려고 5개씩 끊음>
abcde
fghij
klmno
pqrst
uvwxy
z

<출력> - char[20]
abcdefghijklmnopqrst + 
uvwxyzghijklmnopqrst



<초기화> - char[20]인데 초기화를 시켜줌.

abcdefghijklmnopqrst + 
uvwxyz00000000000000 



<no 초기화> char[10]인데 no초기화
abcdefghij +
klmnopqrst +
uvwxyzqrst	// 총 30개 출력.

*/

import java.io.*;

public class ReaderTest1{
	public static void main(String[] args) {
		FileReader fr = null;		
		try {
			fr = new FileReader("C:/KSH/io/io.txt");
			
			char[] c = new char[10];
			int readIndex = 0;
			while ((readIndex = fr.read(c)) != -1) {
				System.out.println(new String(c,0,readIndex));
				
			}
			System.out.println("끝");


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}