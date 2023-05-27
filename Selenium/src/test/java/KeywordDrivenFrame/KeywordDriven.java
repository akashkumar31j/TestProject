package KeywordDrivenFrame;
import org.openqa.selenium.chrome.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
 class AccessFromExcel{
	WebDriver driver;
	
	public void browseropen_maximize()
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
		driver= new ChromeDriver();
	/*}
	public void browseropen_maximize()
	 {*/
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
	 }
	public void userid()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	}
	public void password()
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}
	
	public void login()
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	//KeywordDriven kd= new KeywordDriven();
	public void logout() throws Throwable
	{
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
public class KeywordDriven{
public static void main(String[] args) throws Throwable {
	AccessFromExcel afe= new AccessFromExcel();
	FileInputStream fis= new FileInputStream("C:\\Users\\Admin\\Desktop\\Excel\\KeyDriven.xlsx");
	XSSFWorkbook wrbk= new XSSFWorkbook(fis);
	XSSFSheet sheet= wrbk.getSheet("Sheet1");
	//int row= sheet.getLastRowNum();
	for(int r=1;r<6;r++)
	{
		XSSFRow rowall=sheet.getRow(r);
		String keyword= sheet.getRow(r).getCell(1).getStringCellValue();
		
		if(keyword.equals("Y"))
		{
			
		String key= sheet.getRow(r).getCell(0).getStringCellValue();
			if(key.equals("browseropen_maximize"))
			{
				
				afe.browseropen_maximize();
			}
		  else if(key.contains("userid"))
		{
			  Thread.sleep(5000);
			afe.userid();
		}
		else if(key.equals("password"))
		{
			Thread.sleep(5000);
			afe.password();
		}
		else if(key.equals("login"))
		{
			Thread.sleep(5000);
			afe.login();
		}
		else if(key.equalsIgnoreCase("Logout"))
		{
			Thread.sleep(4000);
			afe.logout();
		}
			
		}		
}
}
}