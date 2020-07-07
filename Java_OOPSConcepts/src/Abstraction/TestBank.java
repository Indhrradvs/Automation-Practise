package Abstraction;


abstract class Bank   //Abstract Class
{	
	public String intrestRate;

	abstract int intrestRate();    //Abstract Method
}

class SBI extends Bank     //Implementation-1
{
	int intrestRate()
	{
		return 10;
	}
	
}

class HSBC extends Bank			//Implementation-2
{	
	int intrestRate()
		{
			return 20;
		}
}


class TestBank                  //Main Class
{
	
	public static void main(String[] args)
	{
		Bank b;
		
		b = new SBI();
		System.out.println("Rate of Intrest is: "+ b.intrestRate()+" % ");
		
		b= new HSBC();
		System.out.println("Rate of Intrest is: "+ b.intrestRate()+" % ");
	
	}


}


	

	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
