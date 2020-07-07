
public class StaticVarExample 
{
	
	public static String myclassvar = "Class of Static Variable"; 
	
	/* String --> Data type
	 * myclassvar --> name of variable
	 * class of static variable --> value
	 */
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		
		// Creating 3 objects 
	
		StaticVarExample obj = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		StaticVarExample obj3 = new StaticVarExample();
		
		//Displaying all 3 objects
		
		System.out.println(obj.myclassvar);
		System.out.println(obj2.myclassvar);
		System.out.println(obj3.myclassvar);
		
		// Changing the value for obj2
		
		obj2.myclassvar="changed text";
		
		// All 3 will display same text

		System.out.println(obj.myclassvar);
		System.out.println(obj2.myclassvar);
		System.out.println(obj3.myclassvar);
		
				
	}

}
