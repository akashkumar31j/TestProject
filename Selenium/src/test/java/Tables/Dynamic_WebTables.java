package Tables;

	import java.io.File;
	import java.util.List;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.Test;
	public class Dynamic_WebTables {
		WebDriver driver;
		@BeforeTest
		public void applaunch()
		{
			driver= new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\BrowserDrivers\\chromedriver.exe");
			driver.get("https://www.5paisa.com/share-market-today/top-gainers-nse");
			driver.manage().window().maximize();
		}
		@Test
		public void WebTable()
		{
			String cn= "Kotak Mah. Bank";
			List<WebElement> companiesname=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			List<WebElement> days= driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
            //for(WebElement all: companiesname) {
			//System.out.println(companiesname.get(1).getText());
			System.out.println("COMPANY NAME"+"                       "+"DAYS VOLUME");
			for(int i=0;i<companiesname.size();i++)
			{
			//System.out.println(all.getText());
				if(cn.contains(companiesname.get(i).getText()))
				
					System.out.println(companiesname.get(i).getText()+"                       "+days.get(i).getText());
				
					}
			 
		}
}
