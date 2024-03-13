package Generic_Scripts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel {
	public static String getData(String file_path,String Sheet_name,int ro,int c)
	{
		FileInputStream fis;
		Workbook book=null;
		try {
			fis= new FileInputStream("./Files/DDT.xlsx");
			book=WorkbookFactory.create(fis);
			
	}
		catch(Exception e)
		{
			System.out.println("File Not Found");
			e.printStackTrace();
		}
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(ro);
	            Cell cel = r.getCell(c);
	            String value = cel.toString();	
	            return value;
	}	


}
