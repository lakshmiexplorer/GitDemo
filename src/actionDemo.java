import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationTesting\\SeleniumAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions obj = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
		WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		// move to element and fill string in capital letters
		
		obj.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello");
		// move to element using mouse
		obj.moveToElement(move).build().perform();

	}

}
