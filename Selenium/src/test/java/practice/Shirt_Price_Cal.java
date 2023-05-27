package practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Shirt_Price_Cal {
	WebDriver driver;
	@BeforeTest
	public void applauch()
	{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/s?k=shirt+for+men&sprefix=shirt%2Caps%2C278&ref=nb_sb_ss_ts-doa-p_1_5");
	driver.manage().window().maximize();
	}
	@Test
	public void shirts_price()
	{
		List<WebElement> shirtprice= driver.findElements(By.xpath("//img"));
		for(int i=0;i<shirtprice.size();i++)
		{
			System.out.println(shirtprice.get(i).getText());
			
		}
	
		
	}
}
