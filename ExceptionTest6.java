
public class ExceptionTest6{
	public static void main(String[] args) {
		Car src = new Car("����", "���۴�", "ī�ε�", "Į��");

		// ������
		try {
			Car clone = src.clone();

			if(clone != null) {
				clone.setColor("�÷�");
				System.out.printf("src:\t%s\nclone:\t%s\n", src, clone);
			} else if (clone == null) {
				System.out.printf("aaa\n");
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}