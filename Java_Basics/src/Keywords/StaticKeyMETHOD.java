
package Keywords;

public class StaticKeyMETHOD 
{
	int rollno;
	String name;
	static String college="GIITS"; // by giving STATIC only once Memory is allocated

	static void change()      // Changing common property of all fields
	{
		college ="VIU";
	}
	
	StaticKeyMETHOD(int r,String n)
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
	 
	StaticKeyMETHOD.change();  // Calling Change method 
	
	StaticKeyMETHOD s1 = new StaticKeyMETHOD(111,"King");
	
	StaticKeyMETHOD s2 = new StaticKeyMETHOD(222,"Queen");
		
	s1.display();
	s2.display();

	}

}
