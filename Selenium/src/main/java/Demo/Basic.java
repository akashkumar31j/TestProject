package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Basic {

	public static void main(String[] args)  throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.instagram.com/");
		//System.out.println("AU");
		driver.manage().window().maximize();
		WebElement userid=driver.findElement(By.name("username"));
		userid.sendKeys("akashravivanshi0407");
	    Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Akash31*7%96");
		Thread.sleep(2000);
				WebElement login=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
				login.click();
				//Thread.sleep(2000);
			    WebElement clickmsg=driver.findElement(By.className("(//div[@style='transform: translateX(0px);'])[2]"));
				//System.out.println(clickmsg.size());*/
                List<WebElement> msg=clickmsg.findElements(By.tagName("div"));
                System.out.println(msg.size());
                for(int i=0;i<msg.size();i++)
                {
                	if(i==9)
                	{
                	msg.get(i).click();	
                	}
                	else
                	{
                		System.out.println("fail");
                	}
             //  WebElement notnow =driver.findElement(By.xpath("//div[@class='_ac8f']"));
                	
                }
                
	}
}

