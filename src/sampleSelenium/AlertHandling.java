package sampleSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		WebElement firstClickButton = driver.findElement(By.id("alertButton"));
//		firstClickButton.click();
		
//		WebElement thirdClickButton = driver.findElement(By.id("confirmButton"));
//		thirdClickButton.click();
		
		WebElement fourthClickButton = driver.findElement(By.id("promtButton"));
		fourthClickButton.click();
		// accept()
		// dismiss()
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		String alertMsg = alert.getText();//driver.switchTo().alert().getText();
		System.out.println(alertMsg);
		alert.sendKeys("Your Name");//driver.switchTo().alert().sendKeys("Your Name");
		alert.accept(); //driver.switchTo().alert().accept();
//		alert.dismiss(); //driver.switchTo().alert().dismiss();
		
	}

}
