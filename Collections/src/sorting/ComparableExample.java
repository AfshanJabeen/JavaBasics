package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String args[])
	{
		
		ArrayList<Students> list = new ArrayList<Students>();
		list.add(new Students("John", 51));
		list.add(new Students("Ron", 73));
		list.add(new Students("Tom", 44));
		
		Collections.sort(list);
		for(Students s: list)
			System.out.println(s.getId() +" "+s.getName());
		
	}
}
