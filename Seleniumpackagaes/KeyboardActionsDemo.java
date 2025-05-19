package Seleniumpackagaes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("gender-female")).click();
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB);
		
		act.sendKeys("chenthil");
		
		act.sendKeys(Keys.TAB);
		act.sendKeys("kumar");
		
		act.sendKeys(Keys.TAB);
		act.sendKeys("chenthil55@gmail.com");
		
		act.sendKeys(Keys.ENTER);
		
		act.build().perform();
		
		
		
		

	}

}
