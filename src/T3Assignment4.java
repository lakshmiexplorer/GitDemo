import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationTesting\\SeleniumAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
        // click on get text link
		driver.findElement(By.cssSelector(".example a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> windowNames = windows.iterator();
		String parent = windowNames.next();
		String child = windowNames.next();
		// switch to child window
		driver.switchTo().window(child);
		//print child window text
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		
		//switch back to parent window
		driver.switchTo().window(parent);
		//print parent window text
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		
	}

}
