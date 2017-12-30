
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://crm.techcanvass.co.in/");
		driver.findElement(By.id("btnlogin")).click();
		WebElement userNameTxtBox = driver.findElement(By.name("txtuname"));
		userNameTxtBox.clear();
		userNameTxtBox.sendKeys("techcanvassacademy@techcanvass.co.in");
		driver.findElement(By.id("txtpwd")).sendKeys("abhishek1234");
		driver.findElement(By.id("loginbtn")).click();
	//	driver.findElement(By.xpath("//a[@class='btn btn-success'][contains(text(),'Admission')]");
		driver.findElement(By.cssSelector("ct100_ContentPalceHolder_lnkbtnNewAdmission"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
				
			
				
		
	}

}
