package pages;

import java.nio.charset.StandardCharsets;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.EndPoints;
import drivers.DriverManager;
import util.SeleniumUtils;

public class StorePage {
	
    By viewCartBtn = By.xpath("//a[@class='added_to_cart wc-forward']");
	
	public StorePage navigateToStore() {
		String url= DriverManager.getDriver().getCurrentUrl();
		DriverManager.getDriver().get(url +EndPoints.STORE.url);
		return this;
	}
	
	
	public StorePage addToCart(String productName) {	 
	        String raw = "a[aria-label='Add “" + productName + "” to your cart']";
	        byte[] bytes = raw.getBytes(StandardCharsets.UTF_8);
	        String utf8Encoded = new String(bytes, StandardCharsets.UTF_8);
	        By addToCartBtn = By.cssSelector(utf8Encoded);
	    	WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	    	wait.until((d)->d.findElement(addToCartBtn)).click();
			return this;	
				
	}
	
	public CartPage navigateToCart() {
		
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
    	wait.until((d)->d.findElement(viewCartBtn)).click();	 
		return new CartPage();
	}
	

}







/*

By search_field = By.cssSelector("input.search-field");
By search_btn= By.xpath("//button[@type='submit' and @value='Search']");

*/

/*List<WebElement> pBox = DriverManager.getDriver().findElements(By.cssSelector("li.ast-col-sm-12.ast-article-post.astra-woo-hover-swap"));

for(WebElement e : pBox) {
	
	if(e.findElement(By.cssSelector("h2")).getText().equalsIgnoreCase(product)){
		e.findElement(By.xpath("//*[text()='Add to cart']")).click();
	}
}

public void searchProduct(String product) {
		
		WebElement productBox= DriverManager.getDriver().findElement(By.cssSelector("div.summary.entry-summary"));
		
		String actualProduct= productBox.findElement(By.cssSelector("h1")).getText();
		
		if(actualProduct.equalsIgnoreCase(product)) {
			
			productBox.findElement(By.cssSelector("button[type='submit']")).click();
		}
	}
	
*/