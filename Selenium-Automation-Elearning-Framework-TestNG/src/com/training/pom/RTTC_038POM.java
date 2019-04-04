package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
			
			///Product link page xpath
			@FindBy(xpath="//a[contains(text(),'Products')]")
			private WebElement productlnk; 
			
			@FindBy(xpath="//input[@name='filter_name']")
			private WebElement enter_productname; 
			
			@FindBy(xpath="//input[@id='input-price']")
			private WebElement enter_price; 
			
			@FindBy(xpath="//button[@id='button-filter']")
			private WebElement filter_btn; 
			
			@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody/tr/td[3]")
			private WebElement veirfy_prod_name; 
			
			
			@FindBy(xpath="//select[@name='filter_status']")
			private WebElement Status_value; 
			
			@FindBy(xpath="//input[@id='input-model']")
			private WebElement Model_value; 
			
			@FindBy(xpath="//input[@id='input-quantity']")
			private WebElement Quality_value; 
			
			@FindBy(xpath="//select[@name='filter_image']")
			private WebElement Image_value; 
			
			@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody/tr/td[4]")
			private WebElement veirfy_model_name; 
			
			@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody/tr/td[5]")
			private WebElement veirfy_price; 
			
			@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody/tr/td[7]")
			private WebElement veirfy_Status; 
			
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
		public void clickproductlink() {
			this.productlnk.click(); 
}
		
		
		public void clickAddnewicon() {
			this.addNewIcon.click(); 
}
		  
		public void sendCategoryName(String categoryname) {
			this.CategoryText.clear();
			this.CategoryText.sendKeys(categoryname);
}
		public void sendproductName(String productname) {
			this.enter_productname.clear();
			this.enter_productname.sendKeys(productname);
		}
		
		public void sendPrice(String Price) {
			this.enter_price.clear();
			this.enter_price.sendKeys(Price);
		}
		
		public void Statusdropdown(String statusvalue) {
			this.Status_value.sendKeys(statusvalue);
		}
		
		public void sendModelnumber(String Modelnum) {
			this.Model_value.clear();
			this.Model_value.sendKeys(Modelnum);
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
		public void clickfilter() {
			this.filter_btn.click(); 
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
		public String verifyprodname() {
			return this.veirfy_prod_name.getText();
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

		public void sendQunatity(String qunatity) {
			this.Quality_value.clear();
			this.Quality_value.sendKeys(qunatity);
			
		}

		public void Imagedropdown(String imagevalue) {
			this.Image_value.sendKeys(imagevalue);
			
		}

		public String verifymodelnum() {
			return this.veirfy_model_name.getText();
	
		
			
		}

		public String verifyPrice() {
			return this.veirfy_price.getText();
		}

		public String verifyStatus() {
			return this.veirfy_Status.getText();
		}
		 
}
