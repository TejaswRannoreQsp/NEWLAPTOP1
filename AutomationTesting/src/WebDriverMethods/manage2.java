package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
//		Dimension Before = driver.manage().window().getSize();
//		System.out.println(Before);
		driver.manage().window().maximize();
//		Dimension After = driver.manage().window().getSize();
//		System.out.println(After);
		//setting the size of window
		driver.manage().window().setSize(new Dimension(500, 100));
		
		//setting the position of window
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		driver.manage().window().setPosition(new Point(300, 298));
		
		

	}

}
