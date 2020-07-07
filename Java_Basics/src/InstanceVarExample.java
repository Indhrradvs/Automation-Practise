
public class InstanceVarExample
{
	// variable name = myInstanceVar
	
	String myInstanceVar =" INSTANCE VARIABLE"; 
		
	public static void main(String[] args) 
	
	{
		//Creating 3 objects
		
	InstanceVarExample obj = new InstanceVarExample();
	InstanceVarExample obj2 = new InstanceVarExample();
	InstanceVarExample obj3 = new InstanceVarExample();
	
	System.out.println(obj.myInstanceVar);
	System.out.println(obj2.myInstanceVar);
	System.out.println(obj3.myInstanceVar);
	
	//Changing Value for obj2
	
	obj2.myInstanceVar ="Changed text";
	
	//Printing 3 Obj
	
	
	System.out.println(obj.myInstanceVar);
	System.out.println(obj2.myInstanceVar);
	System.out.println(obj3.myInstanceVar);
	
	}

}
