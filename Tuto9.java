package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuto9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\External Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		WebElement wb=driver.findElement(By.name("classFrame"));
		driver.switchTo().frame(wb);
		Thread.sleep(3000);
		driver.findElement(By.linkText("org.openqa.selenium.devtools.idealized")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
