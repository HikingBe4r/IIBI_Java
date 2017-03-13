// data.txt ¿¡ 

import java.io.*;
import java.util.*;

public class DataOutputStreamTest1 {
	public static void main(String[] args) {
		
		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			dos = new DataOutputStream(new FileOutputStream("C:/KSH/io/data.txt"));

			int num = 10;
			boolean flag = false;
			double dNum = 5.5;
			char c = 'a';
			String str = "¿ÀÀü";
		
			dos.writeInt(num);
			dos.writeBoolean(flag);
			dos.writeDouble(dNum);
			dos.writeChar(c);
			dos.writeUTF(str);

			
			dis = new DataInputStream(new FileInputStream("C:/KSH/io/data.txt"));
/*
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
*/
			ArrayList list = new ArrayList();

			list.add(new Integer(dis.readInt()));
			list.add(new Boolean(dis.readBoolean()));
			list.add(new Double(dis.readDouble()));
			list.add(new Character(dis.readChar()));
			list.add(new String(dis.readUTF()));

			for(Object l: list) {
				System.out.println(l);
			}


			
			
			

			



		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
				if(dos != null) dos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}