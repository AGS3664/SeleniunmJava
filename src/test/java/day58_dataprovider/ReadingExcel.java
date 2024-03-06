package day58_dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcel {
	@Test
	public void readata() throws IOException
	{
		//file-to provide file path
		//fileinputstream-to input the data in raw format
		
		//XSSFWorkbook - which represent complete excel sheet
		//XSSFSheet - which represent sheet
		//XSSFRow - which represent the row
		//XSSFCell- which represent which cell you want to read
		//type - what type of data you want to read
		
		File src = new File("./TestData/testData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheet("sample");
		XSSFRow row1=sh1.getRow(0);
		XSSFCell cell1= row1.getCell(1);
		
		String data= cell1.getStringCellValue();
		
		System.out.println(data);
		wb.close();
	}

}
