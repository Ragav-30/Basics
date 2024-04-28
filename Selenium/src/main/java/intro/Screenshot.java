package intro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\Eclipse Workspace\\Selenium\\Drivers\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://letcode.in/buttons");
		   
		  File frstsrc = driver.getScreenshotAs(OutputType.FILE);
		  File f= new File("./snaps/img.png");
		  FileHandler.copy(frstsrc, f);
		  WebElement elemnt = driver.findElement(By.id("isDisabled"));
		  File f1=elemnt.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(f1, f);
		  
		  driver.quit();
		  
		  
}
}