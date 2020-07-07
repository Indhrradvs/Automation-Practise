package Abstraction;

/* ABSTRACTION EXAMPLE */

abstract class Abstraction_Demo {

	abstract void run(); // Abstract Method
}

class Honda extends Abstraction_Demo // Inheritance --> Honda- child class, Abstraction_Demo - Parent class
{

	void run() 
	{
		System.out.println("Running Safely");
	}

	public static void main(String[] args) {

		Abstraction_Demo obj1 = new Honda();
		
		obj1.run();

	}

}
