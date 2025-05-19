package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement elec = driver.findElement(By.xpath("//a[@href ='/electronics'][1]"));
		
	
		
	Actions act = new Actions(driver);
		
		act.moveToElement(elec).perform();
		
		
WebElement camphot = driver.findElement(By.xpath("//a[@href = '/camera-photo'][1]"));
		
		camphot.click();
		
		driver.findElement(By.xpath("//div[@class='picture'][1]")).click();
		
		driver.findElement(By.xpath("(//input[@type = 'button'])[3]")).click();
		
		
		 
		

	}

}
