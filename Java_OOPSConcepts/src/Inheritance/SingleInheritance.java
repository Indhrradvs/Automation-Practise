package Inheritance;

/* Single Inheritance */

class Animal // Parent class
{
	void eat() // Method
	{
		System.out.println("Eating...!!");
	}

}

class Dog extends Animal // Dog inherits Animal
{
	void bark() // Method
	{
		System.out.println("Barking...!!");
	}

}

public class SingleInheritance { // Main class

	public static void main(String[] args) {

		Dog D = new Dog(); // New obj created
		D.eat(); // Method calls
		D.bark();

	}

}
