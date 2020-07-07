package Inheritance;



				/* Inheritance Concept */


public class Employee                  // Parent class
{
	
	float salary = 40000;
	
}

	class Developer extends Employee    // Child class --> Developer
	{
		int bonus = 10000;
	
		public static void main(String[] args) 
		{
			Developer D = new Developer();
			
			System.out.println("Salary of the Developer is "+ D.salary); // Salary inherited from Employee
			System.out.println( " Developer Bonus is "+ D.bonus);
		
	}

}
