package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_038POM {
private WebDriver driver; 
	
	public RTTC_038POM(WebDriver driver) {
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
			
			@FindBy(xpath="//a[contains(text(),'Categories')]")
			private WebElement categorieslnk; 
			
			
			@FindBy(xpath="//i[@class='fa fa-plus']")
			private WebElement addNewIcon;
			
			@FindBy(id="input-name1")
			private WebElement CategoryText;
			
			@FindBy(xpath="//div[@class='note-editable panel-body']")
			private WebElement DescriptionText;
			
			
			@FindBy(id="input-meta-title1")
			private WebElement MetaTagTile;

			@FindBy(id="input-meta-description1")
			private WebElement MetaTagDescriptoin;
			
			@FindBy(xpath="//a[contains(text(),'Data')]")
			private WebElement Datatab;
			
			
			@FindBy(xpath="//a[contains(text(),'Design')]")
			private WebElement Designtab;
			
			@FindBy(xpath="//button[@type='submit']")
			private WebElement Submitbtn;
			
			@FindBy(xpath="//div[@class='alert alert-success']")
			private WebElement SuccessMsg;
			
			
			@FindBy(xpath="//tr[1]//td[4]//a[1]")
			private WebElement CategoryEdit;
			
			@FindBy(id="input-meta-title1")
			private WebElement MetaTagTileClear_modify;
			
			@FindBy(xpath="//tr[3]//td[1]")
			private WebElement DeleteCatagory;
			
			@FindBy(xpath="//i[@class='fa fa-trash-o']")
			private WebElement DeleteCatagortbtn;
			
			
			public void sendUserName(String userName) {
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
		public void clickCategorieslink() {
			this.categorieslnk.click(); 
}
		public void clickAddnewicon() {
			this.addNewIcon.click(); 
}
		public void sendCategoryName(String categoryname) {
			this.CategoryText.clear();
			this.CategoryText.sendKeys(categoryname);
}
		
		public void sendDescription(String descriptiontext) {
			this.DescriptionText.clear();
			this.DescriptionText.sendKeys(descriptiontext);
}
		public void sendMetaTagTitle(String metatagtitle) {
			this.MetaTagTile.clear();
			this.MetaTagTile.sendKeys(metatagtitle);
}
		public void sendMetaTagDesc(String MegatagDesc) {
			this.MetaTagDescriptoin.clear();
			this.MetaTagDescriptoin.sendKeys(MegatagDesc);
}
		public void clickDatatab() {
			this.Datatab.click(); 
}
		public void clickdesignTab() {
			this.Designtab.click(); 
}
		public void clickSubmit() {
			this.Submitbtn.click(); 
}
		public String saveSuccessMsg() {
			return this.SuccessMsg.getText();
}
		public void clickCategoryedit() {
			this.CategoryEdit.click(); 
	}
		public void Clear_ModifyMetaTagTitle(String metatagtitleedit) {
			this.MetaTagTileClear_modify.clear();
			this.MetaTagTileClear_modify.sendKeys(metatagtitleedit);
		}
		public void CatagoryDelete() {
			this.DeleteCatagory.click();
		}
		public void CatagoryDeletebtn() {
			this.DeleteCatagortbtn.click();
		}
		
}