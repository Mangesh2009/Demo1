package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuto4 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\External Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement wb=driver.findElement(By.id("txtusername"));
		boolean p=wb.isDisplayed();
		System.out.println(p);
		boolean q=wb.isEnabled();
		System.out.println(q);
		if((p==true)&&(q==true))
		{
			wb.sendKeys("Admin");
			Thread.sleep(5000);
			wb.clear();
			Thread.sleep(2000);
			wb.sendKeys("Admin");
		}
		else {
			System.out.println("username text box is not displayed &in disabled condition");
		}
		WebElement xy=driver.findElement(By.id("txtPassword"));
		boolean r=xy.isDisplayed();
		System.out.println(r);
		boolean s=xy.isEnabled();
		System.out.println(s);
		if((r==true)&&(s==true))
		{
			xy.sendKeys("admin123");
			Thread.sleep(5000);
			xy.clear();
			Thread.sleep(3000);
			xy.sendKeys("admin123");
		}
		else {
			System.out.println("Password text box is not displayed &in disabled condition");
		}
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		String a=driver.getTitle();
		System.out.println(a);
		Thread.sleep(4000);
		String open=driver.getTitle();
		if(open.contains("HRM"))
		{
			System.out.println("test case is pass");
		
		}else
		{
			System.out.println("test case is fail");
		}
		Thread.sleep(5000);
		System.out.println();
		System.out.println("end of result");
		Thread.sleep(2000);
		
	}

}
