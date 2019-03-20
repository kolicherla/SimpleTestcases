package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_036POM {
private WebDriver driver; 
	
	public RTTC_036POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Ethnic')]")
	private WebElement ClickonEthniclnk; 
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h4[1]/a[1]")
	private WebElement selectIntegerProduct;
	
	
	@FindBy(xpath="//*[@id='button-cart']")
	private WebElement addToCart; 
	
	@FindBy(xpath=" //a[contains(text(),'Checkout')]")
	private WebElement checkout; 
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]")
	private WebElement viewTocartImage; 
	
	@FindBy(xpath="//div[@class='cart-info tb_min_w_500']//a[contains(text(),'Integer vitae iaculis massa')]")
	private WebElement viewTocartProductName; 
	
	
	@FindBy(xpath=" //td[contains(text(),'SKU-003')]")
	private WebElement viewTocartModel; 
	
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement viewTocartQunatity; 
	
	@FindBy(xpath="//td[@class='price'][contains(text(),'Rs.829')]")
	private WebElement viewTocartUnitprice; 
	
	@FindBy(xpath="//div[@class='cart-info tb_min_w_500']//td[@class='total'][contains(text(),'Rs.829')]")
	private WebElement viewTocartTotalPrice; 
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement checkoutContinue; 
	
	@FindBy(xpath="//div[@class='panel-collapse collapse in']//input[@value='Continue']")
	private WebElement panelContinue; 
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement inputContinue; 
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement inputvalueContinue; 
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement paymentmethod; 
	
	@FindBy(xpath="//input[@value='Confirm Order']")
	private WebElement confirmorder; 
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement lastContinue; 
	
	@FindBy(xpath=" //span[contains(text(),'MY ACCOUNT')]")
	private WebElement usericonaMyaccount; 
	
	@FindBy(xpath="//span[contains(text(),'MY ORDERS')]")
	private WebElement usericonaMyorders; 
	
	@FindBy(xpath=" //span[contains(text(),'MY ORDERS')]")
	private WebElement usericonaMyordersClick; 
	
	
	@FindBy(xpath="//span[contains(text(),'LOGOUT')]")
	private WebElement usericonaLogout; 
	
	@FindBy(xpath="//tr[1]//td[7]//a[1]//i[1]")
	private WebElement orderview; 
	
	@FindBy(xpath="//i[@class='fa fa-reply']")
	private WebElement orderReturn;
	
	@FindBy(xpath="//div[@class='col-sm-10']//div[1]//label[1]//input[1]")
	private WebElement ReasonforReturn;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submitbutton;
	
	@FindBy(xpath="//div[@class='tb_text_wrap tb_sep']")
	private WebElement ConfirmationMsg;
	
	public void clickEthniclink() {
	this.ClickonEthniclnk.click(); 
}

	public void productClick() {
		this.selectIntegerProduct.click(); 
	}
public void addtocarttClick() {
	this.addToCart.click(); 
}

public void checkoutClick() {
	this.checkout.click(); 
}

public String viewcartProdname() {
	return this.viewTocartProductName.getText();
}
public String viewcartModel() {
	return this.viewTocartModel.getText(); 
}
public void checkout_Continue() {
	this.checkoutContinue.click(); 
}

public void panel_Continue() {
	this.panelContinue.click(); 
}
public void input_Continue() {
	this.inputContinue.click(); 
}

public void input_value_Continue() {
	this.inputvalueContinue.click(); 
}

public void payment_Continue() {
	this.paymentmethod.click(); 
}
public void confirm_order() {
	this.confirmorder.click(); 
}

public void last_Continue() {
	this.lastContinue.click(); 
}
public String myaccount() {
	return this.usericonaMyaccount.getText(); 
}

public String myorders() {
	return this.usericonaMyorders.getText(); 
}

public String myLogOut() {
	return this.usericonaLogout.getText(); 

}
public void myorderClick() {
	 this.usericonaMyordersClick.click();
	
}
public void viewOrder(){
	this.orderview.click();
}

public void returnOrderlink(){
	this.orderReturn.click();
}
public void return_For_reason(){
	this.ReasonforReturn.click();
}
public void submit_prod_info(){
	this.Submitbutton.click();
}
public String Return_confir_Msg() {
	return this.ConfirmationMsg.getText(); 
}

}


