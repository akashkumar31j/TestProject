package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("wedriver.chrome.driver","C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
		driver.get("https://www.google.com");
	}
}
	


