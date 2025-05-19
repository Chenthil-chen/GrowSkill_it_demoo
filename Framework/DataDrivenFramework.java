package Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DataDrivenFramework {

	public static void main(String[] args) throws IOException {
		
		EdgeDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		String filePath = "D:\\New folder\\KeywordDriven.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Data");

		int rows = sheet.getLastRowNum();
		
		System.out.println("Total number of rows: "  +rows);
		
		for(int i = 1;i<= rows;i++) {
			
			XSSFRow row = sheet.getRow(i);
			XSSFCell uname = row.getCell(0);
			XSSFCell pass = row.getCell(1);
			//to update the value in xl
			XSSFCell result = row.createCell(2);
			XSSFCell errormsg = row.createCell(3);
			
			
			System.out.println("username---->" +uname+ "              password---->" +pass);
			
			try {
			
			 driver.findElement(By.name("username")).sendKeys(uname.toString());
				driver.findElement(By.name("password")).sendKeys(pass.toString());
				driver.findElement(By.xpath("//button[@type = 'submit']")).click();
				 driver.findElement(By.xpath("//span[@class = 'oxd-userdropdown-tab']")).click();
				
					
					driver.findElement(By.linkText("Logout")).click();
					
					System.out.println("Valid data");
					result.setCellValue("valid data");
					errormsg.setCellValue("NA");
			}
			catch(Exception e) {
				System.out.println("Invalid data");
				result.setCellValue("Invalid data");
				String valmsg = driver.findElement(By.xpath("//div[@id = 'app']//descendant::p[1]")).getText();
				errormsg.setCellValue(valmsg);
			
			}
			fis.close();
			
			FileOutputStream fos = new FileOutputStream(filePath);
			workbook.write(fos);
					

		}
	} 

}
 