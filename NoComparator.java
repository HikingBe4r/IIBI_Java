import java.util.*;

public class NoComparator implements Comparator<Article>{

	// �Խñ� ��ȣ �������� ����
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

	// �Խñ� ���� �������� ����
	public int compare(Article a, Article b) {
		return -a.getContent().compareTo(b.getContent());
	}
}

class WritterComparator implements Comparator<Article> {

	// �Խñ� �ۼ��� �������� ����
	public int compare(Article a, Article b) {
		return a.getWritter().compareTo(b.getWritter());
	}
}