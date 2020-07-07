package Keywords;

public class StaticBLock 
{
	static    // Static Block is added, it is executed before main method at the time of Class Loading 
	{
		System.out.println("Static Block is Invoked");
	}
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("Hello Main...");
	}

}
