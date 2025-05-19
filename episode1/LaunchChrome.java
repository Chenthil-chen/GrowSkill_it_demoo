package episode1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
      //launch url
		driver.get("https://qatesting.novolims.net");
		// maximize the screen
       driver.manage().window().maximize();
       
       //Click Advance
        driver.findElement(By.id("details-button")).click();
        
        //Click Proceed
       driver.findElement(By.id("proceed-link")).click();
       
       driver.findElement(By.id("txtUserName")).sendKeys("smoke@gmail.com");
       
         driver.findElement(By.id("txtPassword")).sendKeys("admin$$");
         
         driver.findElement(By.id("btnLogin")).click();
         

        // driver.findElement(By.id("Allow")).click();
         
       Actions builder = new Actions(driver);
       
       //WebDriverWait wait = new WebDriver Wait(driver, 10);
       
     //  WebElement electronics = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[@href='/electronics']")));
      // builder.moveToElement(electronics).perform();
       
       WebElement camera_n_photo = driver.findElement(By.xpath("//a[@id=\"menu_Order\"]"));
       
       camera_n_photo.click();
      
       //  builder.moveToElement(driver.findElement(By.xpath("//a[@id=\"menu_Order\"]"))).build().perform();
         
      //   builder.moveToElement(driver.findElement(By.xpath("//a[@id=\"menu_Order\"]"))).click().build().perform();
         
   //  WebElement order =  driver.findElement(By.xpath("//a[@id=\"menu_Order\"]"));
         
       //  builder.moveToElement(order).perform();
         
         
         
	}

}
