package Assignment3;

public class InstanceVariableExample {
    
    // Declaring instance variables
    int number = 10;          // Instance variable of type int
    String message= "chen";      // Instance variable of type String
    
    //  Constructor to initialize the instance variables
    public void InstanceVariableExample(int num, String msg) {
        number = num;      // Assigning value to instance variable
        message = msg;     // Assigning value to instance variable
    }
    
    // Method to display the values of instance variables
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Creating an object of the InstanceVariableExample class
        InstanceVariableExample obj = new InstanceVariableExample();
        
        // Calling the display method to show instance variable values
        obj.display();
    }
}
