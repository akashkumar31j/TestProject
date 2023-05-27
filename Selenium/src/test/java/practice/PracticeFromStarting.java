package practice;
//import java.
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
public class PracticeFromStarting {
	WebDriver driver;
	WebElement firstname;
	WebElement l;
@BeforeTest
public void applaunch()
{
	driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.chromedriver","\"C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
	driver.navigate().to("https://demo.automationtesting.in/");
	//Dimension windowsize= new Dimension(2000,2000);
	driver.manage().window().maximize();
	//System.out.println(driver.manage().window().getSize());
	
}
@Test
public void singup()
{
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement signup= driver.findElement(By.cssSelector("#enterimg"));
signup.click();
firstname=driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
firstname.sendKeys("Akash");
driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("ravivanshi");
driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("14-8-407/ begumbazar, nchudi bazar nera to mch office");
driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("akash407@gmail.com");
driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9876543210");
driver.findElement(By.xpath("(//input[@ng-model='radiovalue'])[1]")).click();
WebElement checkbox=driver.findElement(By.id("checkbox1"));
checkbox.click();
//driver.findElement(By.xpath("//div[@id='msdd']/following-sibling::div/descendant::li[16]")).click();
driver.findElement(By.xpath("//select[@id='Skills']/child::option[39]")).click();
//driver.findElement(By.id("//span[@id='select2-country-container']")).click();
driver.findElement(By.xpath("//select[@id='yearbox']/child::option[82]")).click();
driver.findElement(By.xpath("(//select[@ng-init=monthbox=''])[5]/child::option[8]")).click();
driver.findElement(By.xpath("//select[@id='daybox']/child::option[32]")).click();
driver.findElement(By.id("firstpassword")).sendKeys("Akash@1234");
driver.findElement(By.id("secondpassword")).sendKeys("Akash@1234");
driver.findElement(By.id("submitbtn")).submit();

}
@AfterTest
public void appclose()
{
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
//driver.close();	
}
}
