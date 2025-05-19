package Assigment;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

EdgeDriver driver = new EdgeDriver();
		
		//Load the URL//
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
	WebElement Source = 	driver.findElement(By.id("draggable"));
	WebElement Target = 	driver.findElement(By.id("droppable"));
	
	Actions builder = new Actions(driver);
	
	builder.clickAndHold(Source).moveToElement(Target).release().build().perform();
	//builder.dragAndDrop(Source, Target).perform();
	
	}
}
