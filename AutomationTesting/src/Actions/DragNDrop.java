package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trello.com/");
		Actions a=new Actions(driver);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("tejaswisrao1306@gmail.com");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("Tejaswi@123");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[text()='automation']")).click();
		WebElement src = driver.findElement(By.linkText("online"));
		WebElement dest = driver.findElement(By.xpath("//h2[text()='dragn drop']/../../..//button[text()='Add a card']"));
		a.dragAndDrop(src, dest).perform();
	}

}
