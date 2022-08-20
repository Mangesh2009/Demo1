package Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tuto1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\External Download\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement wb=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select sel= new Select(wb);
		sel.selectByIndex(30);
	
		

	}

}

