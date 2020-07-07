package Examples;

public class StudentDetails 
{
    public void studentAge()   // creating studentAge method
    {
    	// Local Variables
    	
    	String name="krishna";
    	int age=10;
    	age=age+5;
    	System.out.println("The student Name and Age is :" +name +age);
    	
    }
	
	public static void main(String[] args) 
	{	
		StudentDetails obj=new StudentDetails();
		obj.studentAge();
		
	}

}
