package arrays;

public class MultiArray {

	public static void main(String[] args) 
	{
		int a[][]= { {11,12,13}, {21,22,23}, {31,32,33} };  // Declare,Instantiate,Initialize 2D array
				
		// Printing 2D- Array(i,j)
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println(a[i][j]+" ");
			}
		}
		
		System.out.println();
		
	}

}
