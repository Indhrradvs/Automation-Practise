package Abstraction;

/* Using 2 constructor Methods*/


public class ConstructorExamples {

		// Fields (instance Variables)
	
		String Name;
		 int   Age;
		 
		//Default Constructor
		
		ConstructorExamples()
		{
			this.Name="Frank";
			this.Age=25;
		}
	
		//Parameterized Constructor
		
		ConstructorExamples(String n,int a)
		{
			this.Name = n;
			this.Age =  a;
		}
	
			
public static void main(String[] args) 
	{
	
	 ConstructorExamples obj1 = new ConstructorExamples();
	 ConstructorExamples obj2 = new ConstructorExamples("JASON",30);
	 
	 System.out.println(obj1.Name+" "+obj1.Age);
	 System.out.println(obj2.Name+" "+obj2.Age);

	}

}
