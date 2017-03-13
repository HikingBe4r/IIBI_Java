import java.util.*;

public class CalendarTest{
	// main method
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) +1;	// 1���� 0���� ����.
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK);
		
		String timeStr = String.format("%1$tY�� %1$tm�� %1$te��", calendar);
		System.out.printf("%s\n", timeStr);
	}
}