package Assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnImplicityWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
		
		//Load the URL//
		
		driver.get("https://letcode.in/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//max
		
		 driver.findElement(By.linkText("Log in")).click();
	        
	       // driver.findElement(By.name("email").sendKeys ("koushik350@gmail.com");
	        
	        driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
	        
	        driver.findElement(By.name("password")).sendKeys("Pass123$");
	}

}
