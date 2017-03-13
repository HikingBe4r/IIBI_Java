public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String str = "Hi,java";
		sb.append(str);
		System.out.println(sb.length()+" "+ sb.capacity());
		sb.append("b");
		System.out.println(sb.length()+" "+ sb.capacity());
		sb.append("a");
		System.out.println(sb.length()+" "+ sb.capacity());
		sb.append('c').append("de");
		System.out.println(sb.length()+" "+ sb.capacity());
		sb.delete(1,4);
		System.out.println(sb.length()+" "+ sb.capacity());
	}
}