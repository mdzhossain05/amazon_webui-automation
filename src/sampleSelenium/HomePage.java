package sampleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement signInButton() {
		WebElement signButton = driver.findElement(By.xpath("//*[@class='login']"));
		return signButton;
	}
	
	
}
