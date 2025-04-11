package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.StorePage;
import pojos.BillingDetails;

public class CheckoutSteps {
	
	StorePage sp ;
	CartPage cp;
	CheckoutPage cop ;
	BillingDetails billingDetails;
	 
	@Given("I'm a guest customer")
	public void i_m_a_guest_customer() {
		sp= new StorePage().navigateToStore();

	}
	
	@Given("my billing details are")
	public void my_billing_details_are(BillingDetails billingDetails) {
	   this.billingDetails = billingDetails;
	 
	}
	
	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart() {
	  cp= sp.addToCart("Blue Shoes").navigateToCart();
		
	}
	
	@Given("I'm on the Checkout page")
	public void i_m_on_the_checkout_page() {
	 	
		cp.navigateToCheckoutPage();
	}
	
	
	@When("I provide billing details")
	public void i_provide_billing_details() {
	 
		  cop = new CheckoutPage().setBillingDetails(billingDetails);
	     		  
	}
	
	@When("I place an order")
	public void i_place_an_order() {
	  
		cop.placeOrder();
	}
	
	
	@Then("the order should be placed successfully")
	public void the_order_should_be_placed_successfully() {
	   
		Assert.assertEquals("Thank you. Your order has been received.", cop.getNotice());
	}

}
