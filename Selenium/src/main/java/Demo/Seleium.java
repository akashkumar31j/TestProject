package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.jointerritorialarmy.gov.in/");
		WebElement captcha=driver.findElement(By.cssSelector("[name=captchaVal]"));
		String cap =captcha.getAttribute("value");
		WebElement entercap=driver.findElement(By.cssSelector("[name=captcha]"));
		entercap.sendKeys(cap);
		WebElement submit=driver.findElement(By.cssSelector("[name=login]"));
	    submit.click();
	    Thread.sleep(6000);
		WebElement career=driver.findElement(By.xpath("//a[@title='Careers']"));
		career.click();
		
		
	//	Select st=new Select(career);
		//st.selectByIndex(1);
		//System.out.println("signin is enabled= "+career.isEnabled());
	}

}
