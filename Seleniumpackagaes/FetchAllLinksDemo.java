package Seleniumpackagaes;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchAllLinksDemo {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//To check the total count of links
		
		System.out.println("Total count of links " +links.size());
		
		
		//to print with link name
		
		for(int i=0 ; i<links.size() ; i++)
		{
			String LinkName = links.get(i).getText();
			
			String url = links.get(i).getAttribute("href");
			System.out.println((i+1) + " . " + LinkName +"-------->" +url  );
		}
		

		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		//To check the total count of links
		
		System.out.println("Total count of images " +images.size());
		
		if(links.size() > images.size()) {
			System.out.println(" Test case pass");
		}
		else {
			System.out.println(" Test case Fail");
		}
		
		
		
		
		
		
		

	}

}
