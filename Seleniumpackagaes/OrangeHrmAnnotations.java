package Seleniumpackagaes;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHrmAnnotations {
	 EdgeDriver driver;
	 
	 @BeforeSuite
	 
	 public void setup() {
		 driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 @Test(priority = 1)
	 public void login() {
		 driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	 }
	 
	 @Test(priority = 2)
	 
	 public void verifyhomepage() {
		 String dash = driver.findElement(By.xpath("//div[@id = 'app']/descendant::H6[1]")).getText();
		 
		 if(dash.equals("Dashboard")) {
			 System.out.println("Logged home page ..............Test case pass");
		 }
		 else {
			 System.out.println("Not reached the loginpage ............test case fail");
			 
			 
			 
		 }

		 
	 }
	 
	 
	 @Test(priority = -1)
	 
	 public void logout() {
		 driver.findElement(By.xpath("//span[@class = 'oxd-userdropdown-tab']")).click();
			
			driver.findElement(By.linkText("Logout")).click();
	 }
	 
	@ AfterSuite
	 
	 public void quitbrowser() {
		 
		 driver.quit();
	 }
	 
	 
}
