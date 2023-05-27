package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ChromeOptions;
public class ChromeHeadless {
	WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webbdriver.chrome.driver", "\"C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
ChromeOptions co= new ChromeOptions();
co.addArguments("headless");
// OR
//co.setHeadless(true);
WebDriver driver= new ChromeDriver(co);
driver.get("https://www.rediff.com");
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
	}

}
