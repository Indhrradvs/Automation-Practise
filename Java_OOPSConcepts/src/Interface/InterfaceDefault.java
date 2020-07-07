package Interface;

			/* Interface Using DEFAULT keyword */

interface Drawable      	// only one interface is taken 
{
	void draw ();      		//Method 1
	
	default void msg()      //method 2 using Default
	{
		System.out.println("Default Method");
	}
	
}


// Implementation is done here Rectangle --> child class, Drawable --> parent class


class Rectangle implements Drawable  
															
{
	public void draw()                            // implementing Draw method
	{
		System.out.println("Drawing Method ");
	}
	
}

 class InterfaceDefault                      //   Main class
{

	public static void main(String[] args) 
	{
		Drawable d = new Rectangle();           // in drawable class new rectangle object is created
		
		d.draw();                             // calling draw and msg methods
		d.msg();

	}

}
