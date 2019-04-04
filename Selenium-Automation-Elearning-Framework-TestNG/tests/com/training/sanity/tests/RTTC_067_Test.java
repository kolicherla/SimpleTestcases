package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.RTTC_038POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_067_Test {

	private WebDriver driver;
	private String baseUrl1;
	//private LoginPOM loginPOM;
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
       //********************** Click Filter the options **********************************
	
	@Test(dataProvider ="excel-inputs",dataProviderClass = LoginDataProviders.class)
	public void filterTest(String userName,String password,String productname,String Price,String statusvalue,String Modelnum,String Qunatity,String Imagevalue) throws InterruptedException {
		rttc038POM.sendUserName(userName);
		rttc038POM.sendPassword(password);
		rttc038POM.clickLoginBtn();
		rttc038POM.clickMenuButton();
		rttc038POM.clickCatalog();
		rttc038POM.clickproductlink();
		rttc038POM.sendproductName(productname);
		Thread.sleep(1000);
		rttc038POM.sendPrice(Price);
		rttc038POM.clickfilter();
		String Actprodname=rttc038POM.verifyprodname();
		String Expprodname= productname;
		Assert.assertEquals(Actprodname, Expprodname);
		System.out.println("Filterd prododuct is displayed sucessfully------->" +Expprodname   +Actprodname);
		Thread.sleep(1000);
		rttc038POM.Statusdropdown(statusvalue);
		Thread.sleep(1000);
		rttc038POM.sendModelnumber(Modelnum);
		rttc038POM.sendQunatity(Qunatity);
		rttc038POM.Imagedropdown(Imagevalue);
		Thread.sleep(300);
		rttc038POM.clickfilter();
		Thread.sleep(1000);
		String Actmodelnum= rttc038POM.verifymodelnum();
		String Expmodelnum= Modelnum;
		Assert.assertEquals(Actmodelnum, Expmodelnum);
		System.out.println("Filterd Modelnumber is displayed sucessfully------>"+Expmodelnum  + Actmodelnum);
	
		String Actprice= rttc038POM.verifyPrice();
		String ExpPrice= Price;
		Assert.assertEquals(Actprice, ExpPrice);
		System.out.println("Filterd price is displayed sucessfully------->"+ExpPrice + Actprice);
	
		String Actstatus= rttc038POM.verifyStatus();
		String Expstatus= statusvalue;
		Assert.assertEquals(Actstatus, Expstatus);
		System.out.println("Filterd Status is displayed sucessfully------->" +Expstatus  + Actstatus);
	
	} 
	
}
	


