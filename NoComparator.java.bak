import java.util.*;

public class NoComparator implements Comparator<Article>{

	// 게시글 번호 내림차순 정리
	public int compare(Article a, Article b) {
		
		if(a.getNo() > b.getNo()) {
			return -1;
		} else if(a.getNo() < b.getNo()) {
			return 1;
		} else {
			return 0;
		}
	}
}

class ContentComparator implements Comparator<Article>{

	// 게시글 내용 내림차순 정렬
	public int compare(Article a, Article b) {
		return -a.getContent().compareTo(b.getContent());
	}
}

class WritterComparator implements Comparator<Article> {

	// 게시글 작성자 오름차순 정렬
	public int compare(Article a, Article b) {
		return a.getWritter().compareTo(b.getWritter());
	}
}