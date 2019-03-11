package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_008POM {
private WebDriver driver; 
	
	public RTTC_008POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Ethnic')]")
	private WebElement ClickonEthniclnk; 
	//@FindBy(xpath="//div[@class='sort']//select[@onchange='location = this.value;']")
	//private WebElement sorybylist;
	
	/*@FindBy(name="confirm")
	private WebElement confirmpassword; 
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continuebtn;*/
	
	
	
	/* public void sendChangedpassword(String newpassword) {
		this.newpassword.clear();
		this.newpassword.sendKeys(newpassword);
}

public void sendConfirmPassword(String confirmpassword) {
	this.confirmpassword.clear(); 
	this.confirmpassword.sendKeys(confirmpassword); 
}*/
	
public void clickEthniclink() {
	this.ClickonEthniclnk.click(); 
}

}




