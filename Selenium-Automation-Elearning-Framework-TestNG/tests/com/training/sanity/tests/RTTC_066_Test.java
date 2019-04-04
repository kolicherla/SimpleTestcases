package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.RTTC_038POM;
import com.training.pom.RTTC_068POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_066_Test {
	private WebDriver driver;
	private String baseUrl1;
	private RTTC_068POM rttc068POM;
	private RTTC_038POM rttc038POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUp() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	//loginPOM = new LoginPOM(driver);
	rttc068POM = new RTTC_068POM(driver);
	rttc038POM = new RTTC_038POM(driver);
	baseUrl1 = properties.getProperty("baseURL1");
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(baseUrl1);	
}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
           //********************** Click Catalog **********************************
	@Test(dataProvider ="excel-inputs3",dataProviderClass = LoginDataProviders.class)
	public void categoryDetails(String userName,String password,String categoryname,String descriptiontext,String metatagtitle,String MegatagDesc) throws InterruptedException {
		rttc068POM.sendUserName(userName);
		rttc068POM.sendPassword(password);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		rttc068POM.clickLoginBtn();
		rttc038POM.clickMenuButton();
		rttc038POM.clickCatalog();
		Thread.sleep(500);
		rttc038POM.clickCategorieslink();
		rttc038POM.clickAddnewicon();
		rttc038POM.sendCategoryName(categoryname);
		rttc038POM.sendDescription(descriptiontext);
		rttc038POM.sendMetaTagTitle(metatagtitle);
		rttc038POM.sendMetaTagDesc(MegatagDesc);
		rttc038POM.clickDatatab();
		rttc038POM.clickdesignTab();
		rttc038POM.clickSubmit();
		String Messagetext= rttc038POM.saveSuccessMsg();
		String ActualMessagetext= rttc038POM.saveSuccessMsg();
		Assert.assertEquals(Messagetext, ActualMessagetext);
	}
}


