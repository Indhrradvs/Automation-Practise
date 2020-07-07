package DataDrivernFW;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception {
		
		/* Providing Path to Excel File */

		File src = new File("D:\\Selenium Softwares\\ExcelRead_POI\\LoginData.xlsx");

		/* Loading excel file into FileInput Stream */

		FileInputStream Fis = new FileInputStream(src);

		/* XSSFWorkbook: Is a class representation of XLSX file. */

		XSSFWorkbook wb = new XSSFWorkbook(Fis);

		/* Excel Sheet Name - LoginInfo */

		XSSFSheet LoginInfo = wb.getSheetAt(0);

		/* I want to read from single Row and column */

		String data0 = LoginInfo.getRow(1).getCell(0).getStringCellValue();

		System.out.println("Data From Excel Sheet :: " + data0);
		
		wb.close();
	}

}
