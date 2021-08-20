package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
	
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		// an empty list with an initial capacity of ten.(if we go beyond 10 elements ar[10], it will increase capacity by 50%)
//Dynamic array implementation
		
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

	/*
	 * ArrayList : 1) when exceed array limit it will increased capacity by 50%. It save memory.
    2) ArrayList is not thread safe.
    3) It is fast. 
	 */
}
