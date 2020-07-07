

			// Method Overloading by- Change of Arguments

package Polymorphism;

class Addition
{
	static int add(int a,int b) /* we Cannot make a static reference to the non-static method add(int, int) 
	                              from the type Addition*/
	{
		return a+b;
	}
	
	static int add(int a, int b, int c)
	{
		return a+b+c;	
	}
}

public class MethodOverloading {

	public static void main(String[] args) 
	{
	
		System.out.println(Addition.add(10,10));
		System.out.println(Addition.add(20,20));
	}

}
