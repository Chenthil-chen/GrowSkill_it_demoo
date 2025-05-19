package Seleniumpackagaes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.edge.EdgeDriver;

public class RobotKeyboardST {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		

		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_F5);
		robo.keyRelease(KeyEvent.VK_F5);
		
		Thread.sleep(5000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_T);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(5000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_N);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_N);
		
		
		
		
		

	}

}
