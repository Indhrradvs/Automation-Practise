
// Static Keyword used in Variable

package Keywords;

public class StaticKeyVAR 
{
	int rollno;
	String name;
	static String college="GIITS"; // by giving STATIC only once Memory is allocated

	StaticKeyVAR(int r,String n)
	{
		rollno=r;
		name=n;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void main(String[] args) 
	{
	StaticKeyVAR s1 = new StaticKeyVAR(111,"King");
	StaticKeyVAR s2 = new StaticKeyVAR(222,"Queen");
		
	s1.display();
	s2.display();

	}

}
