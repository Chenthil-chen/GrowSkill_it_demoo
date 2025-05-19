package Inheritance;




class king{
	public void kingmethod()
	{
		System.out.println("THis is kingmethod");
		// TODO Auto-generated method stub

	}
}

 class SingleInheritance extends king {
	public void queenmethod()
	{
		System.out.println("THis is queenmethod");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		king k = new king();
		k.kingmethod();
		System.out.println("===========");
		
	SingleInheritance sid = new SingleInheritance();
	sid.queenmethod();
	sid.kingmethod();

	}

}
