package Amzon;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		EdgeDriver driver = new EdgeDriver();
      //launch url
		driver.get("https://www.amazon.in/");
		// maximize the screen
       driver.manage().window().maximize();
}
}