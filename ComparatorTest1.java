import java.util.*;

public class ComparatorTest1{
	public static void main(String[] args) {
		
		LinkedList<Article> list = new LinkedList<Article>();
		list.add(new Article("ㄱ", "a", "4", "비밀번호"));
		list.add(new Article("ㄷ", "d", "3", "비밀번호"));
		list.add(new Article("ㄹ", "b", "2", "비밀번호"));
		list.add(new Article("ㅁ", "c", "5", "비밀번호"));
		list.add(new Article("ㄴ", "e", "1", "비밀번호"));

		for(Article a: list) {
			System.out.println(a);
		}

		System.out.println();
		
		//게시글 번호 내림차순 정렬
		Collections.sort(list, new NoComparator());

		for(Article a: list) {
			System.out.println(a);
		}

		System.out.println();

		//게시글 내용 내림차순 정렬
		Collections.sort(list, new ContentComparator());

		for(Article a: list) {
			System.out.println(a);
		}
		System.out.println();

		//게시글 작성자 내림차순 정렬
							       
		Collections.sort(list, new WritterComparator());

		for(Article a: list) {
			System.out.println(a);
		} 
	}
}