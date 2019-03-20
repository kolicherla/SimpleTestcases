package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_008POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_008_Test {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RTTC_008POM rttc08POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		rttc08POM= new RTTC_008POM(driver);
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
	//public void tearDown() throws Exception {
		//Thread.sleep(1000);
		//driver.quit();
	//}
	   
	   @Test   
		public void ethniclnkClikc() throws InterruptedException {
		   Actions action = new Actions(driver);
		   WebElement shopnowmenu = driver.findElement(By.xpath("//span[contains(text(),'Shop Now')]"));
		   action.moveToElement(shopnowmenu).build().perform();  
		   rttc08POM.clickEthniclink();
	   Select oSelect = new Select(driver.findElement(By.xpath("//div[@class='sort']//select[@onchange='location = this.value;']")));
	   List <WebElement> elementCount = oSelect.getOptions();
	   System.out.println(elementCount);
	   int iSize = elementCount.size();
	   for(int i =0; i<iSize ; i++){
	   String sValue = elementCount.get(i).getText();
	   System.out.println(sValue);
	   
	   }
	          oSelect.selectByIndex(1);
	          Select oSelect1 = new Select(driver.findElement(By.xpath("//div[@class='sort']//select[@onchange='location = this.value;']")));
	          oSelect1.selectByIndex(5);
	          
	       
	      
	       
	       
}

}