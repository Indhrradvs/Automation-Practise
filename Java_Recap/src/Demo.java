
interface BMW {
	
     void Drive();
     
     static void Audio() {
	
    	 System.out.println("Premium 22 Speaker Surround Sound");
		
	}
}

class Mini implements BMW {
	
	public void Drive() 
	{
		
		System.out.println("Mini Cooper Running at 155Km/H");
	}
	
public static void main(String[] args) {

		BMW car1 = new Mini();	
		car1.Drive();
		BMW.Audio();
	}
  }

