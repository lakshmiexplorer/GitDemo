import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2WindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationTesting\\SeleniumAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        // click on the top right link
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
	    // get windows/tabs opened ny selenium
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(parent);
		String childPageText = driver.findElement(By.cssSelector(".im-para.red")).getText();
		String email = childPageText.split("at")[1].trim().split(" ")[0];
		
		
		
	}

}
