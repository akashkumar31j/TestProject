package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lnk {
	public static void main(String[] args)  throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://github.com/venkatesh-bachina");
	driver.manage().window().maximize();
	/*
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[@class='text-bold flex-auto min-width-0'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@role='rowheader'])[3]/descendant::a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"repo-content-turbo-frame\"]/div/div/div[3]/div[3]/div/div[13]/div[2]/span/a")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//a[@href=\"/Venkatesh-Bachina/Selenium-with-Java/blob/master/src/test/java/Links/Countoflinks.java\"]")).click(); */
	List<WebElement> tl=driver.findElements(By.tagName("a"));
	int count=0;
	for(int i=0;i<tl.size();i++)
	{
		if(tl.get(i).isDisplayed())
		{
			count++;
		}
			
	}
		System.out.println(tl.size());
		System.out.println(count);
		System.out.println("visible="+(	tl.size()-count));

	
		
	}
	
	}

	

