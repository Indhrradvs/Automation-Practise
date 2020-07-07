package JavaStrings;

public class ConcatDemo {

	public static void main(String[] args) 
	{
		String s1 = "java string";
		
		s1.concat("is immutable");
		System.out.println(s1);     // prints Java String
		
		s1 = s1.concat(" so Assign it explicitly");
		System.out.println(s1);   // prints so Assign it explicitly
	}

}
