package Selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demopractice27 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\External Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt'])")).click();
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("selenium");
		Thread.sleep(4000);
		alt.accept();
		String a=driver.findElement(By.id("result")).getText();
		if(a.endsWith("selenium"))
		{
			System.out.println("test case is pass");
		}
		else {
			System.out.println("test case is fail");
		}
		Thread.sleep(4000);
		driver.quit();
		
	}

}
