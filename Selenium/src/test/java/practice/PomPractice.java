package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPractice {
	WebDriver driver;
	PomPractice(WebDriver d)
	{
		driver =d;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(name="username")
	WebElement userid;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	WebElement drop;
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void enteruser(String user,String pass)
	{
		userid.clear();
		userid.sendKeys(user);
		pwd.clear();
		pwd.sendKeys(pass);
	}
	public void enterlogin()
	{
		login.click();
	}
	public void clicklogout() throws InterruptedException
	{
		drop.click();
		Thread.sleep(2000);
		logout.click();
	}
}
