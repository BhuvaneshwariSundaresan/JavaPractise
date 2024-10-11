package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		
		//single file upload
		/*
		 * driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(
		 * "C:\\Personal\\Company.txt");
		 * 
		 * if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals(
		 * "Company.txt")) { System.out.println("file uploaded successfully"); } else {
		 * System.out.println("file Upload failed"); }
		 */
		
		//multiple file upload
		
		String file1="C:\\Personal\\Company.txt";
		String file2="C:\\Personal\\LogBook.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int noOfFileUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(noOfFileUploaded==2)
		{
			System.out.println("All Files Uploaded");
		}
		else
		{
			System.out.println("Upload Failed");
		}
		
		
	}

}
