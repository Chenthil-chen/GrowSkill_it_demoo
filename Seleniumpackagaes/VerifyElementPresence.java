package Seleniumpackagaes;



	
		// TODO Auto-generated method stub
		import org.openqa.selenium.By;
		import org.openqa.selenium.NoSuchElementException;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class VerifyElementPresence {
		    public static void main(String[] args) {
		       
		       

		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Open the application URL (replace with your application URL)
		        driver.get("https://www.example.com");

		        try {
		        	WebElement element = driver.findElement(By.id("your-element-id")); // Modify with your element locator
		            System.out.println("Element is present.");
		        } catch (NoSuchElementException e) {
		            System.out.println("Element is not present.");
		        }

		        // Close the browser
		        driver.quit();
		    }
		
		        

	}


