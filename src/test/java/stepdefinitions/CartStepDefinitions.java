package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CartPage;
import pages.PageManager;
import pages.StorePage;
import pojos.Product;

public class CartStepDefinitions {
 
	 
	@Then("I should see {int} {product} in the cart page")
	public void i_should_see_in_the_cart_page(Integer int1, Product product) {
		
		 PageManager.getSp().navigateToCart();
	    Assert.assertEquals(product.getProductName(), PageManager.getCp().getProduct());
	    Assert.assertEquals(String.valueOf(int1), PageManager.getCp().getProductCount());
	}
	
	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart() {
		PageManager.getSp().addToCart("Blue Shoes").navigateToCart();
		
	}
	
}
