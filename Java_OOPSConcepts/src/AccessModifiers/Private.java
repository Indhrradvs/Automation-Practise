package AccessModifiers;

class A
{

	   public int data = 40;  // Public
	   public void msg()	  // Public 
	{
		System.out.println("hello java");
	}
}


public class Private 
{
	public static void main(String args[])
	{
		A obj = new A();
		System.out.println(obj.data);    // A.data is not visible because its private
		obj.msg();						// A is not visible
	}
	
}



// Due to public  you  get output, to check  "Private" change public to private in Class A
