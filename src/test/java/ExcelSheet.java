import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\Admin\\eclipse-workspace\\MavenProjectBatch48\\TestData\\testdata.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(3);
		System.out.println(cell);
		XSSFRow row1=sheet.getRow(2);
		XSSFCell cell1=row1.getCell(1);
		System.out.println(cell1);
		//Row row = sheet.getRow(0);
		
		//Cell cell = row.getCell(0);
		
		//for(Row r : sheet)
		//{
			//for(Cell c : r)
			//{
				//System.out.println(c);
			//}
		//}
	}

}
