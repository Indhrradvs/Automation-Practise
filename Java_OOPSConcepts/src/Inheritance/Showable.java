package Inheritance;


				/*  Multiple Inheritance */

interface Showable    //Interface-1
{

	void show();
	
}


interface Executable  //Interface-2
{
	void execute();
}


// Now 2 interfaces are implementing by A8-class

class A8 implements Showable,Executable
{
	
	public void show()                   // Interface Method-1
	{
		System.out.println("Welcome");
	}
	
	public void execute()				//Interface Method 2
	{
		System.out.println("Hello");
	}
	
	
	// Main method starting from here 
	
	public static void main(String[] args)
	{
		A8 obj = new A8();
		obj.show();
		obj.execute();
	}

}

