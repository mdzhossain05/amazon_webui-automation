package sampleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver iDriver;
	
	public LoginPage(WebDriver driver) {
		iDriver = driver;
	}
	
	public WebElement insertEmailAddress() {
		WebElement createEmailTextbox = iDriver.findElement(By.id("email_create"));
		return createEmailTextbox;
	}
	
	public WebElement createAccountButton() {
		WebElement createButton = iDriver.findElement(By.id("SubmitCreate"));
		return createButton;
	}
	
	public WebElement loginEmailAddress() {
		WebElement loginEmailTextbox = iDriver.findElement(By.id("email"));
		return loginEmailTextbox;
	}
	
	public WebElement password() {
		WebElement passwordTextbox = iDriver.findElement(By.id("passwd"));
		return passwordTextbox;
	}
	
	public WebElement loginButton() {
		WebElement loginBtn = iDriver.findElement(By.id("SubmitLogin"));
		return loginBtn;
	}

}
