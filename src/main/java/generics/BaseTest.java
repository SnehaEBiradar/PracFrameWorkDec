package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstants{
 public WebDriver driver;
	static 
	{
		System.setProperty(chrome_key, chrome_value);
	}
	
	@BeforeMethod
	public void openApp()
	{ driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(url);
	}
 @AfterMethod
 public void closeApp()
 {
	// driver.close();
 }
}

