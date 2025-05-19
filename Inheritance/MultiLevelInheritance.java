package Inheritance;

class grandfather{
	
	

public void gfmethod()
{
 System.out.println("This is gf method");
}

}


class father extends grandfather{
	public void fathermethod()
	{
	 System.out.println("This is father method");
	}
	
}

public class MultiLevelInheritance extends father {

	public void minemethod()
	{
	 System.out.println("This is mine method");
	}

	public static void main(String[] args) {
		grandfather gf = new grandfather();
		gf.gfmethod();
		
		System.out.println("======================");
		
		father ft = new father();
		ft.gfmethod();
		ft.fathermethod();
		
		System.out.println("======================");
		
		MultiLevelInheritance mid = new MultiLevelInheritance();
		mid.minemethod();
		mid.fathermethod();
		mid.gfmethod();
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
