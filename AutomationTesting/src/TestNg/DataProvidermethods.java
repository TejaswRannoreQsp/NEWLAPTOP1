package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidermethods {
	@Test(dataProvider = "insta")
	public void senddata(String user,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement username = driver.findElement(By.name("username"));
		WebElement pwd = driver.findElement(By.name("password"));
		username.sendKeys(user);
		pwd.sendKeys(password);
		driver.quit();
	}
	@DataProvider(name="insta")
	 public String[][] credentials(){
		String[][] data={
		{"laylakshmi","jaya@123"},
		{"nitika","Niki@123"},
		{"lavanya","lav@123"},
		{"poorinam","porni@123"}
		
		
		
		
	};
		return data;
	

}

}
