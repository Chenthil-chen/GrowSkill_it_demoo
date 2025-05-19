package Assignment8;

abstract class vehicle{
	 abstract void start();
}

class car extends vehicle{
	public void start() {
		System.out.println(" car start with key");
	}
}

 class AbstracScooty extends vehicle {
	public void start() {
		System.out.println(" scooty start with key");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c = new car();
		c.start();
		
		AbstracScooty as = new AbstracScooty();
		as.start();
		
		

	}

}
