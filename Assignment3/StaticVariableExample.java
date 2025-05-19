package Assignment3;

public class StaticVariableExample {

	 static int count = 10;  // Static variable

	    // Constructor to increment the static variable
	    public StaticVariableExample() {
	        count++;  // Increment the static variable every time an object is created
	    }

	    // Method to display the static variable
	    public void display() {
	        System.out.println("Count: " + count);  // Display the value of the static variable
	    }

	    public static void main(String[] args) {
	        // Creating objects of StaticVariableExample class
	        StaticVariableExample obj1 = new StaticVariableExample();
	        StaticVariableExample obj2 = new StaticVariableExample();
	        StaticVariableExample obj3 = new StaticVariableExample();
	        StaticVariableExample obj4 = new StaticVariableExample();
	        
	        // Calling the display method on each object
	        obj1.display();
	        obj2.display();
	        obj3.display();
	        obj4.display();
	        
	        // All objects share the same static variable
	        // So the value of 'count' is incremented across all instances
	    }
	}