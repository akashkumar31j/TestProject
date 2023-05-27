package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ak {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cricinfo.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println("pagetitle=  "+driver.getTitle());
	String expectedtitle="Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo";
    String actualtitle= driver.getTitle();
    if(actualtitle.equals(expectedtitle))
    {
    	System.out.println("tile is true");
    }
    else
    {
    	System.out.println("title is fail");
    }
	System.out.println("current url=   "+driver.getCurrentUrl());
	String expcurl="https://www.espncricinfo.com/";
	String actcurl=driver.getCurrentUrl();
	if(actcurl.equals(expcurl))
	{
    System.out.println("correct url");
	}
	else
	{
		System.out.println("incorrect url");
	}
	}
}
