package Assigment;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub
		
EdgeDriver driver = new EdgeDriver();
		
		//Load the URL//
		
		driver.get("https://letcode.in/buttons");
		
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		// Syntax for screenshot
		// File firstsrc = driver.getScreenshotAs(OutputType.FILE);
		// File dest = new File("./snaps/img,png");
		// FileHandler.copy(firstsrc, dest);//
		
		File Snapfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Snapfile, new File("./snaps/imgt.jpg"));  
		
		
	
		 
		
		
	
		
		

	}

}
