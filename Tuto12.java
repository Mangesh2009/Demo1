package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuto12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\External Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/softtech/Softech%20Class/Automation/selenium/New%20folder/frame.html");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Selenium");
		Thread.sleep(4000);
		driver.switchTo().frame("mainframe");
		
		driver.findElement(By.id("add")).sendKeys("Pune");
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.findElement(By.id("name")).clear();
	}

}
