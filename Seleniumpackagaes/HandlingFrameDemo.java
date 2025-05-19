package Seleniumpackagaes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
	driver.switchTo().frame(2);
	
//	WebElement text = driver.findElement(By.xpath("//span[text() = 'Hi, I am the UI.Vision IDE']"));
	
	//text.click();
	driver.switchTo().frame(0);
	
	//driver.findElement(By.xpath("//div[@class = 'ulDsOb'][1]/child::span")).click();
	driver.findElement(By.id("i9")).click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(10, document.body.scrollHeight)");
	driver.findElement(By.id("i21")).click();
	
	driver.findElement(By.xpath("(//div[@role = 'presentation'])[1]")).click();
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("(//div[@role = 'listbox']")).click();
	driver.findElement(By.xpath("(//div[@role = 'option'])[3]")).click();
	driver.findElement(By.xpath("(//span[@class ='l4V7wb Fxmcue'])[2]")).click();
	
	

	
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);
		
		WebElement element = driver.findElement(By.xpath("//input[@name ='mytext3']"));
		
		element.sendKeys("chenthil");
		
		//driver.switchTo().defaultContent();
		
		//driver.switchTo().frame(0);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		

		WebElement element1 = driver.findElement(By.xpath("//input[@name ='mytext1']"));
		
		element1.sendKeys("kumaran");
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(3);
		
WebElement element2 = driver.findElement(By.xpath("//input[@name ='mytext4']"));
		
		element2.sendKeys("king");
		
driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(1);
		
WebElement element3 = driver.findElement(By.xpath("//input[@name ='mytext2']"));
		
		element3.sendKeys("king");
		
		
		
	//	driver.switchTo().frame(2);
		
		//WebElement text = driver.findElement(By.xpath("//span[text() = 'Hi, I am the UI.Vision IDE']"));
		
	//	Actions act = new Actions(driver);
		
	//	act.moveToElement(text).build().perform().
		

	}

}
