package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.StorePage;
import pojos.Product;

public class AddToCartSteps {
	
	StorePage sp ;
	CartPage cp;
	
	@Given("I am on the store page")
	public void i_am_in_the_store_page() {
		sp= new StorePage().navigateToStore();
	}

	@When("I add a {product} to the cart")
	public void i_add_a_to_the_cart(Product product) {
		
		sp.addToCart(product.getProductName());
		 
	}

	@Then("I should see {int} {product} in the cart page")
	public void i_should_see_in_the_cart_page(Integer int1, Product product) {
		
		cp = sp.navigateToCart();
	    Assert.assertEquals(product.getProductName(), cp.getProduct());
	    Assert.assertEquals(String.valueOf(int1), cp.getProductCount());
	}

}
