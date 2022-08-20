package Selenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuto2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\External Download\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
String x=driver.getTitle();
System.out.println(x);
char[] a=x.toCharArray();

for(int i=a.length-1;i>=0;i--)
{
	System.out.println(a[i]);
}
driver.close();
}

}
