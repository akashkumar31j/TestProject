package DataDriven;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
public class WriteData {
	WebDriver driver;
	@Test
	public void writedatatoexcel() throws Exception
	{
		int k=0;
		String[] rc= {"akash","uday","kuppi","venky","prudvi","anirudh","pranay","abbu","shubum","siddhath","kranthi","suraj","kishan","roshan","surya"};
		//System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
		XSSFWorkbook wrbk= new XSSFWorkbook();
		XSSFSheet sheet= wrbk.createSheet("Sheet1");
		for(int r=0;r<3;r++)
		{
			XSSFRow createrow= sheet.createRow(r);
			for(int c=0;c<=4;c++)
			{
		
				createrow.createCell(c).setCellValue(rc[k]);;
		k++;
			}
		}
		File file = new File("C:\\Users\\Admin\\Desktop\\Excel\\Newexcel.xlsx");
		FileOutputStream fos= new FileOutputStream(file);
		wrbk.write(fos);
		
		
	}

}
