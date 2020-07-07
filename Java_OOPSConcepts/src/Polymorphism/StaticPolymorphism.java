
                     /* Static/Compile time polymorphism 
		
						Definition: Same method name  but different parameters */
																				

package Polymorphism;

class SimpleCalculator                       
{
	int add(int a, int b)                    // Same method name "Add" but different parameters
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

public class StaticPolymorphism {

	public static void main(String[] args) 
	{
	
		SimpleCalculator obj = new SimpleCalculator();
		
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20,20));     

	}

}
