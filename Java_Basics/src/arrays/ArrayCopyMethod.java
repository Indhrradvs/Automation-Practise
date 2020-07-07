
package arrays;

public class ArrayCopyMethod 
{
	public static void main(String[] args)
	{
	 
     	 char[] copyFrom = {'I','N','D','H','R','R','A'};  // Source Object
		 char[] copyTo =new char[7]; 
		
		 System.arraycopy(copyFrom,2, copyTo, 5, 7);
		 System.out.println(new String(copyTo));  
	}
}

/* class TestArrayCopyDemo {  
    public static void main(String[] args) {  
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  
        char[] copyTo = new char[7];  
  
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
        System.out.println(new String(copyTo));  
    }  
}  
     */