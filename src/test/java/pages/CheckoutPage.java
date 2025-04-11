package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverManager;
import pojos.BillingDetails;

public class CheckoutPage {
 
	By fname = By.id("billing_first_name");
	By lname = By.id("billing_last_name");
	By baddres = By.id("billing_address_1");
	By cityField= By.id("billing_city");
	By stateField = By.id("billing_state");
	By zipField = By.id("billing_postcode");
	By emailField = By.id("billing_email");
	By placeOrderBtn = By.id("place_order");
	By noticeText= By.cssSelector(".woocommerce-notice");
	By overLay = By.cssSelector(".blockUI.blockOverlay");
	
	
	public CheckoutPage enterBillingFirstName(String billingFirstName) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		wait.until((d)->d.findElement(fname)).sendKeys(billingFirstName);		
		return this;
	}
	
	public CheckoutPage enterBillingLastName(String billingLastName) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		wait.until((d)->d.findElement(lname)).sendKeys(billingLastName);		
		return this;
	}
	
	public CheckoutPage enterBillingAddress(String billingAddress) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		wait.until((d)->d.findElement(baddres)).sendKeys(billingAddress);		
		return this;
	}
	
	public CheckoutPage enterCity(String city) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		wait.until((d)->d.findElement(cityField)).sendKeys(city);		
		return this;
	}
	
	public CheckoutPage enterState(String state) {

        Select select  = new Select(DriverManager.getDriver().findElement(stateField));
        select.selectByVisibleText(state);
		return this;
	}
	
	
	public CheckoutPage enterZip(String zipcode) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		wait.until((d)->d.findElement(zipField)).sendKeys(zipcode);		
		return this;
	}
	
	public CheckoutPage enterEmail(String email) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		wait.until((d)->d.findElement(emailField)).sendKeys(email);		
		return this;
	}
	
	public CheckoutPage placeOrder() {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		wait.until((d)->d.findElement(placeOrderBtn)).click();
		return this;
	}
	
	public CheckoutPage setBillingDetails(BillingDetails billingdetails) {
		
		  return enterBillingFirstName(billingdetails.getBillingFirstName())
				  .enterBillingLastName(billingdetails.getBillingLastName())
				  .enterBillingAddress(billingdetails.getBillingAddressOne())
				  .enterCity(billingdetails.getBillingCity())
				  .enterState(billingdetails.getBillingStateName())
				  .enterZip(billingdetails.getBillingZip())
				  .enterEmail(billingdetails.getBillingEmail());
		
	}
	
	public String getNotice() {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		return wait.until((d)->d.findElement(noticeText)).getText()	;
	}
}











