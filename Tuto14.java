package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tuto14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\External Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/softtech/Softech%20Class/Automation/selenium/New%20folder/frame.html");
		Thread.sleep(3000);
		
		WebElement wb=driver.findElement(By.id("name"));
		wb.sendKeys("Mangesh");
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainframe");
		WebElement wc=driver.findElement(By.id("mainframe"));
		wc.sendKeys("shrigonda");
		Thread.sleep(3000);
		
		driver.switchTo().frame(1);
		List<WebElement> ls=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement abc: ls)
		{
			abc.click();
			System.out.println(abc.isSelected());
			Thread.sleep(3000);
			driver.switchTo().frame(2);
			WebElement wa=driver.findElement(By.id("course"));
			Select sel=new Select(wa);
			sel.selectByValue("9");
			WebElement wd=sel.getFirstSelectedOption();
			System.out.println(wd.getText());
			
		}
	}

}
