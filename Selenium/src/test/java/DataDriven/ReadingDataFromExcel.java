package DataDriven;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ReadingDataFromExcel {
WebDriver driver;
@BeforeTest
public void launch()
{
	System.setProperty("webdriver.chrome.chromedriver", "C:\\\\\\\\selenium\\\\\\\\BrowserDrivers\\\\\\\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 driver.manage().window().maximize();
}
@Test
public void DataFromExcel() throws Exception
{
	String datasrc= "C:\\Users\\Admin\\Desktop\\Excel\\Book1.xlsx";
	FileInputStream fis= new FileInputStream(datasrc);
	XSSFWorkbook workbook= new XSSFWorkbook(fis);
	XSSFSheet sht= workbook.getSheet("Sheet2");
	int row= sht.getLastRowNum();
	System.out.println(row);
	//int cell= sht.getRow(row).getLastCellNum();
	for(int r=1;r<=row;r++)
	{
		XSSFRow rowall=sht.getRow(r);
		for(int c=0;c<(rowall.getLastCellNum())-1;c++)
		{
			//XSSFCell cellall= rowall.getCell(c);
			//Thread.sleep(3000);
			WebElement user =driver.findElement(By.id("email"));
			user.clear();
			user.sendKeys(rowall.getCell(c).getStringCellValue());
			//XSSFCell cellall1= rowall.getCell(c+1);
			//Thread.sleep(3000);
			WebElement password= driver.findElement(By.id("pass"));
			password.clear();
			password.sendKeys(rowall.getCell(c+1).getStringCellValue());
			//Thread.sleep(5000);
			//password.sendKeys(Keys.DELETE);
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("//button[@type='submit']")).click();
			//driver.navigate().refresh();
			Thread.sleep(4000);
						
		}
	}
	
	
}

}
