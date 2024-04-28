package intro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\Eclipse Workspace\\Selenium\\Drivers\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://letcode.in/windows");
		   String parent= driver.getWindowHandle();
		   driver.findElement(By.id("home")).click();
		   Set<String> windows = driver.getWindowHandles();
		   for (String win : windows) {
			driver.switchTo().window(win);
		}
		   
		   driver.findElement(By.linkText("Edit")).click();
		   driver.close();
		   driver.switchTo().window(parent);
		   driver.findElement(By.id("multi")).click();
		   Set<String> multiplewin= driver.getWindowHandles();
		  // for (String str : multiplewin) {
		//	driver.switchTo().window(str);
	//	}   
		  int n= multiplewin.size();
		  System.out.println(n);
		   for (String str : multiplewin) {
			if(!(parent.equals(str))) {
				
				driver.switchTo().window(str);
				driver.close();
			}
		}
		  
		   
	}

}
