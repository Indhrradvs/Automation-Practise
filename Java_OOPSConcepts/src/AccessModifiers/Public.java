package AccessModifiers;

class B
{

	  public int data = 40;  // Public
	public void msg()		// Public
	{
		System.out.println("hello java");
	}
}


public class Public 
{
	public static void main(String args[])
	{
		B obj = new B();
		System.out.println(obj.data);    // A.data is  visible becoz its public
		obj.msg();						// A is visable
	}
	
}

