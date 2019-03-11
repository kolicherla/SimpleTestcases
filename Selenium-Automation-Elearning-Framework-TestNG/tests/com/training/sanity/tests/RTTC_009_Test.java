package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_009POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_009_Test {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RTTC_009POM rttc009POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		rttc009POM = new RTTC_009POM(driver);
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

	/*
	 * @AfterTest public void tearDown() throws Exception { Thread.sleep(1000);
	 * driver.quit(); }
	 */
	@Test
	public void productintegerclick() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement shopnowmenu = driver.findElement(By.xpath("//span[contains(text(),'Shop Now')]"));
		action.moveToElement(shopnowmenu).build().perform();
		rttc009POM.clickEthniclink();
		rttc009POM.productClick();
		Thread.sleep(4000);
		// driver.findElement(By.id("button-cart")).click();
		String parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();

		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				Thread.sleep(4000);
				rttc009POM.addtocarttClick();
				Thread.sleep(3000);
				Actions actionshop = new Actions(driver);
				WebElement shopbag = driver.findElement(By.xpath("//i[@class='tb_icon ico-linea-ecommerce-bag']"));
				action.moveToElement(shopbag).build().perform();
				Thread.sleep(3000);
				rttc009POM.viewcartClick();
				String Expprodname = "Integer vitae iaculis massa";
				String Actualname =rttc009POM.viewcartProdname();
				//String Actualname = driver.findElement(By.xpath("//div[@class='cart-info tb_min_w_500']//a[contains(text(),'Integer vitae iaculis massa')]")).getText();
				Assert.assertEquals(Expprodname, Actualname);
				String ActualModel= rttc009POM.viewcartModel();
				String ExpModel = "SKU-003";
				Assert.assertEquals(Expprodname, Actualname);
			}

		}

	}
}
