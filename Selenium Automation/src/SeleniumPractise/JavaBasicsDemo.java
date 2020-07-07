package SeleniumPractise;

public class JavaBasicsDemo {
	
	public String str ="Welcome to BMW";  //  Global Declaration
	
		public void test()
		{
			//String str; //Declaring Variable //Called as Local Variable(Local Declaration)
			//str="Welcome to Landrover";  // Initializing Value
			System.out.println("Hello, Mr.Indhrra..!!");
			System.out.println(str);
		}
	 public void Test2()
	 {
		 System.out.println(str);
	 }
	public static void main(String[] args) {
		
		JavaBasicsDemo JD = new JavaBasicsDemo();  // Creating Object for a Class
		JD.test();
		
	}

}
