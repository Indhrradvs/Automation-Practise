
			// Super keyword- Invoking Method


package Keywords;

class Animals
{
	void eat()     // this method is Over-ridden in child class
	{
		System.out.println("Eating..!!");
	}
}

class Monkey extends Animals
{
	void eat()
	{
		System.out.println("Monkey is eating Apple...!!");
	}
	
	void jump()
	{
		System.out.println("Monkey is going to Jump...!!");
	}
	
	void work()
	{
		super.eat();  // we are  calling eat() method in parent class 
		jump();
	}
}

public class Super3Method {

	public static void main(String[] args) 
	{
		Monkey obj = new Monkey();
		obj.work();
	}

}
