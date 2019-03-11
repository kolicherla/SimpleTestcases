package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_010POM {
private WebDriver driver; 
	
	public RTTC_010POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Ethnic')]")
	private WebElement ClickonEthniclnk; 
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h4[1]/a[1]")
	private WebElement selectIntegerProduct;
	
	
	@FindBy(xpath="//*[@id='button-cart']")
	private WebElement addToCart; 
	
	@FindBy(xpath="//a[contains(text(),'View Cart')]")
	private WebElement viewTocart; 
	
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
	
	
	@FindBy(xpath="//i[@class='fa fa-refresh']")
	private WebElement Emptybag;
	
	@FindBy(xpath="//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement bagEmptyMsg;
	
	
	
	
	public void clickEthniclink() {
	this.ClickonEthniclnk.click(); 
}

	public void productClick() {
		this.selectIntegerProduct.click(); 
	}
public void addtocarttClick() {
	this.addToCart.click(); 
}

public void viewcartClick() {
	this.viewTocart.click(); 
}
public void viewcartModel() {
	this.viewTocartModel.click(); 
}

public void shopBagEmpty() {
	this.Emptybag.click(); 
}

public String ShopBagemptyMsg() {
	return this.bagEmptyMsg.getText(); 
}
public String viewcartProdname() {
	return this.viewTocartProductName.getText(); 
}

}







