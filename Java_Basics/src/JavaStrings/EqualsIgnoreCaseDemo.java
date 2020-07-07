package JavaStrings;

public class EqualsIgnoreCaseDemo {

	public static void main(String[] args)
	{
			String s1 ="mercedesBenz";
			String s2 ="audi";
			String s3 ="MERCEDESBENZ";
			String s4 ="BMW";

			System.out.println(s1.equalsIgnoreCase(s2)); //FALSE because different content
			System.out.println(s1.equalsIgnoreCase(s3)); // TRUE because  Case ignored
			System.out.println(s1.equalsIgnoreCase(s4)); // FLASE
			
	}

}
