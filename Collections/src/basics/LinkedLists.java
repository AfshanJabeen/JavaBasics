package basics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		// Constructs an empty list.
//implements doubly linked list
		

		list.add(9);
		list.add(3);
		list.add(1, 2);
		
		Iterator<Integer> it= list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		for(int i: list)
			System.out.println(i);
	}

}
