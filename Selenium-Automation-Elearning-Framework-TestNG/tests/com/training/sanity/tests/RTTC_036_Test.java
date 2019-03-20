package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_036POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_036_Test {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RTTC_036POM rttc036POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		rttc036POM = new RTTC_036POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
		// Login to the applications
		loginPOM.sendUserName("kolicherla@gmail.com");
		loginPOM.sendPassword("manipal123");
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot("First");
	}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	// ***************** Placing order************************************
	@Test
	public void productintegerclick() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement shopnowmenu = driver.findElement(By.xpath("//span[contains(text(),'Shop Now')]"));
		action.moveToElement(shopnowmenu).build().perform();
		rttc036POM.clickEthniclink();
		Thread.sleep(4000);
		rttc036POM.productClick();
		Thread.sleep(4000);
		// driver.findElement(By.id("button-cart")).click();
		String parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();

		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				
				Thread.sleep(4000);
				rttc036POM.addtocarttClick();
				Actions actionshop = new Actions(driver);
				WebElement shopbag = driver.findElement(By.xpath("//i[@class='tb_icon ico-linea-ecommerce-bag']"));
				action.moveToElement(shopbag).build().perform();
				Thread.sleep(3000);
				rttc036POM.checkoutClick();
				rttc036POM.checkout_Continue();
				Thread.sleep(3000);
				// rttc036POM.checkout_Continue();
				rttc036POM.panel_Continue();
				Thread.sleep(3000);
				rttc036POM.input_Continue();
				Thread.sleep(3000);
				rttc036POM.input_value_Continue();
				Thread.sleep(3000);
				rttc036POM.payment_Continue();
				rttc036POM.confirm_order();
				rttc036POM.last_Continue();
				//driver.switchTo().window(pa);
				// **************************** Click on My order******************************
				// ****************************************************************************
				Actions action1 = new Actions(driver);
				WebElement usericon = driver.findElement(By.xpath("//i[@class='fa fa-user-o']"));
				action1.moveToElement(usericon).build().perform();
				Thread.sleep(500);
				System.out.println(usericon);
				String expectedValue = "MY ACCOUNT";
				String actualValue = rttc036POM.myaccount();
				Assert.assertEquals(expectedValue, actualValue);
				String expectedOtext = "MY ORDERS";
				String actualOtext = rttc036POM.myorders();
				Assert.assertEquals(expectedOtext, actualOtext);
				String expectedtext = "LOGOUT";
				String actualtext = rttc036POM.myLogOut();
				Assert.assertEquals(expectedtext, actualtext);
				Thread.sleep(3000);
				rttc036POM.myorderClick();
				rttc036POM.viewOrder();
				rttc036POM.returnOrderlink();
				rttc036POM.return_For_reason();
				rttc036POM.submit_prod_info();
				String returnText = rttc036POM.Return_confir_Msg();
				System.out.println("Product Return Message: " + returnText);
				
			}

		}
	}

}
