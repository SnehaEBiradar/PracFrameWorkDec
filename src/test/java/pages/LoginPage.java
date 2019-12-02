package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseTest;

public class LoginPage extends BaseTest
{
	@FindBy(id="identifierId")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement cl;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail()
	{
		email.sendKeys("sneha.e@testyantra.com");
	}
	public void setPassword()
	{
		pwd.sendKeys("Sneha@123");
	}
	
	public void click()
	{
		cl.click();
	}
	
	
	
	
}
