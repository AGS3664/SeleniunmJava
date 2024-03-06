package day58_dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadingExcel3 {
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
		int rowcount= wb.getSheet("sample").getPhysicalNumberOfRows();
		int cellcount= wb.getSheet("sample").getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of rows"+rowcount);
		System.out.println("Number of Columns"+cellcount);
		
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
			String data= wb.getSheet("sample").getRow(i).getCell(j).getStringCellValue();
			System.out.print(data);
			}
			System.out.println("*************");
		}
		
		
		wb.close();
	}

}
