package pageobjectmodel;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;
public class PageMethod2 {
	WebDriver driver;
	@FindBy(how=How.NAME,using="username" ) 
	WebElement userid;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	WebElement drop;
    @FindBy(linkText="Logout")
    WebElement logout;
    public PageMethod2(WebDriver d)
    {
    	driver=d;
    	PageFactory.initElements(d, this);//additional method
    }
    
	public void enteruser_pass(String user,String password) throws InterruptedException
    {
    	userid.sendKeys(user);
    //}
    //public void enterpass(String password)
    //{
    	Thread.sleep(2000);
    	pass.sendKeys(password);
    }
    public void login()
    {
    	login.click();
    }
    public void logout() throws InterruptedException
    {
    	drop.click();
    	Thread.sleep(1000);
    	logout.click();
    }

	
		
	}
	


