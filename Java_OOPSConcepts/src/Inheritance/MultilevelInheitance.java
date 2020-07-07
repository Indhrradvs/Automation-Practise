package Inheritance;

			/* Multi Level Inheritance */

class House                                                 // Parent - House
{
	void door()
	{
		System.out.println("Close the Door..!!");
	}
}



class Bedroom extends House                             //  Parent - Bedroom
{
	
	void window()
	{
		System.out.println("Close the windows..!!");
	}
}


class Bathroom extends Bedroom							//child - Bathroom
{		
	void light()
	{
		System.out.println("Turn on Light..!!");
	}

}

public class MultilevelInheitance {

	public static void main(String[] args) 
	{
		Bathroom L = new Bathroom();
		L.door();
		L.window();
		L.light();

	}

}
