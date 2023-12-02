package redbusProject.Testpages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import redbusProject.Base.TestBase;
import redbusProject.pages.Homepage;

//@Listeners(ItestListenerClass.class)
public class AccountPageTest extends TestBase {

	Homepage hp;

	@BeforeClass
	public void OpenApp() {

		openBrowser("Chrome");
		hp = new Homepage(driver);
	}

	@Test(priority = '1')
	public void clickOnSignUpPage() throws InterruptedException {

		Thread.sleep(2000);
		hp.clickOnMyAccount();
		Thread.sleep(5000);
		hp.clickOnSignup();
		Thread.sleep(5000);
		

	}

	/*@Test(priority = '1')
	public void clickOnLogin() throws InterruptedException {

		Thread.sleep(2000);
		hp.clickOn();
		Thread.sleep(2000);
		hp.clickOnCabRental();
		Thread.sleep(2000);

	}*/

	@AfterClass
	public void CloseApp() {

		driver.quit();
	}

}
