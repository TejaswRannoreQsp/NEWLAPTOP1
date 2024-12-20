package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicsOfTestNg {
	@Test(priority = -2,enabled = false)
	public void Zomato() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Reporter.log("Zomoto is launched",true);
		driver.quit();
	}
	@Test(priority = 5,enabled = false)
	public void Swiggy() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Reporter.log("Swiggy is launched",true);
		driver.quit();
	}
	
	@Test(priority = 2)
	public void Olafoods() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.olacabs.com/");
		Reporter.log("ola is launched",true);
		driver.quit();
	}
	@Test(priority = -2,dependsOnMethods = "Olafoods",enabled = false)
	public void Dominos() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/");
		Reporter.log("dominos is launched",true);
		driver.quit();
	}
	


}
