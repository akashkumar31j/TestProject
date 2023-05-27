package Tables;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Tables{
	WebDriver driver;
	@BeforeTest
	public void applaunch()
	{
		driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\BrowserDrivers\\chromedriver.exe");
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
	}
	@Test(priority=0)
	public void row_coloum()
	{
		List<WebElement> row= driver.findElements(By.tagName("tr"));
		List<WebElement> column= driver.findElements(By.tagName("td"));
		System.out.println(row.size());
		System.out.println(column.size());
		
		
	}
	@Test(priority=1)
	public void row1()
	{
		//String a1= "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]";
		String a1="(//tr)[";
		String a2= "]/child::td[";
		String a3="]";
		//String="(//td[@class='rbi'])[1]";
		for(int i=2;i<=37;i++)
		{
			for(int j=1;j<=2;j++)
			{
				
			
			String r= driver.findElement(By.xpath(a1+(i)+a2+"       "+j+a3)).getText();
			System.out.print(r);
			System.out.print("        ");
			//System.out.println("-*------------------------------------*****--------------------------------------------*");
		
		}
			System.out.println();
			System.out.println("*-----*****------*");
				}
		for(int i=2;i<=37;i++)
		{
			for(int j=3;j<=4;j++)
			{
				
			
			String r= driver.findElement(By.xpath(a1+(i)+a2+"       "+j+a3)).getText();
			System.out.print(r);
			System.out.print("        ");
			//System.out.println("-*------------------------------------*****--------------------------------------------*");
		
		}
			System.out.println();
			System.out.println("*-----*****------*");
				}
		//System.out.println("-*------------------------------------*****--------------------------------------------*");

	}
		/*@Test
		public void ss() throws IOException
		{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Admin\\Pictures\\Screenshots7.png"));
		}*/
	
	@AfterTest
	public void appclose() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
}