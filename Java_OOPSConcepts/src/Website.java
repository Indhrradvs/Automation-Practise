
	/* OOPs USING CLASS */



public class Website 
{
	//Functions or Instance variables
		String webName;
		int     Age; 
	
	//Parameterized Constructor
		
		Website(String name,int age)
		{
			this.webName = name;
			this.Age = age;
		}
		
	
	public static void main(String[] args) 
	{
			//Creating Objects
		
		Website obj1= new Website("Yahoo",5);
		Website obj2= new Website("Google",10);

	
		//Accessing object data through Reference
	
		System.out.println(obj1.webName+" "+obj1.Age);
		System.out.println(obj2.webName+" "+obj2.Age);

	}
}
