package dataDrivernTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomData {

	@DataProvider(name = "testdata1") // DataProvider is used to achieve datadriventest by running multiple set of
										// data multiple times
	public Object testData() {
		// Two dimensional array with 4 rows and 2 columns
		Object data[][] = { { "Sanju", "pswd1234" }, { "Susila", "test123" }, { "Admin", "admin123" },
				{ "Raam", "raamsub3" } };
		return data;
	}

	@DataProvider(name="ExcelData")
	public Object[][] fileData()
	{
		XSSFWorkbook wb;
		Object data[][]=null;
		File f1=new File("./" + "\\TestData\\Data.xlsx"); // Data.xlsx is the file in TestData folder
		FileInputStream fs;
		try {
			fs=new FileInputStream(f1);   //surround with try-catch
			// Workbook-->Sheet-->row--->cell-->data
			wb=new XSSFWorkbook(fs);      //Add catch-clause to surrounding & writing the code inside the try-catch block to avoiud error
			
			// Number of rows
			int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
			System.out.println("Number of rows are :" +rows);

			// Number of cells
			int cells = wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of columns: " +cells);

			// Create array as per file size
			data= new Object[rows-1][cells]; // rows-1 --> because we dont need heading

			// read data from file and save it in array
			for (int r=1;r<rows;r++) // r<rows - index value 4
			{
				for (int c=0;c<cells;c++) {
					data[r-1][c] = wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
					System.out.println(data[r-1][c]);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;
	
	}
}
