package Inheritance;

class animal{
	public void sound() {
		System.out.println("Animal makes sound");
	}
}

class dog{
	public void sound() {
		System.out.println("dog barks");
	}
}




public class override{
	

	public static void main(String[] args) {
		
		animal al = new animal();
		al.sound();
		
		dog dg = new dog();
		dg.sound();
		
		
		
		
		
		

	}

}
