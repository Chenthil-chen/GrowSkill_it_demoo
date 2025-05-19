package Assignment7;

public class Typesofvariablesdemo {
	int c;
	
	public void addition()
	{
		int a = 10;
		int b = 20;
		System.out.println("value of c in addition method="+(a+b));
		System.out.println("addition of  a&b:"+(a+b));
		
	}
	public void subraction()
	{
		int a = 10;
		int b = 20;
		System.out.println("subraction of  a&b:"+(b-a));
		
	}
	public void multi()
	{
		int a = 10;
		int b = 20;
		System.out.println("multi of  a&b:"+(b*a));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Typesofvariablesdemo tv = new Typesofvariablesdemo();
		tv.addition();
		tv.subraction();
		tv.multi();
		

	}

}
