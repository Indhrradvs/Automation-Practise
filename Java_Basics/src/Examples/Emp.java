package Examples;
public class Emp 
{

	// Static variable is SALARY
	public static double salary;
	public static String Name ="VENKAT";
}	
class EmpDemo
	{
		public static void main(String[] args) 
		{
		
				//Accessing Static Variable without object
			Emp.salary=1000;
			System.out.println(Emp.Name+"'s Avearge salary"+Emp.salary);
		}

	}
