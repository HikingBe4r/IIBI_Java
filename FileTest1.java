import java.io.*;

public class FileTest1{
	public static void main(String[] args) {
		File file = null;

		try {
			file = new File("test15478");
			

			if(!file.exists()) {
				file.mkdirs();
				System.out.println("���丮����");
				//System.out.printf("%s������ ���������ʽ��ϴ�.\n", file.getName());
				//System.out.printf("���ϰ��: %s\n", file.getPath());
			}
			
			//file.delete();
			//System.out.println("�����Ϸ�");

			//System.out.printf("������ ũ��: %dbytes\n", file.length());
			//System.out.printf("���ϰ��: %s\n", file.getPath());

			file = new File("test15478/io.txt");
			if(file.createNewFile()) {
				System.out.println("�����Ϸ�");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}