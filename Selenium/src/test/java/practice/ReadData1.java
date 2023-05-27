package practice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class ReadData1 {
WebDriver driver;
	@BeforeTest
	public void app()
	{
		System.setProperty("webdriver.chrome.drivetr","C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
	}
@Test
public void read_data() throws Exception
{
	String path="C:\\Users\\Admin\\Desktop\\Excel\\Book1.xlsx";
	FileInputStream fis = new FileInputStream(path);
	XSSFWorkbook wbk= new XSSFWorkbook(fis);
	XSSFSheet sheet= wbk.getSheet("Sheet2");
	int row=sheet.getLastRowNum();
	for(int r=1;r<=row;r++)
	{
		XSSFRow rowcount=sheet.getRow(r);
	for(int c=0;c<rowcount.getLastCellNum()-1;c++)
	{
		XSSFCell cellall= rowcount.getCell(c);
		//System.out.println(cellall);
		WebElement user= driver.findElement(By.id("email"));
		user.clear();
		user.sendKeys(rowcount.getCell(c).toString());
		WebElement pass = driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys(rowcount.getCell(c+1).toString());
		
	}	
}
}
}
