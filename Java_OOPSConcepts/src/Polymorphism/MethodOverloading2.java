

// Method Over loading - Change of DATA TYPE arguments


package Polymorphism;

// 2 different Data types are taken Int and Double
class Adding
{
	static int add (int a,int b)
	{
		return a+b;
	}
	
	static double add(double a, double b)
	{
		return a+b;
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) 
	{
		
		System.out.println(Adding.add(5, 5));
		System.out.println(Adding.add(1.5,2.0));
		
	}

}
