package JavaStrings;

public class StringDemo1 {

	public static void main(String[] args) 
	{
	 
	String s1 = "JAVA";   // Creating String by JAVA String Literal
	
	 char ch[] = {'S','T','R','I','N','G','S'};
	 
	String s2 = new String(ch);   // converting CHAR array to String
	
	String s3 = new String("Example");  // creating String  by NEW KEYWORD
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);	

	}

}
