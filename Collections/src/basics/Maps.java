package basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {

	public static void  main(String args[])
	{
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Afshan");
		hmap.put(22, "Jabeen");
		hmap.put(3, "Test");
		
		System.out.println(hmap);
		
		System.out.println("Using KeySet");
		for(int n: hmap.keySet())
			System.out.println(hmap.get(n));
		
		System.out.println("Using Set Iterator");
		Set<Map.Entry<Integer, String>> set = hmap.entrySet();
		Iterator<Map.Entry<Integer, String>> it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> m = it.next();
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		System.out.println("Using For Each");
		for(Map.Entry<Integer, String> m: hmap.entrySet())
			System.out.println(m.getKey() +" "+m.getValue());
		
		System.out.println("Using iterator");
		Iterator<Map.Entry<Integer, String>> itr= hmap.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> m = itr.next();
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		Map<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "Afshan");
		tmap.put(22, "Jabeen");
		tmap.put(3, "Test");
		
		System.out.println(tmap);
		
		System.out.println("Using KeySet for Tree Map");
		for(int n: tmap.keySet())
			System.out.println(tmap.get(n));
		
		Map<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(1, "Afshan");
		lmap.put(22, "Jabeen");
		lmap.put(3, "Test");
		
		System.out.println(lmap);
		
		System.out.println("Using KeySet for LinkedHash Map");
		for(int n: lmap.keySet())
			System.out.println(lmap.get(n));
		
		
	}
}
