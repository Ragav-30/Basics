package intro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\Eclipse Workspace\\Selenium\\Drivers\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().fullscreen();
		   driver.get("https://letcode.in/frame");
		    
		  
		   driver.switchTo().frame(0);
		  
		   driver.findElement(By.name("fname")).sendKeys("ragav");
		   driver.findElement(By.name("lname")).sendKeys("r");
		   WebElement fr=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		   driver.switchTo().frame(fr);
		   driver.findElement(By.name("email")).sendKeys("mail");
		   
		 /*  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/app-root/app-main/section[2]/div[1]/div[1]/div[1]/div/div/a")).click();
		   Thread.sleep(3000);
		   System.out.println("hello"); */
		   driver.quit();
	} 
}
