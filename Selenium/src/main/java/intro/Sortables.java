package intro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\Eclipse Workspace\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/sortable");
		driver.manage().window().maximize();
		List<WebElement>a= driver.findElements(By.xpath("//div[@id=\"sample-box1\"]"));
		System.out.println(a.size());
		WebElement from=a.get(2);
		WebElement to = a.get(0);
		JavascriptExecutor exe= (JavascriptExecutor)driver;
		exe.executeScript("window.scrollBy(0,350)");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Actions action= new Actions(driver);  
		action.clickAndHold(from);
		action.moveToElement(to);
		action.release(to);
		action.build().perform();
				
	}

}
