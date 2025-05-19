package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
	
		//File excelfile = new File("contacts.xlsx");
		
		String filePath = "D:\\New folder\\Contacts.xlsx";
		
		FileInputStream fis =  new FileInputStream(filePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator <Row> rowiterator = sheet.rowIterator();
		
		while(rowiterator.hasNext()) {
			
		Row row = rowiterator.next();
		 
			Iterator<Cell> cellIterator = row.cellIterator();
			
			while(cellIterator.hasNext()) {
				
			Cell cell = cellIterator.next();
			
			System.out.print(cell.toString() + ";");
			
			System.out.println();

		}
		workbook.close();
		fis.close();
		

	}

}
}
