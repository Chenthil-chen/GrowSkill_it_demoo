package febrauary;

public class TryCatchFinallyDempo {

	public static void main(String[] args) {
	
		try
		{
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println(10/0);
			
			
		}
		
	
	catch(Exception e)
		
		{
			System.out.println("Catch Block");
			e.printStackTrace();
		}
			
		
finally
		
		{
			System.out.println("Finally tBlock");
		}
		
		
		
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");


	}

}
