

				//Invoking Constructor using Super-Keyword 
package Keywords;

class Animal
{
   Animal()
	{
		System.out.println("This is Parent class...");		
	}
}

class Dog extends Animal
{
	Dog()
	{
		super();
		System.out.println(" this is Child class...");
	}
}

public class Super2InvokingConstructor {

	public static void main(String[] args) 
	{
		
		@SuppressWarnings("unused")
		Dog d =  new Dog();
	}
}
