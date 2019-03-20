package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_036POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_037_Test {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@Test
	public void InvalidLogin() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
		// Login to the applications
		loginPOM.sendUserName("kolicherla1@gmail.com");
		boolean Actuesrnmae= driver.findElement(By.name("email")).isDisplayed();
		Assert.assertTrue(true,"kolicherla1@gmail.com");
		loginPOM.sendPassword("manipal1233");
		boolean Actpasswpord= driver.findElement(By.name("password")).isDisplayed();
		Assert.assertTrue(true,"manipal1233");
		loginPOM.clickLoginBtn();
		String errorTest=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		String erroract= "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(errorTest, erroract);
		screenShot.captureScreenShot("First");
	}
	@Test
	public void Invalidloginmessage() throws Exception { Thread.sleep(1000);
	  driver.quit(); 
}
}

