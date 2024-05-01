package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\Eclipse Workspace\\Selenium\\Drivers\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://letcode.in/buttons");
		  
		 //  driver.findElement(By.id("home")).click();
		  // Thread.sleep(3000);
		 //  driver.navigate().back();
		   WebElement hold= driver.findElement(By.id("isDisabled"));
		   driver.manage().window().maximize();
		  Point p = hold.getLocation();
		  int x=p.getX();
		  int y=p.getY();
		  
		   Actions action = new Actions(driver);
		   action.moveToLocation(x, y).build().perform();
		   action.clickAndHold(hold).build().perform();
		   
		   //stale element Exception --identified element does some action and getting back to the same page and working with same element doesn't work as we have to find the element again to work.
		   //Natural width==0 means the image is broken
	}

}
