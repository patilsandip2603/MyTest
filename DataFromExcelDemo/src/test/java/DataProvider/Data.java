package DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class Data 
{
	@Test(dataProvider = "CredentialsSupplier",invocationCount = 2)
	public void loginTest(String username,String password)
	{
		
		System.out.println(username+ "--------" + password);
		System.out.println();
	}
	
	@DataProvider(name="CredentialsSupplier")
	public Object[][] datasupplier() throws IOException
	{
	//	File excelFile = new File(System.getProperty("user.dir") + "\\TestData.xlsx"); 
	    String excelFile = "C:\\Users\\Swami\\eclipse-workspace\\DataFromExcelDemo\\TestData.xlsx";
	    FileInputStream fis = new FileInputStream(excelFile);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis); 
	    
	    XSSFSheet sheet = workbook.getSheet("Login");
	    
	    int rowcount = sheet.getLastRowNum();
	    int columncount = sheet.getRow(0).getLastCellNum();
	    
	    Object[][] data = new Object[rowcount][columncount];
	    
	    for(int r=0;r<rowcount;r++)
	    {
	       XSSFRow row = sheet.getRow(r+1);
	       for(int c=0;c<columncount;c++)
	       {
	    	      XSSFCell cell = row.getCell(c);
	    	      
	    	       CellType cellType = cell.getCellType();
	    	       
	    	     
	    	       	switch(cellType)
	    	       	{
	    	       		case STRING:
	    	       		data[r][c] = cell.getStringCellValue();
	    	       		break;
	    	       		
	    	       		case NUMERIC:
	    	       		data[r][c] = Integer.toString((int)cell.getNumericCellValue());
	    	       		break;
	    	       		
	    	       		case BOOLEAN:
	    	       			data[r][c] = cell.getBooleanCellValue();
	    	       			break;
	    	       		
	    	       	}	
	       }
	    		
	    
	    }
	    return data;
	}
	
	
		
}

