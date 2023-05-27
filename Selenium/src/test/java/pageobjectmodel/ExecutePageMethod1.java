package pageobjectmodel;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ExecutePageMethod1 {
WebDriver driver;
@Test
public void Test() throws Exception
{
	System.setProperty("webdriver.chrome.driver","c:\\selenium\\BrowserDrivers\\chromedriver.exe");
	driver= new ChromeDriver();
	//PageMethod1 pm1= new PageMethod1(driver);
	PageMethod2 pm2= new PageMethod2(driver);
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	FileInputStream fis= new FileInputStream("F:\\desktop\\Excel\\Book1.xlsx");
	XSSFWorkbook wrbk= new XSSFWorkbook(fis);
	XSSFSheet sht= wrbk.getSheetAt(0);
	XSSFRow r=sht.getRow(6);
	
	//method1
	//pm1.enteruser("Admin");
	//pm1.enterpassword("admin123");
	//pm1.clicklogin();
	//pm1.logout();//method1
	//method2 starts
	pm2.enteruser_pass(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());
	pm2.login();
	pm2.logout();
	
}
}
