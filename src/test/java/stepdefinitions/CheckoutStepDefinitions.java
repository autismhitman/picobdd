package stepdefinitions;

import org.testng.Assert;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageManager;

public class CheckoutStepDefinitions {
	 
	 
	TestContext context;
	
	public CheckoutStepDefinitions(TestContext context) {
		
		this.context= context;
	}
	
	
	@When("I place an order")
	public void i_place_an_order() {
	  
		PageManager.getCop().placeOrder();
	}
	
	
	@When("I provide billing details")
	public void i_provide_billing_details() {
	 
		PageManager.getCop().setBillingDetails(context.billingDetails);
	     		  
	}
	
	@Then("the order should be placed successfully")
	public void the_order_should_be_placed_successfully() {
	   
		Assert.assertEquals("Thank you. Your order has been received.", PageManager.getCop().getNotice());
	}
	
	 @Given("I'm on the Checkout page")
		public void i_m_on_the_checkout_page() {
		 	
		 PageManager.getCp().navigateToCheckoutPage();
		}

}
