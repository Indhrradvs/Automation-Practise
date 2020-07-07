								
								/* Single Dimensional Array */
package arrays;

public class TestArray1 {

	public static void main(String[] args) 
	{
		
		/* int a[ ]=new int[5];	 //Declaration and Instantiation (Way-1)
             		
		 a[0]=10;   // Array Initialization
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[4]=50;   
		 
		 */

		// Declaration,Instantiation and Initialization (Way-2)
			
			int a[]= {1,2,3,4,5,6};
		
		 //Printing Array
		 
		 for(int i=0; i<a.length; i++)   // LENGTH is the property of Array.
		 {
			 System.out.println(a[i]);
		 }
		
		
		
	}

}
