package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

	public static void main(String args[])
	{
		
		ArrayList<Students> list = new ArrayList<Students>();
		list.add(new Students("John", 51));
		list.add(new Students("Tom", 44));
		list.add(new Students("Ron", 73));
		
		System.out.println("Comparable is sorting by id");
		Collections.sort(list);
		for(Students s: list)
			System.out.println(s.getId() +" "+s.getName());
		
		System.out.println("Compare by Name using Comparator");
		Collections.sort(list, new CompareName());
		for(Students s: list)
			System.out.println(s.getId() +" "+s.getName());
		
		
	}
}
