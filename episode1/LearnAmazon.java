package episode1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
      //launch url
		driver.get("https://www.amazon.in/");
		// maximize the screen
       driver.manage().window().maximize();
     
	}

}
