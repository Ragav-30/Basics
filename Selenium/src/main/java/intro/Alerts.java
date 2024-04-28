package intro;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\Eclipse Workspace\\Selenium\\Drivers\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://letcode.in/alert");
		   driver.findElement(By.id("accept")).click();
		   Thread.sleep(3000);
		   driver.switchTo().alert().accept();
		   Thread.sleep(3000);
		  driver.quit();
		  
		   
	}

}
