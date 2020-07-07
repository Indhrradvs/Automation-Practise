
public class VariableExample 
{
	
	//INSTANCE VARIABLE
	
	public String Instancevar ="INSTANCE VARIABLE"; 
		
	
	public void myMethod()
	
	// Local Variable
	
	{
		String Instancevar ="INSIDE METHOD";
		
		System.out.println(Instancevar);
	}
	
	
	public static void main(String[] args) 
	{
		
		// Creating Object 
		
		VariableExample obj = new VariableExample();
		
		/*
		   We are calling the method, that changes the 
	       value of Instancevar. 
	       We are displaying Instancevar again after 
	       the method call, to demonstrate that the local 
	       variable scope is limited to the method itself.
	     
	     */
		
		
		System.out.println("CALLING METHOD");
		
		obj.myMethod();  // calling the METHOD
	
		System.out.println(obj.Instancevar);
		
	}

}
