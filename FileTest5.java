import java.io.*;
import java.util.*;

public class FileTest5{
	public static void main(String[] args) {
		File file = new File("C:" + File.separator + "KSH");

		File[] files = file.listFiles();


		System.out.println("�̸�\t\t\t\t\t\t������ ��¥\t\t����\t\tũ��");
		System.out.println("====================================================================================================");
		for(File temp : files) {
			String name = temp.getName();
			String date = String.format("%1$tY/%1$tm/%1td", new Date(temp.lastModified()));
			String type = "";
			long fileSize = 0;
			if(temp.isDirectory()) {
				type = "���� ����";
				System.out.printf("%-35s\t|\t%s\t|\t%s\n", name, date, type);
			} else {
				type = "����";
				fileSize = temp.length();
				System.out.printf("%-35s\t|\t%s\t|\t%s\t\t%d\n", name, date, type, fileSize);
			}
		}
	}
}