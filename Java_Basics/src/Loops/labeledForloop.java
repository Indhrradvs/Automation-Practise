package Loops;

public class labeledForloop
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
	
		Hello:  //label name
			for(int i=1;i<=3;i++) // for-loop 1
			{
				Hi:
					for(int j=1;j<=3;j++) //for-loop 2
						{
							if(i==2 && j==2)
							{
							break Hello;
							}
							System.out.println(i+" "+j);
						}
				
				;
			}
			
	}

}
