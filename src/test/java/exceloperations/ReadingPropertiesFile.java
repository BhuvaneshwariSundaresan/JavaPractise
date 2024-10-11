package exceloperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//loading properties file
		Properties obj=new Properties();
		obj.load(file);
		
		//Read the data
		String url=obj.getProperty("appurl");
		String email=obj.getProperty("email");
		
		System.out.println("URL:"+url+" & email:"+email);
		
		//Reading only the keys
		
		Set<String> key1=obj.stringPropertyNames();
		System.out.println("Keys:"+key1);
		
		Set<Object> key2=obj.keySet();
		System.out.println("Keys:"+key2);
	}

}
