package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub

	EdgeDriver driver = new EdgeDriver();
			
			//Load the URL//
			
	driver.get("https://letcode.in/dropdowns");
			
			driver.manage().window().maximize();
			
		WebElement fruits = 	driver.findElement(By.id("fruits"));
		
		Select myfruits = new Select(fruits);
		
		myfruits.selectByVisibleText("Apple");
		
WebElement country = 	driver.findElement(By.id("country"));
		
		Select mycountry = new Select(country);
		
		mycountry.selectByValue("India");
		
		WebElement heros = 	driver.findElement(By.id("superheros"));
		
		Select myheros = new Select(heros);
		
	boolean ismul =	myheros.isMultiple();
	System.out.println("Is multiple? "+ismul);
	
	myheros.selectByIndex(1);
	myheros.selectByVisibleText("Aquaman");
	
		
		

	}

}
