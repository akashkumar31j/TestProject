package Assertions;
//import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Assertions{ 
	//String actual;
	//String expected;
	public static void main(String[] args) {
		Assertions a= new Assertions();
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		String actual= driver.getTitle();
		String expected= "instagram/idmm";
		SoftAssert sa= new SoftAssert();
		//sa.assertNotEquals(actual, expected);
		sa.assertNotNull(true);
		System.out.println(driver.getTitle());
		
		driver.close();
		sa.assertAll();
	    
	}

	
	
	
}
