package DataDrivernFW;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1 {

	public static void main(String[] args) throws Exception {
		
		/* Providing Path to Excel File */

		File src = new File("D:\\Selenium Softwares\\ExcelRead_POI\\LoginData.xlsx");

		/* Loading excel file into FileInput Stream */

		FileInputStream Fis = new FileInputStream(src);

		/* XSSFWorkbook: Is a class representation of XLSX file. */

		XSSFWorkbook wb = new XSSFWorkbook(Fis);

		/* Excel Sheet Name - LoginInfo */

		XSSFSheet LoginInfo = wb.getSheetAt(0);

		/* To check Total Rows */
		
		int rowcount=LoginInfo.getLastRowNum();
		System.out.println("Total Rows are :"+rowcount);
		
		/*To print total Rows Data*/
		
		for(int i=0;i<rowcount;i++)
		{
			String data0=LoginInfo.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Total  data from Excel:"+ data0);
		}
		
		wb.close();
	}
	
}
