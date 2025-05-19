package Assignment3;

public class TypesOfVariables {
	
	int c;
	
	public void add() {
		
		int a = 10;
		int b= 20;
		//int c= 90;
		
		System.out.println("addition of a&b = " +(a+b));
		
		System.out.println("value of c = " +c);
	}
public void sub() {
		
	int a = 10;
	int b= 20;
	c = 30;
		
		System.out.println("sub of a&b = " +(b-a));
		System.out.println("value of c = " +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TypesOfVariables tv = new  TypesOfVariables();
		 tv.add();
		 tv.sub();
		 

	}

}
