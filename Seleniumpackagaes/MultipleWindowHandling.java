package Seleniumpackagaes;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.myntra.com/women-kurtas-kurtis-suits");
		
	List<WebElement> dresses = driver.findElements(By.xpath("//ul[@class = 'results-base']/child::li/child::a"));
	
	for(int i =0;i<5;i++) {
		
		dresses.get(i).click();
		
	}
	
	Set<String> wins = driver.getWindowHandles();
	System.out.println(wins);
		
		
		for (String s : wins) {
			driver.switchTo().window(s);
			 Thread.sleep(3000);
			//System.out.println(driver.getCurrentUrl());
			 
			/* String tittle = driver.getTitle();
			 if(tittle.contains("Black"))
					 {
				 break;
			 }*/
			 
		
		}
		for (WebElement link : dresses) {
            String linkText = link.getText();  // Get the link text
            if (!linkText.isEmpty()) {  // Optional: Only print non-empty link text
                System.out.println(linkText);
            }}
		
		
		

	}

}
