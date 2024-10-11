package exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;
//import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicData {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writedynamicdata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("dynamicdata");
		
		//Scanner sc=new Scanner(System.in);
		
		
		workbook.write(file);
		workbook.close();
		
	}
	

}
