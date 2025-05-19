package Amzon;

public class Even_Odd {
	
	public static void printArray(int[] Array) {
		for (int i =0;i<Array.length;i++) 
			System.out.println(Array[i] + "");
			System.out.println();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int Array[] = { 23, 55, 54, 9, 76, 66, 2, 91 };
		int oddsize = 0;
		int evensize = 0;
		
		
		for (int i =0;i<n;i++) {
			if(Array[i]%2==0)
				evensize++;
			else
				oddsize++;
			
		}
		int[] even = new int[evensize];
		int[] odd = new int[oddsize];
		
		 int j = 0, k = 0;
		for (int i =0;i<n;i++) {
			
			if(Array[i]%2==0)
				even[j++] = Array[i];
			else
			odd[k++] = Array[i];
			
		}
		  System.out.print("Even Array contains: ");
	        printArray(even);
	        System.out.print("Odd Array contains: ");
	        printArray(odd);
		
		

	}

}
