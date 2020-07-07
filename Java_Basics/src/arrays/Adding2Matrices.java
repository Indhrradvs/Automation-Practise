package arrays;

public class Adding2Matrices {

	public static void main(String[] args) 
	{
		/* Creating 2 Matrices*/
		
		int a[][]= { {1,3,4},{3,4,5} };
		int b[][]= { {2,3,6},{1,6,3} };
		
		// Creating 3rd Matrix to store 2 matrices value
		int c[][]= new int[2][3];
	
		// Adding and printing Addition of 2 Matrices
		for(int i=0; i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");  
			}
				System.out.println(); //New Line
			}
		}
	
	}
	
