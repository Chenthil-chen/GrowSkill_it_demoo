package Cursorandcollection;

import java.util.ArrayList;

public class ArraylistDemo {
	public static void main(String[] args) {
		
	
	ArrayList  v = new ArrayList();
	
	v.add(10);
	v.add("chen");
	v.add(12.23);
	v.add(true);
	v.add(100);
	
	
	System.out.println(v);
	
	ArrayList  v1 = new ArrayList(v);
	v1.add("next");
	System.out.println(v1);
	System.out.println(v1.get(4));
      v1.set(2, "vijay");
   
	System.out.println(v1);
	System.out.println(v1.indexOf("vijay"));
	
	
	
	
}
}
