package Generic_Scripts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData_Excel {
	public static String getData(String sheet,int row,int cell)
	{
		String val="";
		
		try
		{
			FileInputStream fis= new FileInputStream("./Files/DDT.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
			Cell c= wb.getSheet(sheet).getRow(row).getCell(cell);
			val= c.toString();
			
			 
		}
		catch(Exception e)
		{
			System.out.println("Unable to fecth data");
		}
		return val;
		
	}

}
