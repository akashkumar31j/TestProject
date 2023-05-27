package MouseHoverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions a= new Actions(driver);
		Thread.sleep(2000);
        a.dragAndDrop(drag, drop).perform();
        driver.switchTo().defaultContent();
        WebElement sliderclick=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[11]/a"));
        sliderclick.click();
        Thread.sleep(1000);
    	driver.switchTo().frame(0);
    	Thread.sleep(2000);
        WebElement slide= driver.findElement(By.id("slider"));
        //Actions s =new Actions(driver);
        int source=slide.getLocation().x; 
        a.dragAndDropBy(slide,source,77).perform();
	}

}
