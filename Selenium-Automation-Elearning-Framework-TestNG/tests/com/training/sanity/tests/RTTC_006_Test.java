package com.training.sanity.tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_006POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;



public class RTTC_006_Test   {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RTTC_006POM rttc06POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		rttc06POM= new RTTC_006POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	String s=	driver.findElement(By.tagName(baseUrl)).getText();
	    driver.getTitle();
		//Login to the applications
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
	               // Validating message to verify password and confirm password are same.
	@Test   
		public void validPwChangeTest() {
			rttc06POM.changePasswordlink();
			//rttc06POM.changePasswordlink();
			rttc06POM.sendChangedpassword("manipal");
			rttc06POM.sendConfirmPassword("manipal");
			rttc06POM.clickcontinuebtn();
			driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			String expected  = "Success: Your";
			String actual = "Success: Your password has been successfully updated.";
			Assert.assertTrue(actual.contains(expected));//it works
			//Assert.assertSame(expected, actual);not works
			//Assert.assertEquals(actual.contains(expected), false);
			//String expected  = "Success: Your password has been successfully updated.";
			//String actual = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			//Assert.assertEquals(expected, actual);
			screenShot.captureScreenShot("First");
			
	}

	
}

