package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingFroames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EdgeDriver driver = new EdgeDriver();
		
		//Load the URL//
		
		driver.get("https://letcode.in/frame");
		
		WebElement myfrome =  driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		 driver.switchTo().frame(myfrome);
		 
		
		  driver.findElement(By.name("fname")).sendKeys("koushik");
		  driver.findElement(By.name("lname")).sendKeys("C");
		  
		  driver.switchTo().frame(1);
		  driver.findElement(By.name("email")).sendKeys("email");
		  
		 driver.switchTo().parentFrame();
		  
	 driver.findElement(By.name("lname")).sendKeys("Ccbd");
		  
		  driver.switchTo().defaultContent();		  
		  
		  driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
		  
		  
		  
		  

	}

}
