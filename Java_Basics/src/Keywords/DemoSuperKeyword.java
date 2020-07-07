
// Using Super keyword to access Variables of parent class

package Keywords;

class Parentclass {
	int num = 100;
}

class Child extends Parentclass {
	int num = 200;

	void printnumber() {
		System.out.println(super.num);
	}
}

/*
 * 1. Here using super.num --> super keyword. 
 * 2. If we don't put "super" then it prints child class variable = 200 
 * 3. If you want to check then REMOVE super
 * and try it
 */

public class DemoSuperKeyword {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.printnumber();

	}

}
