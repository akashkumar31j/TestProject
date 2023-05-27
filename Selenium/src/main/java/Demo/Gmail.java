package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Gmail {

	public static void main(String[] args) throws InterruptedException  {
		//ChromeOptions co= new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://accounts.google.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//driver.findElement(By.className("gb_h gbii")).click();
		//driver.findElement(By.xpath("text()='Add another account')")).click();
		WebElement userid=driver.findElement(By.name("identifier"));
		userid.sendKeys("amarchand207782@gmail.com");
		WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		//Thread.sleep(2000);
		//WebElement password=driver.findElement(By.name("password"));
		//password.sendKeys("7382805075");
		System.out.println("a");
	}
}