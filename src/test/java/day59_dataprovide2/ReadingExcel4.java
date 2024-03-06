package day59_dataprovide2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadingExcel4 {
	@Test
	public void readata() throws IOException
	{
		
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./TestData/testData.xlsx")));
		int rowcount= wb.getSheet("sample").getPhysicalNumberOfRows();
		int cellcount= wb.getSheet("sample").getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of rows"+rowcount);
		System.out.println("Number of Columns"+cellcount);
		
		Object [][] arr=new Object[rowcount-1][cellcount];
		for(int i=1;i<rowcount;i++) 
		{
			for(int j=0;j<cellcount;j++)
			{
			arr[i-1][j]= wb.getSheet("sample").getRow(i).getCell(j).getStringCellValue();
			System.out.println(arr[i-1][j]);
			
		
			}
			System.out.println("*************");
		}
		
		
		wb.close();
	}

}
