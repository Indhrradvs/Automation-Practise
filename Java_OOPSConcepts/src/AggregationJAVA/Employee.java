package AggregationJAVA;

public class Employee 
{
	int id;
	String Name;
	Address address;
	
	public Employee( int id, String Name, Address address)
	{
		this.id = id;
		this.Name = Name;
		this.address = address;
		
	}
	
	void display()
	{
		System.out.println(id+" "+Name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
	public static void main(String[] args) 
	{
	
	Address address1 = new Address("Fairfax","Virginia","USA");
	Address address2 = new Address("Florence","Kentucky","USA");
	
	Employee E1 = new Employee(1,"Frank",address1);
	Employee E2 = new Employee(2,"Jason",address2);
	
	E1.display();
	E2.display();
	}

}
