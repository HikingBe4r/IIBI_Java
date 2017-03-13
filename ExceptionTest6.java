
public class ExceptionTest6{
	public static void main(String[] args) {
		Car src = new Car("네임", "컴퍼니", "카인드", "칼라");

		// 복제본
		try {
			Car clone = src.clone();

			if(clone != null) {
				clone.setColor("컬러");
				System.out.printf("src:\t%s\nclone:\t%s\n", src, clone);
			} else if (clone == null) {
				System.out.printf("aaa\n");
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}