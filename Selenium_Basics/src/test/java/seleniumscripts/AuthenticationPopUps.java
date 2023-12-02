package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUps {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// https://the-internet.herokuapp.com/basic_auth

		// https://username:password@url-path

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		Thread.sleep(5000);

		driver.close();
	}

}