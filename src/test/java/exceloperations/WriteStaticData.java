package exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteStaticData {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writedata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("staticdata");
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("A");
		row1.createCell(1).setCellValue("B");
		row1.createCell(2).setCellValue("C");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("a");
		row2.createCell(1).setCellValue("b");
		row2.createCell(2).setCellValue("c");

		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("1");
		row3.createCell(1).setCellValue("2");
		row3.createCell(2).setCellValue("3");
		
		workbook.write(file);
		workbook.close();
		
	}
	

}
