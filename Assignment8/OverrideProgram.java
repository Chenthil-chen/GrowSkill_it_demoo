package Assignment8;



class animal{
	
	void sound() {
		System.out.println("Animal makes sound");
	}
	
}

class dog extends animal{
	void sound() {
		
		System.out.println("Dog barks");
	}
}

public class OverrideProgram {

	public static void main(String[] args) {
		
		dog d = new dog();
		d.sound();
	
		animal a = new animal();
		a.sound();

	}

}
