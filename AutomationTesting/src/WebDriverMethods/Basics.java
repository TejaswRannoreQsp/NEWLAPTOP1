package WebDriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		 
		String title = driver.getTitle();
		System.out.println(title);
		 System.out.println( driver.getCurrentUrl());
//		 System.out.println(driver.getPageSource());
//		 driver.close();
		String windoeID = driver.getWindowHandle();
		System.out.println(windoeID);
driver.quit();
	}

	}


