package JavaStrings;

public class EqualsDemo {

	public static void main(String[] args) 
	{
	
		String s1 = "JAVATPOINT";
		String s2 = "javatpoint";
		String s3 = "Python";
		String s4 = "JAVATPOINT";
		
		System.out.println(s1.equals(s2)); // Returns FALSE
		System.out.println(s1.equals(s3)); //Returns FALSE
		System.out.println(s1.equals(s4)); //Returns TRUE
				
	}

}
