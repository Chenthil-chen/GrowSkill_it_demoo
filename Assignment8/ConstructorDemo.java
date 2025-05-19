package Assignment8;

public class ConstructorDemo {
	
	/*public ConstructorDemo() {
		System.out.println("Hey constructor============ ");
	}*/
		ConstructorDemo(String name , int age) {
	System.out.println("my name is : " +name+ " and age is" +age);
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo("Chenthil " , 28);
		ConstructorDemo cd1 = new ConstructorDemo("Ckumar " , 28);
		
		

	}

}
