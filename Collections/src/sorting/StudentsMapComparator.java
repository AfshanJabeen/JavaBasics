package sorting;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentsMapComparator implements Comparator<Map.Entry<Integer, Students>>{

	@Override
	public int compare(Entry<Integer, Students> o1, Entry<Integer, Students> o2) {
		return o1.getValue().getId()-o2.getValue().getId();
	}
	

}
