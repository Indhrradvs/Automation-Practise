package Abstraction;

interface Abstraction 
{
	void run();
	
   static String execute()
	{
		return "HELLO";
	}
}


class child implements Abstraction
{
	public void run()
	{
	
		System.out.println("Running Safely");
		
	}
	
	public static void main(String[] args) 
	{
		child obj = new child();
		obj.run();
		
		System.out.println(Abstraction.execute());
		
	}

}
