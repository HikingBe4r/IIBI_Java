/*	Obj: 
	
*/
public class ArticleTest1{
	// main method
	public static void main(String[] args) {
		// local Variable

		Article article1 = new Article();
		Article article2 = new Article("����", "������", "�賻��");
		Article article3 = new Article("�ѵѵ�", "������", "�ѳ���");

		System.out.println(article1.getArticleInfo());
		System.out.println(article3.getArticleInfo());
		System.out.println(article2.getArticleInfo());
	}
}