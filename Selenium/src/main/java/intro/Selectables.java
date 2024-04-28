package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selectables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\Eclipse Workspace\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/selectable");
		List<WebElement>list = driver.findElements(By.xpath("//*[@id='selectable']"));
		System.out.println(list.get(1).getText());
		Actions action = new Actions(driver);
		action.clickAndHold(list.get(1));
		action.clickAndHold(list.get(2));
		action.clickAndHold(list.get(3));
		action.



	}

}
