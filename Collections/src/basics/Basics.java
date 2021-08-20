package basics;

import java.util.ArrayList;
import java.util.Collection;

public class Basics {
	public static void main(String args[])
	{
		Collection c = new ArrayList();
		c.add(1);
		c.add("Afshan");
		
		for(Object o: c)
			System.out.println(o);
	}
}
