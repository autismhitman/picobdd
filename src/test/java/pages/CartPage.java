package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverManager;

public class CartPage {
	 
	By productName = By.cssSelector("td[class='product-name'] a");
	By qtyField = By.xpath("//input[@type='number']");
	By checkoutbtn = By.cssSelector(".checkout-button.button.alt.wc-forward");
	
	
	public String getProduct() {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		return wait.until((d)->d.findElement(productName)).getText();
		 
	}
	
    public String getProductCount() {
    	WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		return wait.until((d)->d.findElement(qtyField)).getDomAttribute("value");
	}
    
    public CheckoutPage navigateToCheckoutPage() {
    	
    	DriverManager.getDriver().findElement(checkoutbtn).click();
    	return new CheckoutPage();
    }
 
}







/*  public static boolean checkProduct(String product) {

WebElement table = DriverManager.getDriver().findElement(By.cssSelector("table.shop_table.shop_table_responsive.cart"));

List<WebElement> row =  table.findElements(By.xpath("//tbody/tr")) ;


for(int i=0; i<row.size()-1; i++) {
	  
	String aProd= table.findElement(By.xpath("//tbody/tr["+i+"]/td[3]")).getText();
	  
	if(aProd.equalsIgnoreCase(aProd)) {
	    
		return true;
		 
	}
	 
}
return false;


}
*/