package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\Eclipse Workspace\\Selenium\\Drivers\\chromedriver.exe");
	   ChromeDriver driver = new ChromeDriver();
       driver.get("https://letcode.in/");
       
       driver.findElement(By.linkText("Work-Space")).click();
       WebElement loc =driver.findElement(By.linkText("Edit"));
       Point p= loc.getLocation();
       System.out.println(p.getX());
       loc.click();
       driver.findElement(By.id("fullName")).sendKeys("hello");
       driver.findElement(By.id("join")).sendKeys("Hello");
       String s =driver.findElement(By.id("getMe")).getAttribute("value");
       System.out.println(s);
       driver.findElement(By.id("clearMe")).clear();
       boolean b = driver.findElement(By.id("noEdit")).isEnabled();
	   System.out.println(b);
	   String c = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
	   System.out.println(c);
	}
	

}
