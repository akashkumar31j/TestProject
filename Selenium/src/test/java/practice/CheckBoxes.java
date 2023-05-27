package practice;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
public class CheckBoxes {
	WebDriver driver;
	WebElement radiobutton;
	 int checkboxclick0;
	 int checkboxclick1;
	 int checkboxclick2;
	 int checkboxclick3;
	 int checkboxclick4;
	 int checkboxclick5;
	@BeforeTest
	public void applaunch()
	{
		driver= new ChromeDriver();
		driver.navigate().to("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
	}
	@Test
public void checkbox()
{
List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));

for(int i=0;i<checkbox.size();i++)
{
	//if(i==0||i==1||i==2||i==3||i==4||i==5)
	//{
		WebElement checkboxclick0=driver.findElement(By.xpath("//input[@value='red']"));
	checkboxclick0.click();
	System.out.println(checkboxclick0.isSelected());
	WebElement checkboxclick1=driver.findElement(By.xpath("//input[@value='purple']"));
	checkboxclick1.click();
	checkboxclick1.isSelected();
	WebElement checkboxclick2=driver.findElement(By.xpath("//input[@value='yellow']"));
	checkboxclick2.click();
	checkboxclick2.isSelected();
	WebElement checkboxclick3=driver.findElement(By.xpath("//input[@value='green']"));
	checkboxclick3.click();
	checkboxclick3.isSelected();
	WebElement checkboxclick4=driver.findElement(By.xpath("//input[@value='blue']"));
	checkboxclick4.click();
	checkboxclick4.isSelected();
	WebElement checkboxclick5=driver.findElement(By.xpath("//input[@value='orange']"));
	checkboxclick5.click();
	checkboxclick5.isSelected();
	System.out.println("name of the checkbox is-"+checkbox.get(i).getAttribute("value"));
	//System.out.println(((WebElement) checkboxclick1).isSelected());
//}
}
System.out.println("total checkbox="+checkbox.size());


}
	@Test
	public void radiobutton()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1500)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		//WebElement radiobutton= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		//js.executeScript("arguments[0].scrollInView;",radiobutton);
		
		radiobutton.click();
		radiobutton.isEnabled();
			}
	@AfterTest
	public void appclose() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.close();
	}
}
