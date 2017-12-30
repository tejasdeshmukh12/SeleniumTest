import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.quit();
		
		

	}

}
