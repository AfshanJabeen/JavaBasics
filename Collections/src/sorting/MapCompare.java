package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapCompare {

	public static void main(String args[])
	{
		HashMap<Integer, Students> hmap = new HashMap<Integer, Students>();
		
		hmap.put(1, new Students("John", 51));
		hmap.put(8, new Students("Tom", 44));
		hmap.put(5, new Students("Ron", 73));
	
		for(Map.Entry<Integer, Students> m: hmap.entrySet())
			System.out.println(m.getKey() +" "+m.getValue().toString());
		
		
		ArrayList<Map.Entry<Integer, Students>> list = new ArrayList<Map.Entry<Integer, Students>>();
		for(Map.Entry<Integer, Students> m: hmap.entrySet())
		{
			list.add(m);
		}
		
		System.out.println("Map Value sort by Student Id");
	Collections.sort(list, new StudentsMapComparator());
		
	for(Map.Entry<Integer, Students> s: list )
	{
		System.out.println(s.getKey() +" "+s.getValue().toString());
	}
		
	}
}
