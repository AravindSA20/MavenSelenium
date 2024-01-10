package dataDrivernTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// adding * to import every XSSF from apache.poi
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
//Create a folder TestData in the project and open the location of the folder in system to create an excel file where data is stored
public class ExcelDataRead {
  @DataProvider(name="ExcelData")
  public void dataRead() throws IOException 
  {
	  File f1=new File("./"+"\\TestData\\Data.xlsx");   //Data.xlsx is the file in TestData folder
      FileInputStream fs= new FileInputStream(f1);
      
      //Workbook-->Sheet-->row--->cell-->data
      XSSFWorkbook wb=new XSSFWorkbook(fs);  //Importing XSSFWorkbook from apache.poi and adding throws declaration for constructor
       
      //Number of rows
      int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
      System.out.println("Number of rows are :"+rows);
      
      //Number of cells
      int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
      System.out.println("Number of columns: "+cells);
      
      //Create array as per file size
      Object data[][]=new Object[rows-1][cells];   //rows-1 --> because we dont need heading 
      
      //read data from file and save it in array
      for(int r=1;r<rows;r++)     //r<rows - index value 4
      {
    	  for(int c=0;c<cells;c++)
    	  {
    		  data[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
    		  System.out.println(data[r-1][c]);
    	  }
      }
      
      //Reads single entry
//      String value=wb.getSheet("userdata").getRow(4).getCell(0).getStringCellValue(); // row and column index value starts from 0
//      System.out.println(value);
      
      /* //Single record
      XSSFSheet sheet1=wb.getSheet("userdata");    //userdata is the name of the sheet in excelfile
      XSSFRow row1=sheet1.getRow(1);  //getRow(0) is not taken because it is heading, we need only data
      XSSFCell cell1=row1.getCell(0);
      String value=cell1.getStringCellValue();
      System.out.println(value);
      */
  }
}
