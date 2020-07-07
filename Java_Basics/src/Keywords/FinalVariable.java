
			// Final Keyword - Using in Variables

// Once you Make variable as FINAL then You can't change the value of a Final Variable 


package Keywords;

public class FinalVariable 
{
	 int Speedlimit = 100;	
	void run()
		{
		Speedlimit = 200;
		}

	public static void main(String[] args) 
	{
		FinalVariable obj  = new FinalVariable();
		obj.run();

	}

}
