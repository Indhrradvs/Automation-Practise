

	// Encapsulation using Setter andd Getter Method


package Encapsulation;

public class Student                    
{
	private String name; 
	
	
	//  using Getter MEthod
	
	public String getName()
	{
		return name;
	}
	
	// Using Setter Method
	
	public void setName(String name)
	{
	
		this.name=name;   // Parameterized Constructor
	}
	
}

class Test
{
	
	public static void main(String[] args)
	{
		Student s = new Student();   // creating Object
		s.setName("Frank");
		System.out.println(s.getName());
		
	}
	
}