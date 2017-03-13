import java.util.*;


public class CarNameComparator implements Comparator<Car>{
	public int compare(Car obj1, Car obj2) {
		return obj1.getName().compareTo(obj2.getName());
	}
}