package Examples;
class Marks {
	// These variables are instance variables.
	// These variables are in a class and are not inside any function

	int Engmarks;
	int Mathsmarks;
	int Phymarks;
}

class MarksDemo {
	public static void main(String[] args) {

		// First Object

		Marks obj1 = new Marks();
		obj1.Engmarks = 80;
		obj1.Mathsmarks = 90;
		obj1.Phymarks = 70;

		// Second object

		Marks obj2 = new Marks();
		obj2.Engmarks = 55;
		obj2.Mathsmarks = 88;
		obj2.Phymarks = 65;

		// Third Object
		Marks obj3 = new Marks();
		obj3.Engmarks = 35;
		obj3.Mathsmarks = 40;
		obj3.Phymarks = 40;

		// Displaying Marks for 1st Object

		System.out.println("Marks for First Object");
		System.out.println(obj1.Engmarks);
		System.out.println(obj1.Mathsmarks);
		System.out.println(obj1.Phymarks);

		// Displaying Marks for 2nd Object
		System.out.println("Marks for Second Object");
		System.out.println(obj2.Engmarks);
		System.out.println(obj2.Mathsmarks);
		System.out.println(obj2.Phymarks);

		// Displaying Marks for 3rd Object

		System.out.println("Marks for Third Object");
		System.out.println(obj3.Engmarks);
		System.out.println(obj3.Mathsmarks);
		System.out.println(obj3.Phymarks);

	}

}
