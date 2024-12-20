package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickNHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Actions a=new Actions(driver);
		
		//passing text into pwd textfield
		driver.findElement(By.id("password")).sendKeys("Wednesday");
		
		//1st approach of identifying the eyecon
//		WebElement eye = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
//		a.clickAndHold(eye).perform();
		
		//2nd Approach using moveoffset 
		a.moveByOffset(1182, 213).clickAndHold().perform();
		
		//closing the browser
		driver.quit();
		

	}

}
