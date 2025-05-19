package Seleniumpackagaes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverNackri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		

		WebElement jobs = driver.findElement(By.xpath("//a[@class = 'nI-gNb-menuItems__anchorDropdown'][1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(jobs).build().perform();
		
		Thread.sleep(10000);
		
		
		WebElement register = driver.findElement(By.id("register_Layer"));
		
		register.click();
		

	}

}
