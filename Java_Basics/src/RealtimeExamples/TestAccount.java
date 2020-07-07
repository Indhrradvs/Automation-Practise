package RealtimeExamples;

// Java Program to demonstrate the working of a banking-system.  
// where we deposit and withdraw amount from our account.  
// Creating an Account class which has deposit() and withdraw() methods  

class Account {

	// Fields/Instance Variables

	int acc_no;
	String name;
	float amount;

	// Method to initialize the Object (CONSTRUCTOR)

	void insert(int a, String n, float amt) // Parameterized Constructor
	{
		acc_no = a;
		name = n;
		amount = amt;

	}

	// Deposit method

	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + "deposited");
	}

	// WithDraw Method

	void Withdraw(float amt) {

		if (amount < amt) {

			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + "withdrawn");
		}

	}

// method to check Balance Amount

	void check() {
		System.out.println("Balance is :" + amount);
	}

// Method to display 

	void Display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}

	static class TestAccount {

		public static void main(String args[]) {

			Account A1 = new Account();

			A1.insert(778899, "Johns", 12000); // Insert Method
			A1.Display();
			A1.check();

			A1.deposit(20000); // Deposit Method
			A1.check();

			A1.Withdraw(33000); // Withdraw
			A1.check();
		}

	}
}