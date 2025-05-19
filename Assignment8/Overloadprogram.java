package Assignment8;


class Calculator{
	
	int add(int a,int b) {
		
		return a +b;
		
	}
int add(int a,int b , int c) {
		
		return a +b+c;
		
	}

double add(double a , double b) {
	return a +b;
}
}

public class Overloadprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Calculator calculator = new Calculator();
	        
	        // Call the overloaded methods
	        System.out.println("Sum of two integers: " + calculator.add(10, 20));  // Calls add(int, int)
	        System.out.println("Sum of three integers: " + calculator.add(10, 20, 30));  // Calls add(int, int, int)
	        System.out.println("Sum of two doubles: " + calculator.add(10.5, 20.5));  // Calls add(double, double)

	}

}
