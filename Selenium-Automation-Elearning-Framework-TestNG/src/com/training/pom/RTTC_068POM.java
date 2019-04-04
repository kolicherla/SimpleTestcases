package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_068POM {
private WebDriver driver; 
	
	public RTTC_068POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//********** admin**************
	
			@FindBy(name="username")
			private WebElement userNameadmin; 
			
			@FindBy(name="password")
			private WebElement passwordadmin;
			
			@FindBy(xpath="//button[@type='submit']")
			private WebElement loginBtnadmin; 
			
			@FindBy(id="button-menu")
			private WebElement menubtn; 
			
			@FindBy(xpath="//span[contains(text(),'Catalog')]")
			private WebElement catalog;
			
			@FindBy(xpath="//button[@type='submit']")
			private WebElement Submitbtn;
			
			@FindBy(xpath="//div[@class='alert alert-success']")
			private WebElement SuccessMsg;
			@FindBy(xpath=" //i[@class='fa fa-plus']")
			private WebElement Prod_addicon;
			
			@FindBy(xpath="//input[@placeholder='Product Name']")
			private WebElement ProductName; 
			
			@FindBy(xpath="//input[@id='input-meta-title1']")
			private WebElement MegaTagtitle; 
			
			@FindBy(xpath="//a[contains(text(),'Data')]")
			private WebElement DataTab; 
			
			@FindBy(xpath="//input[@id='input-model']")
			private WebElement Model_Textbox; 
			
			@FindBy(xpath="//input[@id='input-price']")
			private WebElement Model_Price;
			
			@FindBy(xpath="//input[@id='input-quantity']")
			private WebElement Model_Quality;
			
			@FindBy(xpath="//a[contains(text(),'Links')]")
			private WebElement LinkTab;
			
			@FindBy(xpath="//input[@id='input-category']")
			private WebElement Link_Categories;
			
			@FindBy(xpath="//a[@href='#tab-attribute']")
			private WebElement Attributelink;
			
			@FindBy(xpath="//a[@href='#tab-option']")
			private WebElement Optionlink;
			
			@FindBy(xpath="//a[@href='#tab-recurring']")
			private WebElement Recurringlink;
			
			@FindBy(xpath="//a[contains(text(),'Discount')]")
			private WebElement Disconnectlink;
			
			@FindBy(xpath="//a[contains(text(),'Special')]")
			private WebElement Speciallink;
			
			@FindBy(xpath="//a[contains(text(),'Image')]")
			private WebElement Imagelink;
			
			@FindBy(xpath="//a[@href='#tab-reward']")
			private WebElement rewardPointlink;
			
			@FindBy(xpath="//a[contains(text(),'Design')]")
			private WebElement Designlink;
			
			@FindBy(xpath="//a[contains(text(),'Products')]")
			private WebElement productlnk; 
			
			
			
			
			public  void sendUserName(String userName) {
				this.userNameadmin.clear();
				this.userNameadmin.sendKeys(userName);
		}
		
		public void sendPassword(String password) {
			this.passwordadmin.clear(); 
			this.passwordadmin.sendKeys(password); 
		}
		
		public void clickLoginBtn() {
			this.loginBtnadmin.click(); 
}
		public void clickCatalog() {
			this.catalog.click(); 
}
		
		public void clickMenuButton() {
			this.menubtn.click(); 
}
		public void clickAddnewicon() {
			this.Prod_addicon.click(); 
}
		public String saveSuccessMsg() {
			return this.SuccessMsg.getText();
}
		public void clickproductlink() {
			this.productlnk.click(); 
}
				public void sendProductName_Prodlnk(String productnameedit) {
			this.ProductName.clear();
			this.ProductName.sendKeys(productnameedit);
			
}	
		public void sendManage_Title(String ManagetitleEdit) {
			this.MegaTagtitle.clear();
			this.MegaTagtitle.sendKeys(ManagetitleEdit);
			
}	
		public void Datatablnk() {
			this.DataTab.click(); 
}
		public void sendModeltextbox(String modeltexbox) {
			this.Model_Textbox.clear();
			this.Model_Textbox.sendKeys(modeltexbox);
			
}	
		public void sendModelprice(String modelpricetexbox) {
			this.Model_Price.clear();
			this.Model_Price.sendKeys(modelpricetexbox);
			
}	
		public void sendModelQuantity(String modelQuanitytexbox) {
			this.Model_Quality.clear();
			this.Model_Quality.sendKeys(modelQuanitytexbox);
			
}	
		public void linkTab() {
			this.LinkTab.click(); 
}
		public void linkCategories() {
			this.Link_Categories.click(); 
}
		public void Attribute() {
			this.Attributelink.click(); 
}
		public void Option() {
			this.Optionlink.click(); 
}
		public void Recurring() {
			this.Recurringlink.click(); 
}
		public void Disconnect() {
			this.Disconnectlink.click(); 
}
		public void spcial() {
			this.Speciallink.click(); 
}
		public void Image() {
			this.Imagelink.click(); 
}
		public void rewardPoint() {
			this.rewardPointlink.click(); 
}
		public void Design() {
			this.Designlink.click(); 
}
		public void clickSubmit() {
			this.Submitbtn.click(); 
}
}
