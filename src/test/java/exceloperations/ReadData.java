package exceloperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReadData {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");	// alternative -workbook.getSheetAt(0);
		
		int noOfRows=sheet.getLastRowNum();
		
		int TotalCells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("No of Rows - "+noOfRows+"\t"+"No of Cells - "+TotalCells);
		
		//Matches Java's Zero-Based Indexing: This approach aligns with Java’s zero-based indexing 
		//for arrays and collections, ensuring consistency and reducing the likelihood of errors.
		for(int r=0;r<=noOfRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<TotalCells;c++)
			{
				XSSFCell cellData=currentRow.getCell(c);
				System.out.print(cellData.toString()+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();	
	}

}
