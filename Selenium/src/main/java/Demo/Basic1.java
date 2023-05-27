package Demo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Basic1 {

	public static void main(String[] args) throws InterruptedException {//throws InterruptedException  {
		//ChromeOptions co= new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//WebElement loginfb=driver.findElement(By.xpath("//button[@type='button']"));
		//loginfb.click();
		//Thread.sleep(4000);
		WebElement userid=driver.findElement(By.id("email"));
		userid.sendKeys("akashravivashi0407");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Akash31*7%96");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.name("login"));
		//password.sendKeys("8121529647");	
        login.click();
        Thread.sleep(10000);
       // WebElement confirm=driver.findElement(By.xpath("//button[text()='Confirm']"));
       // confirm.click();
        //Thread.sleep(6000);
        WebElement more=driver.findElement(By.xpath("(//a[@href=\"#\"])[4]"));
		more.click();
		Thread.sleep(6000);
		WebElement logout=driver.findElement(By.xpath("(//a[@href='#'])[8]"));
		logout.click();
		Thread.sleep(4000);
		driver.quit();

	}
	
	}

