import java.io.*;

public class BufferedIOStreamTest1{
	public static void main(String[] args) {
		
		BufferedOutputStream bos = null;

		try {
			bos = new BufferedOutputStream(new FileOutputStream("C:/KSH/dest/bio.txt"), 1000);

			String str = "Hello, Java";
			byte[] b = str.getBytes();

			bos.write(b, 0, b.length);

			System.out.println("²ý");
			bos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// resource release
//				if(bos != null) bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}