package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectMAthod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		//converting for comparison
		Rectangle emailtextfield = email.getRect();
		Rectangle pwdtextfield = pwd.getRect();
		//printing the x-value
		System.out.println(emailtextfield.getX());
		System.out.println(pwdtextfield.getX());
		//Comparing
		if(emailtextfield.getX()==pwdtextfield.getX()) {
			System.out.println("x-coordinates of both textfield are same");
		}else
			System.out.println("x-coordinates of both textfield are not same");

	}

}
