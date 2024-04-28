package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\Eclipse Workspace\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement drag = driver.findElement(By.id("form:conpnl_header"));
		Point p =drag.getLocation();
		int x=p.getX();
		int y =p.getY();
		System.out.println("x="+x+"y="+y); 
		
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(drag, x+20, y+20).build().perform();
		System.out.println("success");
	
		


	}
}
