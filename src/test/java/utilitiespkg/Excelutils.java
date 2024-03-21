package utilitiespkg;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	public static String getCellValue(String x1,String Sheet,int r,int c)
	
	{
		try
		{
			FileInputStream fi=new FileInputStream(x1);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			
			XSSFCell cell=wb.getSheet(Sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				 return cell.getStringCellValue();
			}
			else
			{
			//	double v=cell.getNumericCellValue();
			//	int val=(int)v;
			//	return String.valueOf(val);
				return cell.getRawValue();
				
			}
		}
		catch (Exception e)
		{
			return"";
			
		}
	}
      public static int getRowCount(String x1, String Sheet)
      {
    	  try
    	  {
    		  FileInputStream fi=new FileInputStream(x1);
    		  XSSWorkbook wb=new XSSWorkbook(fi);
    		  
    		  return wb.getSheet(Sheet).getLastRowNum();
    		  
    	  }
    	  catch(Exception e)
    	  {
    		  return 0;
    	  }
      }
}
