package Interface;
			
			/* Interface using STATIC */

interface Calculation                  //Interface-1
{
	void math();
	
	static int cube(int x)			// method using Static
	{
		return x*x*x;
		
	}
	
}

class Multiplication implements Calculation
{
	public void math()
	{
		
		System.out.println("Welcome to Maths");
	}
	
}

//Main class starting From here

public class InterfaceStatic 
{

	public static void main(String[] args) 
	{

		Calculation c = new Multiplication();
		c.math();
		System.out.println(Calculation.cube(2));
		
	}

}
