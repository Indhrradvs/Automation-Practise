package Inheritance;


				/* Hierarchical Inheritance */


class Car
{
	void steering()
	{
		System.out.println("Turn Right..>>>>");
	}
}

class Wheels extends Car
{
	void tires()
	{
		System.out.println(" Set a Tire pressure at 32psi...");
	}
	
}

class Lights extends Car
{
	
	void xenon()
	{
		System.out.println(" Turn Headlights ON...");
	}
	
}


public class HeirachicalInheritance 
{
	public static void main(String[] args) 
	{
	   Lights X = new Lights();
	   
	   X.steering();
	   //X.tires();  
	   X.xenon();
		
	}

}
