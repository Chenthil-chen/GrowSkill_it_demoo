package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginScenarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//launch//
	
		EdgeDriver driver = new EdgeDriver();
		
		//Load the URL//
		
		driver.get("https://letcode.in/");
		
		//max
		
	  driver.manage().window().maximize();
	  
	        driver.findElement(By.linkText("Log in")).click();
	        
	       // driver.findElement(By.name("email").sendKeys ("koushik350@gmail.com");
	        
	        driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
	        
	        driver.findElement(By.name("password")).sendKeys("Pass123$");
	        
	        driver.findElement(By.xpath("//button[.='LOGIN']")).click();
	        
	        
	        
		
		
		
		

	}

}
