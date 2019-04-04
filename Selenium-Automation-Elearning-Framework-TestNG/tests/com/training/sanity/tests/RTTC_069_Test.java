package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.RTTC_068POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_069_Test {
	private WebDriver driver;
	private String baseUrl1;
	//private LoginPOM loginPOM;
	private RTTC_068POM rttc068POM;
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
       //********************** Click product the options **********************************
	
	@Test(dataProvider ="excel-inputs2",dataProviderClass = LoginDataProviders.class)
	public void VerifyMsg(String userName,String password,String productnameedit,String ManagetitleEdit,String modeltexbox,String modelpricetexbox,String modelQuanitytexbox) throws InterruptedException {
		rttc068POM.sendUserName(userName);
		rttc068POM.sendPassword(password);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		rttc068POM.clickLoginBtn();
		rttc068POM.clickMenuButton();
		rttc068POM.clickCatalog();
		rttc068POM.clickproductlink();
		rttc068POM.clickAddnewicon();
		rttc068POM.sendProductName_Prodlnk(productnameedit);
		rttc068POM.sendManage_Title(ManagetitleEdit);
		rttc068POM.Datatablnk();
		rttc068POM.sendModeltextbox(modeltexbox);
		rttc068POM.sendModelprice(modelpricetexbox);
		rttc068POM.sendModelQuantity(modelQuanitytexbox);
		rttc068POM.linkTab();
		rttc068POM.linkCategories();
		rttc068POM.Attribute();
		rttc068POM.Option();
		rttc068POM.Recurring();
		Thread.sleep(1000);
		rttc068POM.Disconnect();
		rttc068POM.spcial();
		rttc068POM.Image();
		rttc068POM.rewardPoint();
		rttc068POM.Design();
		rttc068POM.clickSubmit();
}
}
