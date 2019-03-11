package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_006POM {
private WebDriver driver; 
	
	public RTTC_006POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Change your password")
	private WebElement ChangePasswordlink; 
	
	@FindBy(name="password")
	private WebElement newpassword;
	
	@FindBy(name="confirm")
	private WebElement confirmpassword; 
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continuebtn;
	
	public void changePasswordlink(){
		this.ChangePasswordlink.click();
	}
	
	public void sendChangedpassword(String newpassword) {
		this.newpassword.clear();
		this.newpassword.sendKeys(newpassword);
}

public void sendConfirmPassword(String confirmpassword) {
	this.confirmpassword.clear(); 
	this.confirmpassword.sendKeys(confirmpassword); 
}

public void clickcontinuebtn() {
	this.continuebtn.click(); 
}

}
