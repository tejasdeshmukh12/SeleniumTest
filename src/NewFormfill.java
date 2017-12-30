import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewFormfill {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://crm.techcanvass.co.in/");
		driver.findElement(By.id("btnlogin")).click();
		WebElement userNameTxtBox = driver.findElement(By.name("txtuname"));
		userNameTxtBox.clear();
		userNameTxtBox.sendKeys("techcanvassacademy@techcanvass.co.in");
		driver.findElement(By.id("txtpwd")).sendKeys("abhishek1234");
		driver.findElement(By.id("loginbtn")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//a[@class='btn btn-success'][contains(text(),'Admission')]");
	//	driver.findElement(By.cssSelector("#ct100_ContentPalceHolder_lnkbtnNewAdmission"));
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_lnknewlead")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtfnamesimple")).sendKeys("Akshay");
		driver.findElement(By.id("//td[@class='//*[@id=\"ctl00_ContentPlaceHolder1_txtlnamesimple\"]")).sendKeys("Kumar");;
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtmobilesimple")).sendKeys("9871234561");
				
		String[] expResult = {"Logout", "Add lead", "New Admission", "Receipt Payment"};
		for (String string : expResult) {
			System.out.println("Expected Result Button :" + string);
			
			List<WebElement> allButtons = driver.findElements(By.cssSelector(selector("a[class='btn btn-success']")));
			for (WebElement webElement : allButtons) {
				System.out.println("Actual Result : " + webElement.getText());
				
			}
			for (int i = 0; i<expResult.length; i++) {
				boolean condition = expResult[i].equals(allButtons.get(i).getText());
				if (condition == true) {
					System.out.println("Validation successful for button --> " + allButtons.get(i).getText());
				}
				else {
					System.out.println("Validation Failed for button -->" + allButtons.get(i).getText());
				}
				
			}
			
		}
	}

	private static String selector(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
