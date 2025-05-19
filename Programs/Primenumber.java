package Programs;

public class Primenumber {
	
	public static boolean isprime(int n) {
		
		if(n<1)
			return false;
		
		// Check from 2 to n-1
		for (int i =2;i<n;i++) 
			if(n%i ==0) 
				return false;
		
		return true;
				
			}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(isprime(41)) {
			System.out.println("true");
		}
		else {
			System.out.println("flase");
		}

	}

}
