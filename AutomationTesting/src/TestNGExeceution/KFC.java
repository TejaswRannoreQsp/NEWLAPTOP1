package TestNGExeceution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KFC {
	@Test(groups = "Integration")
	public void kfclaunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		Reporter.log("KFC page",true);
		driver.quit();
	}

}
