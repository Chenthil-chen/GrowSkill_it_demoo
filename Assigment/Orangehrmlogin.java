package Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Orangehrmlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		
driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
			 driver.findElement(By.xpath("//span[@class = 'oxd-userdropdown-tab']")).click();
			 driver.findElement(By.xpath("//ul[@role = 'menu']/child::li[4]/child::a")).click();

	}

}
