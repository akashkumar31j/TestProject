// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
public class Akaa {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() throws IOException, InterruptedException {
    driver.get("https://mail.google.com/mail/u/0/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    TakesScreenshot ss= (TakesScreenshot)driver;
	  File file=ss.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file,new File("C:\\Users\\Admin\\Desktop\\ss\\cri.png"));

    driver.findElement(By.cssSelector(".aHS-bnw > .aio")).click();
   
    driver.findElement(By.cssSelector(".aHS-bnt > .aio")).click();
    
  }
}

