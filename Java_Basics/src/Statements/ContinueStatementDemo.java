package Statements;

public class ContinueStatementDemo {

	public static void main(String[] args) 
	{
	
		for(int i=1;i<=10;i++) //USING CONTINUE in FOR LOOP
		{
			
			if(i==5)
			{
				continue;
			}
			
			System.out.println(i);
		}
	}

}
			/* when u use CONTINUE at some point then that condition won't execute 
			from above program "CONTINUE" is used at i==5 then 5 won't show in output */
			