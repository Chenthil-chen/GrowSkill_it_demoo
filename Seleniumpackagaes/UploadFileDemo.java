package Seleniumpackagaes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		//driver.findElement(By.id("uploadfile")).sendKeys("D:\\Aus\\as3.webp");
		
       String projectpath = System.getProperty("user.dir"); 
		
		driver.findElement(By.id("uploadfile")).sendKeys(projectpath +"\\files\\as3.webp");
		
		
		//File Snapfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(Snapfile, new File("./snaps/imgt.jpg"));  
		
		File Snapfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Snapfile, new File("D:\\New folder\\snaps\\img.png"));  


	}

}
