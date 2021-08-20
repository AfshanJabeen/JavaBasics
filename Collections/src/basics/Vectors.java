package basics;

import java.util.Vector;

public class Vectors {

	public static void main(String args[])
	{
		
		Vector<Integer> v= new Vector<Integer>(); 
		//Constructs an empty vector so that its internal data array has size 10 and its standard capacity increment is zero.

		v.add(8);
		v.add(5);
		
		for(int i: v)
			System.out.println(i);
		
		
	}
}

/*
Vector is type of list which implement list same as array list.
It is dynamic array in which you can increased size of array. vector increased size by 100%.

what is difference between ArrayList and Vector?
Vector   : 1) when exceed array limit it will increased capacity by 100%. It waste lots of memory.
    2) Vector is thread safe.
    3) It is slow.    



*/