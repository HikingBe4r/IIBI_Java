import java.io.*;

public class FileTest1{
	public static void main(String[] args) {
		File file = null;

		try {
			file = new File("test15478");
			

			if(!file.exists()) {
				file.mkdirs();
				System.out.println("디렉토리생성");
				//System.out.printf("%s파일이 존재하지않습니다.\n", file.getName());
				//System.out.printf("파일경로: %s\n", file.getPath());
			}
			
			//file.delete();
			//System.out.println("삭제완료");

			//System.out.printf("파일의 크기: %dbytes\n", file.length());
			//System.out.printf("파일경로: %s\n", file.getPath());

			file = new File("test15478/io.txt");
			if(file.createNewFile()) {
				System.out.println("생성완료");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}