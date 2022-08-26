package sampleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.saucedemo.com/");
		driver.navigate().to("https://www.saucedemo.com/");
		//title of the page 
		//URl
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
//		int a = 10;
		//<div or <input or <form or <button  -- tag
		
		//class or name or id or placeHolder -- attribute
		
		//"user-name" or "userName"  -- Value
		
		//class, name, id, xpath - Absolute xpath, Relative xpath 
		// Absolute xpath - / and start from top(root node)
		// //tagName[@Attribute = 'attributeValue']
		//cssSelector, tagName, linkText, partialLinkText
		
		WebElement userNamesHeader = driver.findElement(By.xpath("//div[@id = 'login_credentials']/h4"));
		
		String header = userNamesHeader.getText();
		
		System.out.println(header);
		
		WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id = 'user-name']"));
		
		userNameTextBox.sendKeys("standard_user");
		
		WebElement passwordTextBox = driver.findElement(By.name("password"));
		
		passwordTextBox.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.name("login-button"));
		
		loginButton.click();
		
		Thread.sleep(5000);
		
//		driver.navigate().refresh();
		
		driver.close();
//		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
