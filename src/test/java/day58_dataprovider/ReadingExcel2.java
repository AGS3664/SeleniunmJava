package day58_dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcel2 {
	@Test
	public void readata() throws IOException
	{
		//Refactor code
		//file-to provide file path
		//fileinputstream-to input the data in raw format
		
		//XSSFWorkbook - which represent complete excel sheet
		//XSSFSheet - which represent sheet
		//XSSFRow - which represent the row
		//XSSFCell- which represent which cell you want to read
		//type - what type of data you want to read
		
		
		
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./TestData/testData.xlsx")));
		String data= wb.getSheet("sample").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data);
		wb.close();
	}

}
