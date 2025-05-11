package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class CakeNut_Excelutils {
		
			public static int getRowcount(String xl,String Sheet) //obj not required 
			{
				try
				{
					FileInputStream fi=new FileInputStream(xl);
					XSSFWorkbook wb=new XSSFWorkbook(fi);
					return wb.getSheet(Sheet).getLastRowNum();//to count the no of rows and return the value(test cls )
					
				}
				catch(Exception e)
				{
					return 0; //return a default value when an error occurred
				}
			}

			public static String getCellValString(String xl,String Sheet,int r,int c)
			{
				try
				{
					FileInputStream fi=new FileInputStream(xl);
					XSSFWorkbook wb=new XSSFWorkbook(fi);
					XSSFCell cell=wb.getSheet(Sheet).getRow(r).getCell(c); //locate cell
					if(cell.getCellType()==CellType.STRING)
					{
						return cell.getStringCellValue();
					}
					else
					{
						
						return cell.getRawValue();
					}
				}
				catch(Exception e)
				{
					return "";
				}
			}


			public static String setCellValue(String xl, String Sheet, int r, String expurl, String acturl)
			{ 
			    try
			    {
			        FileInputStream fi = new FileInputStream(xl);
			        XSSFWorkbook wb = new XSSFWorkbook(fi);
			        XSSFCell cell = wb.getSheet(Sheet).getRow(r).createCell(2);
			        
			        String result;
			        if (expurl.equals(acturl))
			        {
			            cell.setCellValue("pass");
			            result = "pass";
			        }
			        else
			        {
			            cell.setCellValue("fail");
			            result = "fail";
			        }

			        

			        FileOutputStream outputStream = new FileOutputStream(xl); 
			        wb.write(outputStream);
			       
			        wb.close();
			        return result;
			    }
			    catch (Exception e)
			    {
			    
			        return "";
			    }
			}

	}
