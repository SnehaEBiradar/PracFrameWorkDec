package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//img[@class='gb_oa gb_la']")
	private WebElement acct;
	
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement so;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setname()
	{
		acct.click();
	}
	public void setout()
	{
		so.click();
	}
}
