import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6Assignmet5Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationTesting\\SeleniumAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		// switch to parent frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("frameset[name='frameset-middle']")));
		// switch to child frame using index
		driver.switchTo().frame(1);
		

	}

}
