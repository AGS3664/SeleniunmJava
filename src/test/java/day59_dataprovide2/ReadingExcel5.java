package day59_dataprovide2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadingExcel5 {
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
			String value="";
				CellType type= wb.getSheet("sample").getRow(i).getCell(j).getCellType();
				if (type==CellType.NUMERIC) 
				{
				 value=String.valueOf(wb.getSheet("sample").getRow(i).getCell(j).getNumericCellValue());	
				} 
				else if(type==CellType.STRING)
				{
					value=wb.getSheet("sample").getRow(i).getCell(j).getStringCellValue();
				}
				else if (type==CellType.BOOLEAN) 
				{
					value=String.valueOf(wb.getSheet("sample").getRow(i).getCell(j).getBooleanCellValue());
				}
				else if (type==CellType.BLANK)
				{
					value="";
				}
		
				arr[i-1][j]=value;
				System.out.println(arr[i-1][j]);
			}
			System.out.println("*************");
		}
		
		
		wb.close();
	}

}
