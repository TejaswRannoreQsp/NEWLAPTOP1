package TestNGExeceution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class foodPanda {
	@Test(groups = "Functional")
	public void FoodPandalaunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foodpanda.com/");
		Reporter.log("FoodPanda page",true);
		driver.quit();
	}

}
