package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Cric 
{

	public static void main(String[] args)  throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		WebElement w= driver.findElement(By.id("cb-qck-navbar"));
		List<WebElement> wlist=w.findElements(By.tagName("a"));
		for(int i=0;i<wlist.size();i++)
		{
			if(i==1)
			{
				wlist.get(i).click();
			}
			else
			{
				System.out.println("UDAYBHAVANI");
			}
		}
				
	}
	}