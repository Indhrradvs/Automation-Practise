package seleniumWD;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead_POI {
	
	public static void  main(String args[]) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium Softwares\\ExcelRead_POI\\ReadPOI_API.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);  // Workbook is EXCEL File
		
		XSSFSheet s = wb.getSheet("UserLogin");
	
		/* Reading ROWs from excel*/
	
	    Iterator<Row> rowIt = s.iterator(); 
	    
	    rowIt.next();  // Next element
	    
	    /* cell 0 --> username and Cell 1 --> Password*/
	    
	    while(rowIt.hasNext()) {
	    	System.out.println(rowIt.next().getCell(0)); 
	    	
	    }
	
	    wb.close(); // To save data Leak
	}

}
