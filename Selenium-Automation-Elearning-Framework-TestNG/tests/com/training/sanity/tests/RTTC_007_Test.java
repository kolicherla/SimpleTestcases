package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_007POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_007_Test {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RTTC_007POM rttc07POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		rttc07POM= new RTTC_007POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
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
	      // Validating message to verify password and confirm password not  same.
	@Test
		public void invalidPwChangeTest() {
			rttc07POM.changePasswordlink();
			rttc07POM.sendChangedpassword("password456");
			rttc07POM.sendConfirmPassword("password4561");
			rttc07POM.clickcontinuebtn();
			String expected  = "Password confirmation does not match password!";
			String actual = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
			Assert.assertEquals(expected, actual);
			screenShot.captureScreenShot("First");
			
			
			
	}

		
		
}



