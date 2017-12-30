import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyncExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://crm.techcanvass.co,in/");

		driver.findElement(By.xpath("//a[@class='btn dropdown-toggle']")).click();
		WebElement userNameTxtBox = driver.findElement(By.xpath("//input[@type='text'][@placeholder='Enter Username ']"));
		
		userNameTxtBox.clear();
		userNameTxtBox.sendKeys("techcanvassacademy@techcanvass.co,in");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abhishek1234");
		driver.findElement(By.xpath("//input[@type='submit'][@class='btn btn-danger caption'][@value='Login']")).click();
		
		
		
	}

}
