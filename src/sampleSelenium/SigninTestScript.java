package sampleSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninTestScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();

		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		
		hp.signInButton().click();
		
		lp.loginEmailAddress().sendKeys("automationClass2@gmail.com");
		lp.password().sendKeys("1234567890");
		lp.loginButton().click();
		
	}

}
