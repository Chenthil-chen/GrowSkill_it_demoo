package Seleniumpackagaes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		    WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(10));
		  WebElement username =  waits.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
			
			
			username.sendKeys("Admin");
			
			driver.findElement(By.name("password")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
			
			
			  WebElement profile =  waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class = 'oxd-userdropdown-tab']")));
			  
			  profile.click();
			//driver.findElement(By.xpath("//span[@class = 'oxd-userdropdown-tab']")).click();
			  
 WebElement logout =  waits.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("Logout"))));
			  
			  logout.click();
			
			//driver.findElement(By.linkText("Logout")).click();
			

	}

}
