package basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String args[])
	{
		// Same as list but doesn't allow duplicates
		Set<Integer> hset= new HashSet<Integer>(); // doesn't maintain insertion order
	
		hset.add(8);
		hset.add(3);
		hset.add(7);
		hset.add(3);
		
		System.out.println(hset.add(2)); //true
		System.out.println(hset.add(2)); // false
		
		for(int n: hset)
			System.out.println(n);
		
		Set<Integer> tset= new TreeSet<Integer>(); // sorts in ascending order
		
		tset.add(8);
		tset.add(3);
		tset.add(7);
		tset.add(3);
		
		System.out.println(tset.add(2)); //true
		System.out.println(tset.add(2)); // false
		
		for(int n: tset)
			System.out.println(n);
		
Set<Integer> lset= new LinkedHashSet<Integer>(); // maintain insertion order
		
		lset.add(8);
		lset.add(3);
		lset.add(7);
		lset.add(3);
		
		System.out.println(lset.add(2)); //true
		System.out.println(lset.add(2)); // false
		
		for(int n: lset)
			System.out.println(n);
		
		
		
	}
}
