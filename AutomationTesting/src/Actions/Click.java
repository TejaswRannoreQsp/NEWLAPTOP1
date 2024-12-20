package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		//creating object for actions class
		Actions a=new Actions(driver);
		
		//1st Approach with non parametrized method
		//a.click().perform();
		
		//2nd approach with parametrized method
		WebElement click = driver.findElement(By.xpath("(//input[@value=\"I'm Feeling Lucky\"])[2]"));
		a.click(click).perform();

	}

}
