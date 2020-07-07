

					/* Runtime Polymorphism/Dynamic Method Dispach */ 


package Polymorphism;

class Car                                       // Parent class
{
	void run()
	{
		System.out.println("Running..!!");
	}
}


public class Swift  extends Car              // Swift class --> child class
{
	void run()     // Over riding Run method in Car class
	{
		System.out.println("Top speed 125Km/h");
	}
	
	public static void main(String[] args)
	{
		Car c = new Swift(); // upcasting      //   Creating an object in child class using Parent class
		c.run();      // Calling Run Method by reference variable of parent class
	}
}

