package code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript {

	 @Test
	 public static void print() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium_jars\\browser_drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");		
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
	 }

}
