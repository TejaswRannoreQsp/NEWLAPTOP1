package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=EAIaIQobChMItNHLr6_biQMVb8Y8Ah3ucCbSEAAYASAAEgIkAPD_BwE&gclsrc=aw.ds");
        driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
        driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Tejaswi S Rao\\Documents\\Tejaswi(NF21).pdf");
	}

}
