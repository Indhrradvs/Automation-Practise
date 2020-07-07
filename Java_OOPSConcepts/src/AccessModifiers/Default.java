package AccessModifiers;

class C
{

	 int data = 40;  // Default
	 void msg()		// Default
	{
		System.out.println("hello java");
	}
}


public class Default
{
	public static void main(String args[])
	{
		C obj = new C();
		System.out.println(obj.data);    // C.data is  visible because its Default
		obj.msg();						// C is Default
	}
	
}

