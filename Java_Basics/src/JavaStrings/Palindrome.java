package JavaStrings;

public class Palindrome {

	public static void main(String[] args) {
			
		String myString = "NITIN";
		
		System.out.println(myString.length());  // Total Length of the String 
	    
		String myStringReversed = new StringBuilder(myString).reverse().toString();

	    if (myString.equals(myStringReversed)) 
	    {
	      System.out.println("Yes, it's a Palindrome..!!");
	    }
	    else {
	      System.out.println("No, it's not a Palindrome..!!");
	    }	
		
}

}
