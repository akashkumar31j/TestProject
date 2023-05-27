package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class PageMethod1 {
WebDriver driver;
By username= By.name("username");
By password= By.name("password");
By login= By.xpath("//button[@type='submit']");
By drop= By.xpath("//span[@class='oxd-userdropdown-tab']");
By logout= By.linkText("Logout");
public PageMethod1(WebDriver d)
{
	//this.driver=d;
	//driver=d;
}
public void enteruser(String enteruser)
{
	driver.findElement(username).sendKeys(enteruser);
	
}
public void enterpassword(String enterpass)
{
	driver.findElement(password).sendKeys(enterpass);
}
public void clicklogin() throws InterruptedException
{
	driver.findElement(login).click();
	Thread.sleep(1000);
}
public void logout() throws Exception
{
	driver.findElement(drop).click();
	Thread.sleep(3000);
	driver.findElement(logout).click();
}
}
