package Assignment4;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char ch[]= {'c','h','e','n','t','h','i','l'};//
	//	String s1 =new String("chenthil");//
		//System.out.println(s1);//
		
		
		String s = "chenthil";
		String s1 = "Chenthil";
		
		System.out.println(s);
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(s.contains("j"));
		System.out.println(s.isEmpty());
		System.out.println(s.replace("h", "yes"));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

	}

}
