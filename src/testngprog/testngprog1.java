package testngprog;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testngprog1 {

	@test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejnair\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.ca");
	}
}
