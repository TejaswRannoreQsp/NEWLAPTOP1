package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
