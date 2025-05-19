package AAAAAAAAAA;

public class Prime {
	
	public static boolean areprime(int n) {
		
		if(n<1) 
			return false;
			
			for(int i = 2;i<n;i++)
				
			
				if(n%i ==0) 
				return false;
			
			
				return true;
	}
			
	

	public static void main(String[] args) {
		
		if(areprime(41)) {
			System.out.println("prome");
		}
		else {
			System.out.println("not prime");
		}
		
		

	}

}
