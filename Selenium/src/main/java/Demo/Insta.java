package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Insta {

	public static void main(String[] args)  throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.instagram.com/");
		//System.out.println("AU");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement userid=driver.findElement(By.name("username"));
		userid.sendKeys("akashravivanshi0407");
	    Thread.sleep(3000);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Akash31*7%96");
		Thread.sleep(4000);
		WebElement login=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		login.click();
		Thread.sleep(7000);
		WebElement msg=driver.findElement(By.xpath("//a[@href=\"/direct/inbox/?next=%2F\"]"));
		msg.click();
		Thread.sleep(3000);
		WebElement notification=driver.findElement(By.xpath("//button[text()='Not Now']"));
		notification.click();
		Thread.sleep(7000);
		WebElement ani=driver.findElement(By.xpath("//span[text()='Anirudh Sarda']"));
		ani.click();
		//Thread.sleep(1000);
		/*WebElement type=driver.findElement(By.xpath("//textarea[@placeholder='Message...']"));
		type.sendKeys("kya hua bhai recharge karo na ");
		Thread.sleep(2000);
		WebElement send=driver.findElement(By.xpath("(//div[@role='button'])[26]"));
		send.click();*/
		Thread.sleep(5000);
		WebElement more=driver.findElement(By.xpath("(//a[@href=\"#\"])[4]"));
		more.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("(//a[@href='#'])[8]"));
		logout.click();
		Thread.sleep(4000);
		driver.quit();
		
}
}