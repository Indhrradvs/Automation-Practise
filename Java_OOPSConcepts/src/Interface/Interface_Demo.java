package Interface;
/* INTERFACE Example */

interface Interface_Demo {
	void print();

}

// Interface Implementation is done in A6 class

class A6 implements Interface_Demo {
	public void print() // interface Method implementation is done here
	{
		System.out.println("Hello");
	}

	public static void main(String args[]) // Main method
	{

		A6 obj = new A6(); // New object is created in A6-class
		obj.print(); // Object is calling Print method

	}
}