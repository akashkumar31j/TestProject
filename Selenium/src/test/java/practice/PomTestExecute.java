package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomTestExecute {
	WebDriver driver;
	@Test
	public void login_logoutTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		PomPractice pp= new PomPractice(driver);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		for(int i=0;i<=i;i++)
		{
			for(int j=0;j<=j;j++)
			{
		pp.enteruser("Admin", "admin123");
		pp.enterlogin();
		Thread.sleep(3000);
		pp.clicklogout();
	}

}
	}
}
