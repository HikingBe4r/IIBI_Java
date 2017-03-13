import java.util.*;

public class NameComparator implements Comparator<Car>{
	public int compare(Car a, Car b) {
		return a.getName().compareTo(b.getName());
	}
}