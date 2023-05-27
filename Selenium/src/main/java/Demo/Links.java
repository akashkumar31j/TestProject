package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Links {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\BrowserDrivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
List<WebElement>ylink=driver.findElements(By.tagName("a"));
//ylink.size();
System.out.println("total links="+ylink.size());
for(int i=0;i<ylink.size();i++)
{
	if(ylink.get(7).isDisplayed())
	{
		String lname= ylink.get(i).getText();
		ylink.get(i).click();
		String url=driver.getCurrentUrl();
		System.out.println("name="+url);
		driver.navigate().back();
		Thread.sleep(4000);
		ylink=driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
		//System.out.println(ylink.get(i).getText());
	//}
}
	}

}
