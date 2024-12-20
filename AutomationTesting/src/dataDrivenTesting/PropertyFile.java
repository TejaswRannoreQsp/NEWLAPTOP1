package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		//path of the file
		FileInputStream fis=new FileInputStream(".\\TestData\\testdata.properties");
		
		//creating an object of property file
		Properties prop=new Properties();
		
		//loading the values
		prop.load(fis);
		
		//fetch the values
		String url = prop.getProperty("URL");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);

	}

}
