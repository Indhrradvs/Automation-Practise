package ControlStatements;

public class NestedifExample {

	public static void main(String[] args) 
	{
		
		int i=30;
		
		if(i>100)  //First IF
		{
			System.out.println("i value is lessthan 100");
			
			if(i<100) //Second IF (Nested If)
			{
				System.out.println("i value is Greaterthan 20");
			}
			
			
		}
		
	}

}


//* YOU WON'T GET THE ANSWER BEACAUSE IF CONDITION-1  FAILED, CHANGE IT AND CHECK IT FOR ANSWER*//