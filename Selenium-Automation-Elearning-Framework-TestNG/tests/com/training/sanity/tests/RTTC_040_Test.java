package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RTTC_038POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_040_Test {

	private static final String dependendson = null;
	private WebDriver driver;
	private String baseUrl1;
	private RTTC_038POM rttc038POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		// loginPOM = new LoginPOM(driver);
		rttc038POM = new RTTC_038POM(driver);

		baseUrl1 = properties.getProperty("baseURL1");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl1);
		// Login to the applications
		rttc038POM.sendUserName("admin");
		rttc038POM.sendPassword("admin@123");
		rttc038POM.clickLoginBtn();
		screenShot.captureScreenShot("First");
	}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	// ********************** Click Catalog **********************************
	@Test
	public void ClickCatalog() throws InterruptedException {
		rttc038POM.clickMenuButton();
		rttc038POM.clickCatalog();
		Thread.sleep(500);
		rttc038POM.clickCategorieslink();

	}

	// ********************** Delete Catalog **********************************

	@Test(dependsOnMethods = "ClickCatalog")
	public void DeleteCatalog() throws InterruptedException {
		rttc038POM.CatagoryDelete();
		rttc038POM.CatagoryDeletebtn();
		// accepting javascript alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String Messagetext = rttc038POM.saveSuccessMsg();
		String ActualMessagetext = rttc038POM.saveSuccessMsg();
		Assert.assertEquals(Messagetext, ActualMessagetext);
	}
}
