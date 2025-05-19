package Cursorandcollection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		
		v.add(10);
		v.add("chen");
		v.add(12.23);
		v.add(true);
		v.add(100);
		
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
		

	}

}
