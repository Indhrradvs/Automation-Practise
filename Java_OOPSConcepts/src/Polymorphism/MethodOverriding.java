

package Polymorphism;

class Flight
{
	void fly()
	{
		System.out.println("Ready to Takeoff....");
	}
}

class Airbus extends Flight
{
	void fly()
	{
		System.out.println("Flying at top speed of 500mpH....");
	}

public static class MethodOverriding 
{	
	public static void main(String[] args)
	        {
				Airbus obj = new Airbus();
				obj.fly();
				
			}

	}
}