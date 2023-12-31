package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {

		// Step:1 Open the browser
		// Use Ctrl + Shift + O command to import required packages

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Enter the URL and open it

		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");

		// Inspect the element Username using ID locator and check if the textbox is
		// present or not

		boolean displayed = driver.findElement(By.id("wpName2")).isDisplayed();
		System.out.println("Element is Displayed ?" + displayed);

		// Inspect the ewlement Username using ID locator and check if the textbox is
		// enabled or not

		boolean enabled = driver.findElement(By.id("wpName2")).isEnabled();
		System.out.println("Element is Enabled ?" + enabled);

		// Enter the text in Username textbox

		driver.findElement(By.id("wpName2")).sendKeys("demouser");

		WebElement password = driver.findElement(By.id("wpPassword2"));

		displayed = password.isDisplayed();
		System.out.println("Element-password is Displayed ?" + displayed);

		enabled = password.isEnabled();
		System.out.println("Element-password is Enabled ?" + enabled);

		password.sendKeys("admin@1234");

		// driver.close();

		WebElement retypePassword = driver.findElement(By.name("retype"));

		retypePassword.sendKeys("admin@1234");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("admindemo@gmail123.com");
		
		Thread.sleep(5000);

		driver.navigate().to("https://www.redbus.in/");

		// with xpath locator

		driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("Mumbai");

		// cssselector : If you get ID as an attribute then you need to provide value
		// like "#src", "#firstname"

		//driver.findElement(By.cssSelector("#src")).sendKeys("Mumbai");

	}

}