package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuto3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\External Download\\chromedriver_win32\\chromedriver.exe");
		// to get title of face book & reverse it
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String x=driver.getTitle();
		System.out.println(x);
		char[] p=x.toCharArray();

		for(int i=p.length-1;i>=0;i--)
		{
			System.out.println(p[i]);
		}
		driver.close();
		}

		
	}
	
	
	
