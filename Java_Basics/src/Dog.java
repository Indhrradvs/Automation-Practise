public class Dog
{
	
	public Dog(String name) 
	{
		/* the constructor has one parameter, NAME */ 
		System.out.println("Name of a dog is: "+name);
	}
	
	public static void main(String []args) 
	{
		/* following statement would create an object myDOG*/

		@SuppressWarnings("unused")
		Dog myDog = new Dog("CAESAR");
	}
	
}