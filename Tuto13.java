package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuto13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\External Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/softtech/Softech%20Class/Automation/selenium/New%20folder/frame.html");
		Thread.sleep(3000);
		WebElement wb=driver.findElement(By.id("name"));
		wb.sendKeys("selenium");
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainframe");
		WebElement wc=driver.findElement(By.id("add"));
		wc.sendKeys("shrigonda");
		Thread.sleep(3000);
		
		String a=wc.getAttribute("value");
		System.out.println(a);
		Thread.sleep(3000);
		wc.clear();
		Thread.sleep(3000);
		driver.close();
	}

}
