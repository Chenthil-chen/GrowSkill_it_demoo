package Assigment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
EdgeDriver driver = new EdgeDriver();
		
		//Load the URL//
		
		driver.get("https://letcode.in/alert");
		
		driver.manage().window().maximize();
		
		// Simple alert - accept
		
		driver.findElement(By.id("accept")).click();
		
		Thread.sleep(5000);
		
		Alert alert =  driver.switchTo().alert();
		
		String text =  alert.getText();
		
		System.out.println("Simple alert"+ text);
		alert.accept();
		
		// Confirm alert - accept or dismiss
		
		driver.findElement(By.id("confirm")).click();
		
		driver.switchTo().alert().dismiss();
		
		//Prompt alert
		
		driver.findElement(By.id("prompt")).click();
		
		driver.switchTo().alert();
		
		alert.sendKeys("chenthil");
		
		alert.accept();
		
		Thread.sleep(10000);
		
		String name = driver.findElement( By.id("myName")).getText(); 
		 
		System.out.println(name);
		
		
		 

	}

}
