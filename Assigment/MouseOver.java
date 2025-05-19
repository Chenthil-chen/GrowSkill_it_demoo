package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EdgeDriver driver = new EdgeDriver();
		
		//Load the URL//
		
		driver.get("https://www.flipkart.com/");
		
		//max
		
	  driver.manage().window().maximize();
	  
	   driver.findElement(By.linkText("Login")).click();
	  
	 WebElement elec =  driver.findElement(By.xpath("//span.='Electronics']"));
	 
	 Actions builder = new Actions(driver);
	 
	 builder.moveToElement(elec).perform();
	 
	 driver.findElement(By.linkText("apple")).click();
	 
	 
	 
	 

	}

}
