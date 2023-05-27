package practice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.*;
public class KeywordDriven {
	WebDriver driver;
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
	}
	public void entercredential_login()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	public void logout()
	{
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();  
		driver.close();
	}
public static void main(String[] args) throws Exception {
	KeywordDriven kd= new KeywordDriven();
	FileInputStream fis= new FileInputStream("C:\\Users\\Admin\\Documents\\orange.xlsx");
	XSSFWorkbook wrk= new XSSFWorkbook(fis);
	XSSFSheet sheeet=wrk.getSheet("sheet1");
	
	for(int r=1;r<4;r++)
	{
		XSSFRow row= sheeet.getRow(r);
		String ceel=row.getCell(1).getStringCellValue();
		
		if(ceel.equals("YES"))
		{
			String key= row.getCell(0).getStringCellValue();
			if(key.equals("openbrowser"))
			{
		     kd.openbrowser();
		      if(key.equalsIgnoreCase("ENTERCREDENTIAL_LOGIN"))
		     {
		    	  Thread.sleep(4000);
		    	kd.entercredential_login();
		      if(key.equals("logout"))
		      {
		    	  Thread.sleep(6000);
		    	  kd.logout();
		    	  
		      }
		}
		
		}
	}
}
}}
