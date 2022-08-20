package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.ssl.SslContextOption;

public class Demopractice28 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\External Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		WebElement wb=driver.findElement(By.xpath("/html/body/div/main/div[4]/div[1]/a/img"));
		boolean a=wb.isDisplayed();
		System.out.println(a);
		boolean b=wb.isEnabled();
		System.out.println(b);
		String c=wb.getAttribute("href");
		wb.click();
		String d=driver.getTitle();
		if(d.contains("Selenium"))
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
