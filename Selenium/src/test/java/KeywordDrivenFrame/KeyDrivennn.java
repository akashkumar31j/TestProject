package KeywordDrivenFrame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KeyDrivennn {
	public static void main(String[] args) throws Exception {
		FileInputStream fis= new FileInputStream("C:\\Users\\Admin\\Desktop\\Excel\\Newexcel.xlsx");
		XSSFWorkbook wrbk= new XSSFWorkbook(fis);
		XSSFSheet sheet= wrbk.getSheet("Sheet1");
XSSFRow row= sheet.getRow(0);

	}

}
