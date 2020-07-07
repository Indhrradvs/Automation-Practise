package Statements;

public class SwitchusigCharecter {

	public static void main(String[] args) {

		// SWITCH USING CHAR
		char ch = 'b'; // If you put 'b' then B case will be executed

		switch (ch) {
		case 'a':
			System.out.println("CASE A executed");
			break;

		case 'b':

			System.out.println("CASE B executed");
			break;
		case 'c':

			System.out.println("CASE C executed");
			break;

		default:
			System.out.println("NONE OF THE CASES SELECTED");
			break;
		}

	}

}
