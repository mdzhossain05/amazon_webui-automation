package sampleSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		
		hp.signInButton().click();
//		WebElement signButton = driver.findElement(By.xpath("//*[@class='login']"));
//		signButton.click();
		
		lp.insertEmailAddress().sendKeys("automationClass3@gmail.com");
//		WebElement createEmailTextbox = driver.findElement(By.id("email_create"));
//		createEmailTextbox.sendKeys("automationClass3@gmail.com");
		
		lp.createAccountButton().click();
//		WebElement createButton = driver.findElement(By.id("SubmitCreate"));
//		createButton.click();
		
		
		//implicite wait -- it's for all the webelement
		
		//explicite wait -- it's for a specific webelement
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
		
		Thread.sleep(5000);
		
		WebElement title = driver.findElement(By.id("id_gender1"));
		title.click();
		
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("firstName");
		
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys("lastName");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("1234567890");
		
		WebElement day = driver.findElement(By.id("days"));
		Select daySel = new Select(day);
		daySel.selectByValue("20");
		
		WebElement month = driver.findElement(By.id("months"));
		Select monSel = new Select (month);
		monSel.selectByValue("6");
		
		WebElement year = driver.findElement(By.id("years"));
		Select yearSel = new Select(year);
		yearSel.selectByValue("1990");
		
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("101 anything street");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Vienna");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select stateSel = new Select(state);
		stateSel.selectByVisibleText("Virginia");
		
		WebElement zip = driver.findElement(By.id("postcode"));
		zip.sendKeys("22222");
		
		WebElement phone = driver.findElement(By.id("phone_mobile"));
		phone.sendKeys("215421156");
		
//		WebElement registerButton = driver.findElement(By.id("submitAccount"));
//		registerButton.click();
//		
//		WebElement userName = driver.findElement(By.xpath("//*[@class='account']/span"));
//		String actualUserNameText = userName.getText();
//		System.out.println(actualUserNameText);
//		String expectedUserNameText = "firstName lastName";
//		
//		if(actualUserNameText.equals(expectedUserNameText)) {
//			System.out.println("User name is matching - test passed");
//		}else {
//			System.out.println("User name is not matching - test failed");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
