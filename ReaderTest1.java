/*
<io.txt>
abcdefghijklmnopqrstuvwxyz

<�������Ϸ��� 5���� ����>
abcde
fghij
klmno
pqrst
uvwxy
z

<���> - char[20]
abcdefghijklmnopqrst + 
uvwxyzghijklmnopqrst



<�ʱ�ȭ> - char[20]�ε� �ʱ�ȭ�� ������.

abcdefghijklmnopqrst + 
uvwxyz00000000000000 



<no �ʱ�ȭ> char[10]�ε� no�ʱ�ȭ
abcdefghij +
klmnopqrst +
uvwxyzqrst	// �� 30�� ���.

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
			System.out.println("��");


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