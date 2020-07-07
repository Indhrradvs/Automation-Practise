
// Run time poly morphism example-2 

package Polymorphism;

class Animal // Animal - Parent class
{
	void eat() {
		System.out.println("Eating....");
	}
}

class Dog extends Animal // child class -1
{
	void eat() // Method over riding
	{
		System.out.println("Dog eats Bread...");
	}

}

class Cat extends Animal // child class-2
{
	void eat() // Method over riding
	{
		System.out.println("Cat eats Rats...");
	}
}

class Lion extends Animal // child class-3
{
	void eat() // Method over riding
	{
		System.out.println("Lion eats Meat...");
	}
}

public class TestRuntimePoly {

	public static void main(String[] args) {
		Animal a; // variable name - a

		a = new Dog(); // Animal = dog
		a.eat(); // so calling Dog's eat() method

		a = new Cat();
		a.eat();

		a = new Lion();
		a.eat();

	}

}
