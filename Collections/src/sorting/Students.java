package sorting;

public class Students implements Comparable<Students>{

	private String name;
	private int id;
	
	
	public Students(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

@Override
	public String toString()
	{
		return " ["+this.getName()+" "+this.getId()+"]";
	}

	@Override
	public int compareTo(Students s) { 
	
		return this.getId()-s.getId();
	}
	
	//Comparable provides a single sorting sequence. 
	//In other words, we can sort the collection on the basis of a single element such as id, name, and price.
	//Comparable affects the original class, i.e., the actual class is modified.
	//compares current object(this) with other object
}
