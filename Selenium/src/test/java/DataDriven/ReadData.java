package DataDriven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ReadData{
	WebDriver driver;
	@BeforeTest
	public void app()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\\\\\\\selenium\\\\\\\\BrowserDrivers\\\\\\\\chromedriver.exe");
		 //driver = new ChromeDriver();	
		//driver.get("https://www.instagram.com"  );	
	}
	@Test
	public void inputstream() throws Exception
	{
		String excelinput= "C:\\Users\\Admin\\Desktop\\Excel\\Book1.xlsx";
		FileInputStream fis= new FileInputStream(excelinput);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
		int row= sheet.getLastRowNum();
		int cell= sheet.getRow(1).getLastCellNum();
		for(int i=0;i<=row;i++)
		{
			XSSFRow roww= sheet.getRow(i);
		for(int j=0;j<cell;j++)
		{
			XSSFCell celll=roww.getCell(j);
			switch(celll.getCellType())
			{
			case STRING:System.out.println(celll.getStringCellValue());break;
			case NUMERIC:System.out.println(celll.getNumericCellValue());break;
			case BOOLEAN:System.out.println(celll.getBooleanCellValue());
			//System.out.print(celll);
			System.out.print("   ");
		}
		//System.out.println();
			
		}
		
		}
		
	}
}
